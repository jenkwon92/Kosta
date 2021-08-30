package step7.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

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
	public void go() throws IOException {
		ServerSocket serverSocket= null;
		try {
			serverSocket = new ServerSocket(5432);
			while(true){
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				Thread thread = new Thread(serverWorker);
				thread.start();
			}
		}finally {
			if(serverSocket !=null)
				serverSocket.close();
		}
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
		private Scanner scanner;
			
		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void chatting() throws IOException {
			scanner = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(),true);
			while(true) {
				String message = scanner.nextLine();
				pw.println(message);
				if(message==null || message.equals("exit")) {
					System.out.println("ChatClient 종료됩니다");
					break;
				}
				System.out.println(clientIp+" : "+message);
				pw.println(message+"server");
			}
		}
	}

	public static void main(String[] args) {
		try {
			new ChatServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
