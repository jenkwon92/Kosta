package step3.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient3 {
	/*
	 * client�� ������ ���� (Socket ����) -Local ip�� ����
	 * ������ �޼����� ���(socket.getOutputStream() <PrintWriter println())
	 * out�� socket close
	 */
	public void go() throws UnknownHostException, IOException {
		Socket socket = new Socket(IP.LOCAL, 5432);
		System.out.println("client ����");
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.println("client���� ������ �޼����Դϴ�");
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
