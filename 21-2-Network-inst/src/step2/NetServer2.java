package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 *  Ŭ���̾�Ʈ�� ������ �����ص� ���۵� �� �ֵ��� step1 ������ ������Ʈ 
 *  ServerSocket ���� 
 *  while(true){
 *  	Socket socket=serverSocket.accept(); // Ŭ���̾�Ʈ�� ������ ������ �� �ֵ��� accept() �� �ݺ��ؼ� ���� 
 *  	��¼��� 
 *  	close
 *  }
 */
public class NetServer2 {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
		serverSocket=new ServerSocket(5432);
		System.out.println("**NetServer2 ����**");
		int count=1;
		while(true) {			
			Socket socket=serverSocket.accept();
			String clientIp=socket.getInetAddress().toString();
			System.out.println("**"+clientIp+" client ���ӵ�, ���Ӽ�:"+count);
			PrintWriter out=new PrintWriter(socket.getOutputStream());
			out.println(clientIp+"�� ��ſ� ����� ����^^ "+count++);
			System.out.println(clientIp+" client���� �޼��� ���");
			out.close();
			socket.close();
		}
		}finally {
			if(serverSocket!=null)
			serverSocket.close();
		}
	}
	public static void main(String[] args) {
		NetServer2 server=new NetServer2();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
