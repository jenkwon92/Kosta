package step7.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	/*
	 * ServerSocket 생성 
	 * loop 
	 * accept() 
	 * ServerWorker 생성 
	 * Thread 생성
	 *  start()
	 */
	//client와 통신을 하는 객체(ServerWorker>socket)의 리스트를 관리
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go()  {
		
	}
	/*
	 * 각각의 serverWorker가 클라이언트로 부터 입력받은 메세지를 
	 * 접속한 전체 클라이언트에게 출력하기 위한 메서드
	 * 아래 메서드를 개별 ServerWorker의 run메서드에서 호출해서 사용한다
	 */
	public void sendMessage(String message) {
		
	}
	// nested class
	public class ServerWorker implements Runnable {
		private Socket socket;
		private String clientIp;
		private BufferedReader br; 
		private PrintWriter pw;
			
		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
		}

		public void chatting() {
		}
	}

	public static void main(String[] args) {
		
			new ChatServer().go();
		
	}
}
