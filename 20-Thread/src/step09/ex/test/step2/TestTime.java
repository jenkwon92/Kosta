package step09.ex.test.step2;

import java.text.SimpleDateFormat;

/*
 * ������ ���ϸ��� ����� ���� �ð������� �̿��ϴ� �����׽�Ʈ
 * java : System.currentTimeMills() �޼��带 �̿�
 * ��ȯ�Ǵ� ����  long Ÿ��, ���� ǥ�ؽ� 1970�� 1�� 1�� 0�� 0�� �������� 
 * �� �и������尡 �귶���� ����� �� - > ���н� �ð��̶�� ��
 */
public class TestTime {
	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		long time = System.currentTimeMillis();
		//time = 1629862231929L;
		System.out.println(time);
		// �ð� ������ long �� �����͸� �ð� ������ �����ؼ� Ȯ���غ��� 
		SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		String nowTime =s.format(time);
		System.out.println(nowTime);
	}
}
