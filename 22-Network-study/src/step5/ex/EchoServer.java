package step5.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	/*
	 * ������ Ŭ���̾�Ʈ�� ������ ��� (1�� 1����̹Ƿ� accept() �ݺ� x); 1. ������ Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޾� �ڽ���
	 * �ֿܼ� ��� (BufferedReader) 2. �Է¹��� �޼����� �ٽ� Ŭ���̾�Ʈ�� ����Ѵ� ("server"�� ���ڿ� ���� �߰�)
	 */
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter out = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**EchoServer**");

			socket = serverSocket.accept();
			String clientIp = socket.getInetAddress().toString();
			System.out.println(clientIp + "���� �����ϼ̽��ϴ�");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);

			while (true) {
				String message = br.readLine();
				System.out.println(clientIp + "���� �޽��� : " + message);

				out.println(message + "**server**");
				if (message.equals("exit"))
					socket.close();
			}

		} finally {

			br.close();
			out.close();
			if (serverSocket != null) {
				serverSocket.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
