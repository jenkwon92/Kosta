package step05;

public class InputWorker implements Runnable{
	@Override
	public void run() {
		try {
			input();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void input() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("�����κ��� �޼����� �Է¹޴� ������:"+i);
			Thread.sleep(1000);
		}
	}
}
