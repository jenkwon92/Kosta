package step04;

public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("**main Thread 시작**");
		VideoWorker worker1 = new VideoWorker();
		AudioWorker worker2 = new AudioWorker();
		Thread t1 = new Thread(worker1);
		Thread t2 = new Thread(worker2);
		t1.start();
		t2.start();
		System.out.println("**main thread 종료**");
	}
}
