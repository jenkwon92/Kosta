package step6.inst;

import java.io.IOException;
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
		
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**MultiServer**");
			while(true) {
				Socket socket = serverSocket.accept(); //����ϴٰ� client�� �����ϸ� ����Ǿ� ������ ��ȯ
				ServerWorker serverWorker = new ServerWorker(socket);
				Thread thread = new Thread(serverWorker);
				thread.start();
			}
			
		}finally {
			if(serverSocket!=null)
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
