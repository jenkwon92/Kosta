package step6.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class EchoClient {
	/*
	 * ������ �����Ͽ� 1. �ֿܼ��� �Է�(Scanner) 2. ������ ��� (PrintWriter) 3. �ٽ� �������� ���� �޼�����
	 * �Է�(BufferedReader) �޾� �ֿܼ� ���
	 * 
	 * 1,2,3 �� �ݺ�( ���� ��� ���ڿ��� �ֿܼ� �Է��ϸ� Ŭ���̾�Ʈ ���α׷� ����ǵ��� �Ѵ�)
	 */
	public void go() throws UnknownHostException, IOException {
		Socket socket = null; // ������ ���
		Scanner scanner = null; // �ֿܼ� �Է�
		PrintWriter out = null; // ������ ���
		BufferedReader br = null; // �������� �Է�
		try {
			socket = new Socket(IP.LOCAL, 5432);
			scanner = new Scanner(System.in);
			out = new PrintWriter(socket.getOutputStream(), true); // autoflush ��� ���
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("**EchoClient**");
			while (true) {
				System.out.print("������ ���� �޼��� :");
				String message = scanner.nextLine(); // ����ڷκ��� �ֿܼ��� �޼����� �Է¹޴´�
				out.println(message);
				if (message.equals("exit")) {
					System.out.println("EchoClient ����˴ϴ�");
					break;
				}
				String response = br.readLine(); // �������� ���� �޼����� �Է¹޴´�
				System.out.println("�������� �Է¹��� �޼��� :" + response);
			}
		} finally {
			if (br != null)
				br.close();
			if (out != null)
				out.close();
			if (scanner != null)
				scanner.close();
			if (socket != null)
				socket.close();
		}

	}

	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
