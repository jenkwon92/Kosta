package step02;
/* 
 ��Ƽ ������ ȯ�濡�� �����ؼ� TestThread1 ( ���Ͻ����� ȯ�� ) �� ���� ����� ���غ��� 
  main thread + Worker Thread 
  main thread���� Worker Thread ��ü ���� �� start() ��Ű�� 
  JVM �� �����ٸ��� �ؼ� Worker Thread�� run() �� ȣ���ؼ� �����ϰ� �Ѵ�  
*/
// java.lang.Thread class �� ��ӹ޴� ������� �����带 �����Ѵ� 
class Worker extends Thread{
	
	//Thread class�� run �޼��带 �������̵� : JVM �� ȣ���Ѵ� 
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("**Worker Thread ���ϴ�**"+i);
		}
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		Worker thread=new Worker();
		thread.start();// �����带 ���� ���ɻ��·� ������. ���� JVM �� �����ٸ��� �ؼ� �����ϰ� �Ѵ� 
		System.out.println("**main thread ����**");
	}
}





