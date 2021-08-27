package step6.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
	  		MultiServer : �ټ��� Client���� ���������� �޾Ƹ� ����
			step5�� EchoClient ���α׷��� �״�� �����ǰ�
			step5�� EchoServer ���α׷��� ������Ʈ�Ѵ�
			
			�ϳ��� ������ ���������� ������ �����ϸ鼭 �ټ��� Ŭ���̾�Ʈ���� �����ϱ� ���ؼ���
			���μ��� ������ ������ ��������� Thread�� �̿��ؾ� �Ѵ�
			(ex- �ݼ��Ϳ��� �ټ��� ���� ���ÿ� ��㼭�񽺸� �ϱ� ���� ������ �ټ� ä���ؾ� �ϴ� �Ͱ� ����)
			
			MultiServer ������ Ŭ���̾�Ʈ ������ ����ϴٰ� �����ϸ� �ش� Ŭ���̾�Ʈ�� ����ϱ� ���� 
			Socket(��ȭ��)�� ��ȯ�޾� ServerWorker(����) ��ü �����ÿ� �Ҵ��ϰ� 
			Thread�� ������ start ��Ų�� (�̸� �ݺ�)
			
			Runnable Interface�� ������ ServerWorker �� �Ҵ���� ��������
			Ŭ���̾�Ʈ�� �޾Ƹ� ���񽺸� �����Ѵ�
 */
public class MultiServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter out = null;

		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("Server ������");
			socket = serverSocket.accept();
			String clientIp = socket.getInetAddress().toString();
			System.out.println(clientIp + "����");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			
			while (true) {
				ServerWorker s = new ServerWorker(socket);
				Thread thread = new Thread(s);
				thread.start();
				String message = br.readLine(); // Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޴´�
				if (message == null || message.equals("exit")) {
					System.out.println(clientIp + "���� �����̽��ϴ�");
					break;
				}
				System.out.println("���� �޼��� :" + message);
				out.println(message + "*server*"); // Ŭ���̾�Ʈ�� �޼����� ����Ѵ�

			}
		} finally {
			if (out != null)
				out.close();
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
			if (serverSocket != null)
				serverSocket.close();
		}

	}

	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
