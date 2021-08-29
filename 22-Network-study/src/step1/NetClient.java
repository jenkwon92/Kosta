package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient {
	public static void main(String[] args) {
		try {
			new NetClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void go() throws UnknownHostException, IOException {
		Socket socket = new Socket(IP.LOCAL,5432); //서버에 접속 요청을 한다. (Socket)
		System.out.println("NetClient가 서버에 접속함");
		InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(ir);
		String message = br.readLine();
		System.out.println("서버가 보낸 메세지 : "+message);
		
		//br.close(); 
		socket.close();
		System.out.println("NetClient 종료");
		
	}
}
