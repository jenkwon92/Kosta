package step5.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class EchoClient {
	/*
	 * 서버에 접속하여 1. 콘솔에서 입력(Scanner) 2. 서버로 출력 (PrintWriter) 3. 다시 서버에서 보낸 메세지를
	 * 입력(BufferedReader) 받아 콘솔에 출력
	 * 
	 * 1,2,3 을 반복( 종료 라는 문자열은 콘솔에 입력하면 클라이언트 프로그램 종료되도록 한다)
	 */
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		PrintWriter out = null;
		BufferedReader br = null;
		try {
			socket = new Socket(IP.LOCAL, 5432);
			System.out.println("**EchoClient**");

			System.out.print("서버에 보낼 메시지: ");
			out = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = br.readLine();
			
			while (true) {
				out.println(sc.nextLine());
				System.out.println("서버로부터 입력받은 메세지 : " + message);

			}
		} finally {
			br.close();
			out.close();
			sc.close();
			socket.close();
		}
	}

	public static void main(String[] args) {

		try {
			new EchoClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
