package step3.inst;

import java.io.IOException;
import java.net.ServerSocket;

public class NetServer3 {
	public static void main(String[] args) {
		try {
			new NetServer3().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5432); //Ŭ���̾�Ʈ�� ��û�� �ޱ� ���� �غ� �Ѵ�.(ServerSocket)
		System.out.println("NetServer3 ����");
		
		
		
	}
}
