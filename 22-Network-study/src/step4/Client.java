package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class Client {
	public void go() throws UnknownHostException, IOException {
		Socket socket = new Socket(IP.LOCAL,5432);
		System.out.println("client 접속함");
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.println("클라이언트에서 보내는 메세지 입니다");
		
		pw.close();
		if(socket != null)
		socket.close();
		
	}
	public static void main(String[] args) {
		try {
			new Client().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
