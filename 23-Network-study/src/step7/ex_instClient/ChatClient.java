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
	 * Socket 생성 ReceiverWorker 생성, Thread 생성 , setDaemon(true), start() 콘솔로부터 입력받은
	 * (Scanner) 메세지를 서버로 출력하는 기능을 구현 (exit를 입력하면 종료)
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

			// 자신의 메세지를 서버로 출력하는 작업 정의
			System.out.println(clientIp + "님 접속");
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
			System.out.println(clientIp + "님 종료");
		}
	}

	// nested class
	public class ReceiverWorker implements Runnable {
		// 서버에서 친구들의 메세지를 입력받아 콘솔에 출력한다
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
				System.out.println(message); //서버에서 받은 메세지를 자신에게 출력
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
