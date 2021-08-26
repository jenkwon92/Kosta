package step3.inst;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class NetClient3 {
	/*
	 *  client�� ���� ���� ( Socket ���� ) - Local ip �� ���� 
	 *  ������ �޼����� ��� ( socket.getOutputStream() < PrintWriter  println() ) 
	 *  out�� socket close
	 */
	public void go() throws UnknownHostException, IOException {
		Scanner scanner=new Scanner(System.in);
		Socket socket=new Socket(IP.INST,5432);
		PrintWriter out=new PrintWriter(socket.getOutputStream());
		System.out.print("������ ���� �޼���:");
		String message=scanner.nextLine();
		out.println(message);
		System.out.println("**NetClient3 ������ �޼��� ����**");
		scanner.close();
		out.close();
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











