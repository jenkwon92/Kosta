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
		ServerSocket serverSocket = new ServerSocket(5432); //클라이언트의 요청을 받기 위한 준비를 한다.(ServerSocket)
		System.out.println("NetServer3 실행");
		
		
		
	}
}
