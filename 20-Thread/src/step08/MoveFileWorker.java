package step08;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;
	
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}

	@Override
	public void run() {
		try {
			moveFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//moveCount Ƚ����ŭ �ݺ��ϵ� movePeriod �������� �����ϰ� �Ѵ�
	public void moveFile() throws InterruptedException {
		for(int i=0; i<moveCount; i++) {
			Thread.sleep(movePeriod);
			System.out.println("���� �̵� ������ ����" +i); //��� �̵���ų �ʿ䰡 �����ϱ�
		}
	}
}
