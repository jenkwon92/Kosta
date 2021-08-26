package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer1 {
	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5432); // ��� ������ �����ϱ� ���� ��ü -��ǥ��ȭ�� ����
		System.out.println("**NetServer1 ����**");
		// ServerSocker�� accept() : Ŭ���̾�Ʈ ������ ����ϴٰ� �����ϸ� �� Ŭ���̾�Ʈ�� ����� �Ϲ� Socket�� ��ȯ
		Socket socket = serverSocket.accept(); // ����Ŭ���̾�Ʈ�� ����ϴ� ���� - ��ȭ�Ⱑ ������
		System.out.println("**client�� ������**");
		// �������� ������ Ŭ���̾�Ʈ�� �޼����� ����Ѵ�
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("��ſ� ����� �����Դϴ�"); //�����͸� �Ѱ��� ��
		out.close(); //������ �������� ����
		socket.close();
		serverSocket.close();
		System.out.println("**NetServer1 Ŭ���̾�Ʈ���� �޼��� ��� �� ����**");
	}

	public static void main(String[] args) {
		NetServer1 server = new NetServer1();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
