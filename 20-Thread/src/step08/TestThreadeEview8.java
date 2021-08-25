package step08;

public class TestThreadeEview8 {
	public static void main(String[] args) {
		//Thread Review
		int makeCount  = 10; //실행 횟수
		int makePeriod = 1000 ; //1초 간격으로 실행
		
		// 1. makeFile 메서드 구현
		// 2. makerWorker를 이용해 스레드 생성 후 start 시킨다
		MakeFileWorker makeWorker = new MakeFileWorker(makeCount , makePeriod);
		Thread makeThread = new Thread(makeWorker);
		makeThread.start();
		
		
		// 연습 2
		int moveCount = 3;
		int movePeriod = 4000; //4초간격
		
		// 1. moveFile 메서드 구현
		// 2. moveWorker를 이용해 스레드 생성 후 start 시킨다
		MoveFileWorker moveWorker = new MoveFileWorker(moveCount, movePeriod);
		Thread moveThread = new Thread(moveWorker);
		moveThread.start();
	}
}
