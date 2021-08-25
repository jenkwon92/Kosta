package step09.ex;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;
	
	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}

	@Override
	public void run() {
		try {
			file();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void file() throws InterruptedException {
		for(int i=0; i<makeCount; i++) {
			Thread.sleep(makePeriod);
			System.out.println("");
		}
	}
}
