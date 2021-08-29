package step6.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable {
	private Socket socket;
	private String clientIp;

	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
		clientIp = socket.getInetAddress().toString();
	}

	@Override
	public void run() {
		System.out.println(clientIp + "님 입장하셨습니다");
		try {
			echo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(clientIp + "님이 퇴장하셨습니다");
	}

	public void echo() throws IOException {
		BufferedReader br = null; //client message를 입력
		PrintWriter pw = null; //client message를 출력
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true); //auto flush
			while(true) {
				String message = br.readLine();
				if(message==null || message.equals("exit")) {
					break; //while문 종료
				}
				System.out.println(clientIp+" : "+message);
				pw.println(message+"server");
			}
		}finally {
			if(socket!=null)
				socket.close(); //소켓과 연결되어있는 스트림은 소켓만 끊어줘도 나머지가 끊기기때문에 
		}
	}
}
