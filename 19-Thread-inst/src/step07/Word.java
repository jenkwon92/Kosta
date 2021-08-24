package step07;
// ���� �۾� �����尡 ����Ǵ� ������ 
// ��� �۾� �����带 �Բ� �����Ų�� 
public class Word implements Runnable{
	@Override
	public void run() {
		try {
			//��������带 �����ؼ� start ��Ų�� 
			BackupWorker w=new BackupWorker();
			Thread backThread=new Thread(w);
			//��������带 daemon thread�� ó���ؼ� �� Word �����尡 ����Ǹ� �Բ� ����ǵ��� �Ѵ� 
			backThread.setDaemon(true);
			backThread.start();
			execute();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void execute() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("���幮���۾� "+i);
			Thread.sleep(1000);
		}
	}
}
