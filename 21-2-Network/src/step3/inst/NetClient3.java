package step3.inst;

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
		Socket socket = new Socket(IP.INST, 5432);
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("�����ϼ̽��ϴ�");
		System.out.println("**NetClient3 ������ �޼��� ����**");
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
