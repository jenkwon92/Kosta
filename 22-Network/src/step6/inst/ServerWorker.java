package step6.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable {
	private Socket socket;
	private String clientIp;

	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
		clientIp = socket.getInetAddress().toString();
	}

	@Override
	public void run() {
		System.out.println(clientIp + "�� �����ϼ̽��ϴ�");
		try {
			echo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(clientIp + "���� �����ϼ̽��ϴ�");
	}

	public void echo() throws IOException {
		BufferedReader br = null; //client message�� �Է�
		PrintWriter pw = null; //client message�� ���
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true); //auto flush
			while(true) {
				String message = br.readLine();
				if(message==null || message.equals("exit")) {
					break; //while�� ����
				}
				System.out.println(clientIp+" : "+message);
				pw.println(message+"server");
			}
		}finally {
			if(socket!=null)
				socket.close(); //���ϰ� ����Ǿ��ִ� ��Ʈ���� ���ϸ� �����൵ �������� ����⶧���� 
		}
	}
}
