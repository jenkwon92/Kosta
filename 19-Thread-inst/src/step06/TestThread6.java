package step06;
/*	�ϳ��� Ŭ�������� �ټ��� �����带 �����ؼ� �����غ��� ���� 
 * 
 *  ä�� ������ ���� , ���� ����(ä��)�� �����ϳ� 
 *  ������ �ټ��� Ŭ���̾�Ʈ���� ���ÿ� ���� �ϱ� ���� 
 *  �ټ��� �����带 ������ �����ϰ� �ϴ� ������ ���α׷��� ������ �����غ��� 
 *  -> ���� Network �����ϰ� �� �Ŀ��� ���� ������ �� ����
 */
public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		ServerWorker worker=new ServerWorker();
		Thread t1=new Thread(worker,"A �����");
		t1.start();
		Thread t2=new Thread(worker,"B �����");
		t2.start();
		Thread t3=new Thread(worker,"C �����");
		t3.start();
		System.out.println("**main thread ����**");
	}
}
