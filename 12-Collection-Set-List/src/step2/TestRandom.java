package step2;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		// ������ ���� �߻���Ű�� ���� Random ��ü�� �̿��Ѵ�
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(3)); //���� bound�� 3���� �ָ� 0���� 2���� ������ ���� �����ȴ�
		}
	}
}
