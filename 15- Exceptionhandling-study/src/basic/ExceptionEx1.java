package basic;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try {			} catch (Exception e) { }
		} catch (Exception e) {
			try { } catch (Exception e) { } //에러 .변수e가 중복선언
		}//try-catch 의 끝
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}//try-catch의 끝
	}//main메서드 끝
}
