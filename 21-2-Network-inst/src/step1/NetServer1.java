package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer1 {
	public void go() throws IOException {
		ServerSocket serverSocket=new ServerSocket(5432);
		System.out.println("**NetServer1 ����**");
		//ServerSocket�� accept(): Ŭ���̾�Ʈ ������ ����ϴٰ� �����ϸ� �� Ŭ���̾�Ʈ�� ����� �Ϲ�Socket�� ��ȯ 
		Socket socket=serverSocket.accept(); 
		System.out.println("**client�� ������**");
		//�������� ������ Ŭ���̾�Ʈ�� �޼����� ����Ѵ� 
		PrintWriter out=new PrintWriter(socket.getOutputStream());
		out.println("��ſ� ����� �����Դϴ�");
		out.close();
		socket.close();
		serverSocket.close();
		System.out.println("**NetServer1 Ŭ���̾�Ʈ���� �޼��� ��� �� ����**");
	}
	public static void main(String[] args) {
		NetServer1 server=new NetServer1();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}






