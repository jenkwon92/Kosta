package basic;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		for(int i=0; i<10; i++) {
			try {
				result = number /(int)(Math.random()*10);  //Math.random() Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
																				// 10�� ���ϸ� 0-9������ ��
				 																//ArithmeticException :������ 0���� ������ �� ���� (����) , �Ǽ��� 0���� ������ ���� �����Ǿ� ���� ����(����x)
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
			
		}
	}
}
