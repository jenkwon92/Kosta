package basic;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
		//	throw new Exception("고의로 발생"); //위의 두 줄을 한줄로 줄여 사용
		} catch (Exception e) {
			System.out.println("에러 메시지 : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이  정상 종료되었습니다");
	}
}
