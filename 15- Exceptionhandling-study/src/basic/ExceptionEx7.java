package basic;

public class ExceptionEx7 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch (Exception e) { //ArithmeticException 를 제외한 모든 예외 처리가 처리됨. 첫번째 검사에서 찾았기떄문에 두번째 catch블럭 검사하지 않음
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
