package step06;
// ä�� ���񽺸� ����ϴ� Ŭ����
// �� Ŭ�����κ��� �ټ��� �����尡 �����Ǿ� ����ȴ�
// �ټ��� �����忡 ���� run() �޼��尡 ���������
// ������ ���� ������ stack�޸� ������ �����ǹǷ� 
// �������� local variable �� ����ϴµ��� ������ ���� 
public class ServerWorker implements Runnable{

	@Override
	public void run() {
		try {
			chatting();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void chatting() throws InterruptedException {
		//���� �������� �������� �̸��� ��ȯ�޴´�
		String threadName = Thread.currentThread().getName();
		for(int i=0; i<10; i++) {
			System.out.println(threadName +" �����ϲ۽����� ä�ü���"+i);
			Thread.sleep(1000);
		}
	}
}
