package step11;

//�ټ��� �����尡 ���� �ڿ�(��ü)�� �̿��� �� �ִ� ���� Ȯ���ϴ� ����
public class TestThread11 {
	public static void main(String[] args) {
		ServiceWorker sw = new ServiceWorker();
		Thread t1 = new Thread(sw, "1�� ������");
		Thread t2 = new Thread(sw, "2�� ������");
		Thread t3 = new Thread(sw, "3�� ������");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
