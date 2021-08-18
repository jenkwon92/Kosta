package basic;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		for(int i=0; i<10; i++) {
			try {
				result = number /(int)(Math.random()*10);  //Math.random() Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
																				// 10을 곱하면 0-9까지의 수
				 																//ArithmeticException :정수는 0으로 나누는 것 금지 (에러) , 실수를 0으로 나누는 것은 금지되어 있지 않음(에러x)
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
			
		}
	}
}
