package step13;
// �Ʒ� Ŭ������ ���� ��Ƽ �������� �����ڿ��� ����� �� �߻��� �� �ִ� ������ Ȯ��  
public class Toilet implements Runnable{
	//private boolean seat;//�ν��Ͻ� ���� �⺻ �ʱ�ȭ false 
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// synchronized : Ư�� ������ ���� ������ ȯ������ ����� 
	// 1. method �������� ����ȭ ó�� 
	/*
	public synchronized void use(String guestName) throws InterruptedException {
		System.out.println(guestName+"�� ����");
		Thread.sleep(2000);
		System.out.println(guestName+"�� ����");	
	}
	*/
	// 2. Ư�� �ڵ� �������� ����ȭó�� 
	public  void use(String guestName) throws InterruptedException {
		//�۾�1
		synchronized(this) {
		System.out.println(guestName+"�� ����");
		Thread.sleep(2000);
		System.out.println(guestName+"�� ����");	
		}
		//�۾�2 
	}
}















