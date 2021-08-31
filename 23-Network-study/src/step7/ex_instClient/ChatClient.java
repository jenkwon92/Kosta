package step7.ex_instClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class ChatClient {
	private Socket socket = null;
	private Scanner scanner = null;
	private PrintWriter pw = null;
	private BufferedReader br = null;

	/*
	 * Socket ���� ReceiverWorker ����, Thread ���� , setDaemon(true), start() �ַܼκ��� �Է¹���
	 * (Scanner) �޼����� ������ ����ϴ� ����� ���� (exit�� �Է��ϸ� ����)
	 */
	public void go() throws UnknownHostException, IOException {
		socket = new Socket(IP.LOCAL, 5432);//
		String clientIp = socket.getInetAddress().toString();
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//
		scanner = new Scanner(System.in);//
		pw = new PrintWriter(socket.getOutputStream(), true);//

		try {
			ReceiverWorker receiverWorker = new ReceiverWorker();
			Thread receiverThread = new Thread(receiverWorker);
			receiverThread.setDaemon(true);
			receiverThread.start();

			// �ڽ��� �޼����� ������ ����ϴ� �۾� ����
			System.out.println(clientIp + "�� ����");
			while (true) {
				String message = scanner.nextLine();
				pw.println(message);
				if (message.trim().equalsIgnoreCase("exit"))
					break;
			}

		} finally {
			if (scanner != null)
				scanner.close();
			if (socket != null)
				socket.close();
			System.out.println(clientIp + "�� ����");
		}
	}

	// nested class
	public class ReceiverWorker implements Runnable {
		// �������� ģ������ �޼����� �Է¹޾� �ֿܼ� ����Ѵ�
		@Override
		public void run() {
			try {
				receiveMessage();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void receiveMessage() throws IOException {
			while (true) {
				String message = br.readLine();
				if(message == null)
					break;
				System.out.println(message); //�������� ���� �޼����� �ڽſ��� ���
			}

		}
	}

	public static void main(String[] args) {
		try {
			new ChatClient().go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
