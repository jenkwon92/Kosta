package step5.ex;

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
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		PrintWriter out = null;
		BufferedReader br = null;
		try {
			socket = new Socket(IP.LOCAL, 5432);
			System.out.println("**EchoClient**");

			System.out.print("������ ���� �޽���: ");
			out = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = br.readLine();
			
			while (true) {
				out.println(sc.nextLine());
				System.out.println("�����κ��� �Է¹��� �޼��� : " + message);

			}
		} finally {
			br.close();
			out.close();
			sc.close();
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
