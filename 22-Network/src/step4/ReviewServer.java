package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ReviewServer �޽��� ->output->ReviewClient �޼��� input
 */
public class ReviewServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**ReviewServer**");
			while(true) {
				//����ϴ� Ŭ���̾�Ʈ�� �����ϸ� ���۵ȴ� 
				//���ϵǴ� Socket�� ���� Ŭ���̾�Ʈ�� ��ȭ�� ������ȭ��
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp+"�� ����");
				//true�� autoflush : buffer�� �ִ� �����͸� ��� ���
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				out.println(clientIp+"�� ��ſ� �ݿ����Դϴ�");
				out.close();
				socket.close();
			}
		}finally {
			if(serverSocket!=null)
			serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new ReviewServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
