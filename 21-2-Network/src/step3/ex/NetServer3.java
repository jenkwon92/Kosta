package step3.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer3 {
	/*
	 * ������ ���� ����ϴٰ� 
	 * Ŭ���̾�Ʈ�� �����ؼ� �޼����� ����ϸ�
	 * �� �޼����� �Է¹ް�
	 * �ڽ��� �ֿܼ� �޼����� ����� �� 
	 * �ش� Ŭ���̾�Ʈ���� ������ ���� (close()) 
	 * �� �ٽ� �ݺ�
	 */
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			
			while(true) {
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp+"client ���ӵ�");
				PrintWriter out = new PrintWriter(socket.getOutputStream());
			}
			socket.getOutputStream()
		}finally {
			if(serverSocket !=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new NetServer3().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
