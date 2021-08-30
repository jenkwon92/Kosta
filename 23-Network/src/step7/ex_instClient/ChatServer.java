package step7.ex_instClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatServer {
	/*
	 * ServerSocket 생성 loop accept() ServerWorker 생성 list.add(ServerWorker) Thread
	 * 생성 start()
	 */
	// client와 통신을 하는 객체(ServerWorker>socket)의 리스트를 관리
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("server 접속");
			while (true) {
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				list.add(serverWorker);
				Thread thread = new Thread(serverWorker);
				thread.start();

				
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	/*
	 * 각각의 serverWorker가 클라이언트로 부터 입력받은 메세지를 접속한 전체 클라이언트에게 출력하기 위한 메서드 아래 메서드를 개별
	 * ServerWorker의 run메서드에서 호출해서 사용한다
	 */
	public void sendMessage(String message){

		// for loop 이용해 반복list에 있는 모든 ServerWorker의 pw를 향해서 println();
		for (int i = 0; i < list.size(); i++) {
			try {
				list.get(i).pw = new PrintWriter(list.get(i).socket.getOutputStream(), true);
				list.get(i).pw.println(message);
				list.get(i).pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//list.remove(i);
		}

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
			
			try {
				clientIp  = socket.getInetAddress().toString();
				System.out.println(clientIp +"님이 입장하셨습니다");
				while (true) {
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String message = br.readLine();
					System.out.println("님의 메세지 : "+message);
					sendMessage(message);
					if(message.trim().equalsIgnoreCase("exit")) {
						System.out.println(clientIp +"님이 나가셨습니다");
						break;
					}
					//message = scanner.nextLine();
					
				}
			} finally {
				br.close();
				pw.close();
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
