package step7.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class ChatClient {
	private Socket socket= null;
	private Scanner scanner =  null;
	private PrintWriter pw = null;
	private BufferedReader br=null;

	/*
	 * Socket ���� ReceiverWorker ����, 
	 * Thread ���� , 
	 * setDaemon(true), 
	 * start() �ַܼκ��� �Է¹���
	 * (Scanner) �޼����� ������ ����ϴ� ����� ���� (exit�� �Է��ϸ� ����)
	 */
	public void go() throws UnknownHostException, IOException {
		try {
			socket = new Socket(IP.LOCAL,5432);
			ReceiverWorker rw = new ReceiverWorker();
			Thread thread  = new Thread(rw);
			thread.start();
		}finally {
			if(socket!=null)
				socket.close();
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
