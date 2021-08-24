package step07;

public class BackupWorker implements Runnable {

	@Override
	public void run() {
		while (true) {
			try {
				backup();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void backup() throws InterruptedException {
		Thread.sleep(3000);// 3�� �������� ��� ����
		System.out.println("��������尡 ���幮���� ���ó��");
	}
}
