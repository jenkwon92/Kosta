package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient2 {
	public void go() throws UnknownHostException, IOException {
		Socket socket=new Socket(IP.INST,5432);
		System.out.println("**NetClient2 �����Ͽ� ������ ����**");
		BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("�����κ��� �Է¹��� �޼���:"+br.readLine());
		br.close();
		socket.close();
	}
	public static void main(String[] args) {
		try {
			new NetClient2().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











