package step01;
//단일 스레드 환경(main thread)
// TestThread1 program 을 실행시켜 실행중이면 Process가 하나 실행중이고 
// 이 Process내의 실행 단위인 Thread(일꾼) 가 하나 실행된다
public class TestThread1 {
	public static void main(String[] args) {
		SingleThreadTest t = new SingleThreadTest();
		t.test();
		System.out.println("****main thread 종료*****");
	}
}
