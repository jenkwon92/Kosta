package step3;

import java.util.Scanner;

/*
 * throws , throw, try, catch, finally�� �׽�Ʈ�ϴ� ����
 * 
 * �ʿ�� Ư�� Exception�� ���� �����ؼ� ����� �� �ִ�
 * Ư�� Exception�� ������ ���� java.lang.Exception �� ��ӹ����� �ȴ� (extends Exception) 
 */
class AgeException extends Exception {
	// IO�κ� ��ü ����ȭ���� ������ ����
	private static final long serialVersionUID = -1641932421720612222L;

	AgeException(String message) {
		super(message); // �θ��� Exception�� �����ڸ� ȣ���� �� ���� �޼����� ���� -> ���� catch�������� e.getMessage() �� �̿���
						// ��ȯ���� �� �ִ�.
		this.getMessage();
	}
}

class MovieService {
	// 19�� �̻��̸� ��ȭ ���� �����ϰ� �̸��̸� AgeException �� �߻���Ų��
	public void enter(int age) throws AgeException {
		try {	
			if(age<19) {
				throw new AgeException(age+"�� �̼������̹Ƿ� ��ȭ������ �Ұ����մϴ�."); //Exception�߻�. ��°��� ����� ���� 
			}
			System.out.println("��ſ� ��ȭ �����Ǽ���!");
		}finally {
			System.out.println("finally �׻� �����ϴ� ����, ������ �� ����~");
		}
	}
}

public class TestThrows2 {
	public static void main(String[] args) {
		MovieService service = new MovieService();
		try {
			service.enter(20); //main������ �ַ� try-catch . ���� ���Ḧ ����
		} catch (AgeException e) {
			//e.printStackTrace(); //���� �߻� ��θ� ��� ����Ѵ�
			System.out.println(e.getMessage()); //���� �޼����� ��ȯ�޾� ����Ѵ� --���⼭ �޼����� ��µ�
		}
		System.out.println("�ý��� ���� ����");
	}
}
