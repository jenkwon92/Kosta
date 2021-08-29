package step5.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	/*
	 * 서버는 클라이언트의 접속을 대기 (1대 1통신이므로 accept() 반복 x); 1. 서버는 클라이언트가 보낸 메세지를 입력받아 자신의
	 * 콘솔에 출력 (BufferedReader) 2. 입력받은 메세지를 다시 클라이언트로 출력한다 ("server"를 문자열 끝에 추가)
	 */
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter out = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**EchoServer**");

			socket = serverSocket.accept();
			String clientIp = socket.getInetAddress().toString();
			System.out.println(clientIp + "님이 입장하셨습니다");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);

			while (true) {
				String message = br.readLine();
				System.out.println(clientIp + "님의 메시지 : " + message);

				out.println(message + "**server**");
				if (message.equals("exit"))
					socket.close();
			}

		} finally {

			br.close();
			out.close();
			if (serverSocket != null) {
				serverSocket.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
