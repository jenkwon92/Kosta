package step12;
// �Ʒ� Ŭ������ ���� ��Ƽ �������� �����ڿ��� ����� �� �߻��� �� �ִ� ������ Ȯ��  
public class Toilet implements Runnable{
	private boolean seat;//�ν��Ͻ� ���� �⺻ �ʱ�ȭ false 
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void use(String guestName) throws InterruptedException {
		if(seat==false) {
		Thread.sleep(1000);	
		seat=true;	
		System.out.println(guestName+"�� ����");
		Thread.sleep(2000);
		System.out.println(guestName+"�� ����");
		seat=false;
		}else {
			System.out.println(guestName+"�� ���� ȭ����� �ٸ� ���� ������̼� �̵��� ������");
		}
	}
}
