package step6.ex;

import java.net.Socket;
import java.net.SocketException;

public class ServerWorker implements Runnable {
	private Socket socket;
	
	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			work();
		} catch (SocketException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public void work() throws SocketException, InterruptedException {
		for(int i=0; i<socket.getSendBufferSize(); i++) {
			Thread.sleep(1000);
		}
	}
}
