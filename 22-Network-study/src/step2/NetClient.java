package step2;

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
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	public void go() throws UnknownHostException, IOException {
		Socket socket = new Socket(IP.LOCAL, 5432);
		BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("서버로부터 입력받은 메세지 : "+br.readLine());
		
		br.close();
		socket.close();
		
	}
}












