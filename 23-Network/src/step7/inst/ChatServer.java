package step7.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

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
	public void go()  {
		
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
