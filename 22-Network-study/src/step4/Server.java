package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * ReviewServer 메시지 ->output->ReviewClient 메세지 input
 */
public class Server {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("server 접속");
			
			while(true) {
			Socket socket = serverSocket.accept();
			String clientIp = socket.getInetAddress().toString();
			
			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(ir);
			String message = br.readLine();
			System.out.println(clientIp + "의 메세지 : "+message);
			
			br.close();
			socket.close();
			}
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
		
	}
	public static void main(String[] args) {
		try {
			new Server().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
