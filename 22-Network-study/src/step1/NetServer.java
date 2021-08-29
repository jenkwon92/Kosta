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
		ServerSocket serverSocket = new ServerSocket(5432);//클라이언트의 요청을 받기 위한 준비를 한다.(ServerSocket)
		System.out.println("NetServer 실행");
		Socket socket = serverSocket.accept(); //클라이언트의 요청을 받아 들인다. (accept)
		System.out.println("client가 접속함");
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("즐거운 목요일 입니다");
		
		out.close();
		socket.close();
		serverSocket.close();
	
	}
}
