package step01;
//���� ������ ȯ��(main thread)

// TestThread1 program �� ������� �������̸� Process�� �ϳ� �������̰� 
// �� Process���� ���� ������ Thread(�ϲ�) �� �ϳ� ����ȴ�

class SingleThreadTest {
	public void test() {
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread : " + i);
		}
	}
}

public class TestThread1 {
	public static void main(String[] args) {
		SingleThreadTest t = new SingleThreadTest();
		t.test();
		System.out.println("****main thread ����*****");
	}
}
