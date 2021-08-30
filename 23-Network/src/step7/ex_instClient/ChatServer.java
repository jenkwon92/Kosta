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
	 * ServerSocket ���� loop accept() ServerWorker ���� list.add(ServerWorker) Thread
	 * ���� start()
	 */
	// client�� ����� �ϴ� ��ü(ServerWorker>socket)�� ����Ʈ�� ����
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("server ����");
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
	 * ������ serverWorker�� Ŭ���̾�Ʈ�� ���� �Է¹��� �޼����� ������ ��ü Ŭ���̾�Ʈ���� ����ϱ� ���� �޼��� �Ʒ� �޼��带 ����
	 * ServerWorker�� run�޼��忡�� ȣ���ؼ� ����Ѵ�
	 */
	public void sendMessage(String message){

		// for loop �̿��� �ݺ�list�� �ִ� ��� ServerWorker�� pw�� ���ؼ� println();
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
				System.out.println(clientIp +"���� �����ϼ̽��ϴ�");
				while (true) {
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String message = br.readLine();
					System.out.println("���� �޼��� : "+message);
					sendMessage(message);
					if(message.trim().equalsIgnoreCase("exit")) {
						System.out.println(clientIp +"���� �����̽��ϴ�");
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
