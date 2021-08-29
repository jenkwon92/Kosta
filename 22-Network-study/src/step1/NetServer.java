package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer {
	public static void main(String[] args) {
		try {
			new NetServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5432);//Ŭ���̾�Ʈ�� ��û�� �ޱ� ���� �غ� �Ѵ�.(ServerSocket)
		System.out.println("NetServer ����");
		Socket socket = serverSocket.accept(); //Ŭ���̾�Ʈ�� ��û�� �޾� ���δ�. (accept)
		System.out.println("client�� ������");
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("��ſ� ����� �Դϴ�");
		
		out.close();
		socket.close();
		serverSocket.close();
	
	}
}
