package basic;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try {			} catch (Exception e) { }
		} catch (Exception e) {
			try { } catch (Exception e) { } //���� .����e�� �ߺ�����
		}//try-catch �� ��
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}//try-catch�� ��
	}//main�޼��� ��
}
