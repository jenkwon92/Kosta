package test;

import java.util.Scanner;

public class UnitTestLabel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		exit: //label -> break ���̺��  �Ʒ� ����� ����� 
		while(true) {
			System.out.print("1,2 �� �Է��غ��ϴ�");
			String info=s.nextLine();
			switch(info) {
			case "1":
				System.out.println(info+" ���");
				break;
			case "2":
				System.out.println(info+" ����");
				break exit; // �� ��� ������ ��� while���� ����� 
			}
		}
		s.close();
	}
}
