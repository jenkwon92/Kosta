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
	public void go(){
		
	}

	// nested class
	public class ReceiverWorker implements Runnable {
		// �������� ģ������ �޼����� �Է¹޾� �ֿܼ� ����Ѵ�
		@Override
		public void run() {
			
		}

		public void receiveMessage() throws IOException {
			
			
			
		}
	}

	public static void main(String[] args) {
	
	}
}
