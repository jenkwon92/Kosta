package step3.ex;

import java.io.IOException;
import java.net.ServerSocket;

public class NetServer3 {
	/*
	 *  ������ ���� ����ϴٰ� 
	 *  Ŭ���̾�Ʈ �����ؼ� �޼����� ����ϸ�
	 *  �� �޼����� �Է¹ް� 
	 *  �ڽ��� �ֿܼ� �޼����� ����� �� 
	 *  �ش� Ŭ���̾�Ʈ���� ������ ����( close ) 
	 *  �� �ٽ� �ݺ� 
	 */
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			
		}finally {
			if(serverSocket!=null)
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
