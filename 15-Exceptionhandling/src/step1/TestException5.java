package step1;
/*
 *  finally : ���� �߻� ���ο� ������� �׻� ����
 */
public class TestException5 {
	public static void main(String[] args) {
		String age = "22";
		age = "������";
		System.out.println(age + 1); // ���ڿ��̹Ƿ� 221
		try {
			int iage = Integer.parseInt(age); // ���ڿ��� ���������� ��ȯ
			System.out.println(iage +1);  //23 ����Ǿ� ���� ���			
		} catch (NullPointerException ne) { //NumberFormatException �̹Ƿ� ���ܸ� ó������ ���Ѵ�
			System.out.println("����"); //null�̹Ƿ� �����͸� ���� �Է��ϼž� �մϴ�.
		} finally{ //finally ������ ����ó�� �� �߻� ���ο� ������� �׻� ����
			System.out.println("finally�� �׻� ����");
		}
		System.out.println("���α׷� ���� ����");
	}

}
