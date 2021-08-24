package step03;
/* 
 step02�� TestThread2 ���� extends Thread ������� ������ ������ ���� 
 step03������ implements Runnable ������� ������ �����ϴ� ������ �����غ���  
 
 ��Ƽ ������ ȯ�濡�� �����ؼ� TestThread1 ( ���Ͻ����� ȯ�� ) �� ���� ����� ���غ��� 
  main thread + Worker Thread 
  main thread���� Worker Thread ��ü ���� �� start() ��Ű�� 
  JVM �� �����ٸ��� �ؼ� Worker Thread�� run() �� ȣ���ؼ� �����ϰ� �Ѵ�  
*/
// java.lang.Runnable interface�� implements �ϴ� ������� �����带 �����غ���  
class Worker implements Runnable{
	
	//Thread class�� run �޼��带 �������̵� : JVM �� ȣ���Ѵ� 
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("**Worker Thread ���ϴ�**"+i);
		}
	}
}

public class TestThread3 {
	public static void main(String[] args) {
		Worker worker=new Worker();
		Thread thread=new Thread(worker);
		thread.start();// �����带 ���� ���ɻ��·� ������. ���� JVM �� �����ٸ��� �ؼ� �����ϰ� �Ѵ� 
		System.out.println("**main thread ����**");
	}
}	





