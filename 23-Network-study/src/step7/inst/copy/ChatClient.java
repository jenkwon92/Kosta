package step7.inst.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class ChatClient {
	private Socket socket;
	private BufferedReader br; //ģ���� �޼����� �Է�
	private Scanner scanner; //�ֿܼ��� �Է�
	private PrintWriter pw; //�ֿܼ��� �Է¹��� �ڽ��� �޼����� ������ ���

	/*
	 * Socket ���� ReceiverWorker ����, 
	 * Thread ���� , 
	 * setDaemon(true), 
	 * start() �ַܼκ��� �Է¹���
	 * (Scanner) �޼����� ������ ����ϴ� ����� ���� (exit�� �Է��ϸ� ����)
	 */
	public void go() throws UnknownHostException, IOException {
		try {
			socket = new Socket(IP.INST,5432);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			scanner = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(),true); //auto flush : buffer�� �ִ� �����͸� ��� ���
			
			//�������� �޼����� �Է¹��� �����带 �����ϰ� start ��Ų��
			ReceiverWorker worker = new ReceiverWorker();
			Thread receiverThread = new Thread(worker); //ģ������ �޼����� �Է¹��� �����带 ����
			receiverThread.setDaemon(true); //�ڽ��� �����Ų thread�� ����Ǹ� �Բ� ����ǵ��� ����
			receiverThread.start();
			
			//�ڽ��� �޼����� ������ ����ϴ� �۾� ����
			System.out.println("ChatClient ����");
			while(true) {
				String message = scanner.nextLine(); //�ֻܼ󿡼� ����ϴٰ� ����ڰ� �޼��� �Է� �� ���� ������ ����
				pw.println(message);
				if(message.trim().equalsIgnoreCase("exit"))
					break;		
			}
			
		}finally {
			if(scanner != null)
				scanner.close();
			if(socket !=null)
				socket.close();
			System.out.println("**ChatClient ����**");
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
			while(true) {
				String message = br.readLine();
				if(message == null)
					break;
				System.out.println(message);
			}
		}
	}

	public static void main(String[] args) {
			try {
				new ChatClient().go();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
