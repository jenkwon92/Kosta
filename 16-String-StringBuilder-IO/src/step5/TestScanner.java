package step5;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��̸� �Է��ϼ��� : ");
		String hobby = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		String age = sc.nextLine();
		System.out.println("��̴� "+hobby+" ���̴� "+age);
		sc.close();
	}
}
