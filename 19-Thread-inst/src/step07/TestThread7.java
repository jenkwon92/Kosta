package step07;
//Daemon Thread Test ���� 
//��������带 daemon thread�� ó���ؼ� �� Word �����尡 ����Ǹ� �Բ� ����ǵ��� �Ѵ� 
//backThread.setDaemon(true);
public class TestThread7 {
	public static void main(String[] args) {
		Thread t=new Thread(new Word());
		t.start();
	}
}
