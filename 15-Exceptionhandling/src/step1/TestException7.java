package step1;

import java.util.Scanner;

/*
 * Scanner�� �̿��� ������ �Է¹ް� Exception try catch finally �� �׽�Ʈ�ϴ� ����
 */
public class TestException7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		String info = scanner.nextLine();
		try {
			int age = Integer.parseInt(info);
			if(age>19) {
				System.out.println("����� �����Դϴ�");
			}else {
				System.out.println("����� �̼������Դϴ�");
			}
		} catch (NumberFormatException ne) {
			System.out.println("���̸� ������ �Է��ؾ� �մϴ�");
		}finally {			
			scanner.close(); //close() �� ���� �߻� ���ο� ������� �׻� �����ϰ� �Ѵ�
		}
		
	}
}
