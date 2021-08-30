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
					System.out.println("ChatClient ����˴ϴ�");
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
