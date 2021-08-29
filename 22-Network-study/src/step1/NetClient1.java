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
		Socket socket = new Socket(IP.LOCAL,5432); //���⼭ accpet�� ������ �ξ���  -NetServer�� socket���� �����̵�
		System.out.println("NetClient�� ������ ������");
		//InputStreamReader : 8bit(����Ʈ��Ʈ��)(socket.getInputStream) ��Ʈ���� 16bit ��Ʈ��(���ڽ�Ʈ��)���� ��ȯ
		InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		BufferedReader br =new BufferedReader(ir);
		String message = br.readLine(); //�Ѿ�� �����͸� ����
		System.out.println("������ �����޼���" +message );
		socket.close();
		System.out.println("**NetClient����**");
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
