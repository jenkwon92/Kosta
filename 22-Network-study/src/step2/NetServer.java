package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 클라이언트가 여러번 접속해도 동작될 수 있도록 step2 서버 업데이트
 * 
 */
public class NetServer {
	public static void main(String[] args) {
		try {
			new NetServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void go() throws IOException {
		//ServerSocket serverSocket = new ServerSocket(5432); 
		ServerSocket serverSocket = null;
		
		try {
			serverSocket =  new ServerSocket(5432); 
			System.out.println("NetServer실행");
			int count=1;
			
			while(true) {
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp +" client 접속됨 , 접속수 : "+count++);
				PrintWriter out = new PrintWriter(socket.getOutputStream());
				out.println(clientIp+"님즐거운 네트워크 시간"+count);
				System.out.println(clientIp+ " client에게 메세지 출력");
				
				out.close();
				socket.close();
				
			}
		}finally {
			if(serverSocket !=null) {
				serverSocket.close();
			}
		}
		
	}
}


















