package step3.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient3 {
	/*
	 * client는 서버에 접속 (Socket 생성) -Local ip로 연습
	 * 서버로 메세지를 출력(socket.getOutputStream() <PrintWriter println())
	 * out과 socket close
	 */
	public void go() throws UnknownHostException, IOException {
		Socket socket = new Socket(IP.LOCAL, 5432);
		System.out.println("client 접속");
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.println("client에서 보내는 메세지입니다");
		pw.close();
		socket.close();
	}
	public static void main(String[] args) {
		try {
			new NetClient3().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
