package step08;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;
	

	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}


	// run() : JVM�� �����ٸ��ؼ� ȣ���ϴ� �޼���
	// ���� �������� ���� ������ �����ϴ� �޼���
	@Override
	public void run() {
		try {
			makeFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//1�� �������� 10ȸ ����
	public void makeFile() throws InterruptedException {
		for(int i = 0; i<makeCount; i++) {
			System.out.println("���ϻ��������� ����" +i);
			Thread.sleep(makePeriod);
		}
	}
}
















