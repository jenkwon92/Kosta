package step6.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
	  		MultiServer : 다수의 Client에게 지속적으로 메아리 서비스
			step5의 EchoClient 프로그램은 그대로 유지되고
			step5의 EchoServer 프로그램을 업데이트한다
			
			하나의 서버가 지속적으로 접속을 유지하면서 다수의 클라이언트에게 서비스하기 위해서는
			프로세스 내부의 세부적 실행단위인 Thread를 이용해야 한다
			(ex- 콜센터에서 다수의 고객과 동시에 상담서비스를 하기 위해 직원을 다수 채용해야 하는 것과 같다)
			
			MultiServer 에서는 클라이언트 접속을 대기하다가 접속하면 해당 클라이언트와 통신하기 위한 
			Socket(전화기)을 반환받아 ServerWorker(직원) 객체 생성시에 할당하고 
			Thread를 생성해 start 시킨다 (이를 반복)
			
			Runnable Interface의 하위인 ServerWorker 는 할당받은 소켓으로
			클라이언트와 메아리 서비스를 진행한다
 */
public class MultiServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter out = null;

		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("Server 실행중");
			socket = serverSocket.accept();
			String clientIp = socket.getInetAddress().toString();
			System.out.println(clientIp + "접속");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			
			while (true) {
				ServerWorker s = new ServerWorker(socket);
				Thread thread = new Thread(s);
				thread.start();
				String message = br.readLine(); // 클라이언트가 보낸 메세지를 입력받는다
				if (message == null || message.equals("exit")) {
					System.out.println(clientIp + "님이 나가셨습니다");
					break;
				}
				System.out.println("님의 메세지 :" + message);
				out.println(message + "*server*"); // 클라이언트로 메세지를 출력한다

			}
		} finally {
			if (out != null)
				out.close();
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
			if (serverSocket != null)
				serverSocket.close();
		}

	}

	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
