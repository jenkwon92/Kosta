package step7.ex_instClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatServer {
	/*
	 * ServerSocket ���� 
	 * loop 
	 * accept() 
	 * ServerWorker ���� 
	 * Thread ����
	 *  start()
	 */
	//client�� ����� �ϴ� ��ü(ServerWorker>socket)�� ����Ʈ�� ����
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go() throws IOException {
		ServerSocket serverSocket =null;
		try {
			serverSocket = new ServerSocket(5432);
			while(true) {
				System.out.println("server ����");
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				list.add(serverWorker);
				Thread serverThread = new Thread(serverWorker);
				serverThread.start();
			}
			
		}finally {
			if(serverSocket != null)
				serverSocket.close();
		}
	}
	/*
	 * ������ serverWorker�� Ŭ���̾�Ʈ�� ���� �Է¹��� �޼����� 
	 * ������ ��ü Ŭ���̾�Ʈ���� ����ϱ� ���� �޼���
	 * �Ʒ� �޼��带 ���� ServerWorker�� run�޼��忡�� ȣ���ؼ� ����Ѵ�
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
			chatting();
		}

		public void chatting() {
			clientIp = socket.getInetAddress().toString();
			try {
				br = new BufferedReader(new socket.getInputStream());
			}finally {
				
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
