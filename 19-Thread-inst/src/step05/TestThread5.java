package step05;
/*
 *  ��Ƽ ������ ���� 
 *  ä�� Ŭ���̾�Ʈ ���μ��� ( main thread + �����κ��� �Է¹޴� thread + ������ ����ϴ� thread ) 
 */
public class TestThread5 {
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		InputWorker worker1=new InputWorker();
		Thread t1=new Thread(worker1);
		OutputWorker worker2=new OutputWorker();
		Thread t2=new Thread(worker2);
		t1.start();
		t2.start();
		System.out.println("**main thread ����**");
	}
}
