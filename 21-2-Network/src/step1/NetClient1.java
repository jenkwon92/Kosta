package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient1 {
	public void go() throws UnknownHostException, IOException {
		//String ip="127.0.0.1";
		//Socket socket = new Socket(ip,5432);
		Socket socket = new Socket(IP.LOCAL,5432); //여기서 accpet랑 접속이 맺어짐  -NetServer의 socket끼리 연결이됨
		System.out.println("NetClient가 서버에 접속함");
		//InputStreamReader : 8bit(바이트스트림)(socket.getInputStream) 스트림을 16bit 스트림(문자스트림)으로 변환
		InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		BufferedReader br =new BufferedReader(ir);
		String message = br.readLine(); //넘어온 데이터를 읽음
		System.out.println("서버가 보낸메세지" +message );
		socket.close();
		System.out.println("**NetClient종료**");
	}
	public static void main(String[] args) {
		NetClient1 client = new NetClient1();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
