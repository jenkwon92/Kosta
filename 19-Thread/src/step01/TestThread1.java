package step01;
//���� ������ ȯ��(main thread)
// TestThread1 program �� ������� �������̸� Process�� �ϳ� �������̰� 
// �� Process���� ���� ������ Thread(�ϲ�) �� �ϳ� ����ȴ�
public class TestThread1 {
	public static void main(String[] args) {
		SingleThreadTest t = new SingleThreadTest();
		t.test();
		System.out.println("****main thread ����*****");
	}
}
