package step1;

/*
 * 	try catch finally ���� ��� ����
 * �������� �帧: money�� 100�� �Ҵ����� ��, a c ���
 * �������� �帧: money�� ���� �Ҵ����� �� , b c���
 * 
 */
public class TestException6 {
	public static void main(String[] args) {
			String money ="100";
			//�������� �帧 �׽�Ʈ�� ���� ���Ҵ�
			money="��";
			try {
				int im = Integer.parseInt(money);
				System.out.println("a");
			} catch (NumberFormatException ne) {
				System.out.println("b");
			}finally {
				System.out.println("c");
			}
	}
}
