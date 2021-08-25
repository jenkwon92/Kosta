package step09.ex;

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
			move();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void move() throws InterruptedException {
		for(int i=0; i<moveCount; i++) {
			Thread.sleep(movePeriod);
			System.out.println("");
		}
	}
	
	
}
