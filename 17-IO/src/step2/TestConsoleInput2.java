package step2;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput2 {
	//�ֿܼ��� �Է¹޴� ����2
	/*
	  ģ���̸��� �Է��ϼ��� : ������
	  ģ���̸� : ������
	  ģ���̸��� �Է��ϼ��� : ��ȿ��
	  ģ���̸� : ��ȿ��
	  ģ���̸��� �Է��ϼ��� : �̻��
	  ģ���̸� : �̻��
	  ģ���̸��� �Է��ϼ��� : ����
	  ���α׷��� ����Ǿ����ϴ�
	  
	  while(true)P
	  	nextLine(); //���
	  	if(){
	  		break; //�ش� while���� �����
	  	}
	 */
	public static void main(String[] args) {
		//�ֿܼ� ����Ǵ� NodeStream �� �Է½�Ʈ��
		InputStream is = System.in;
		//ProcessingStream ��� ����
		Scanner s = new Scanner(is);
		while(true) {
			System.out.print("ģ���̸��� �Է��ϼ��� : ");
			String name = s.nextLine();  //�̸��� �Է��� enter ������ ������ ���
			if(name.equals("����")) {
				break;
			}
			System.out.println("ģ���̸� : "+name);
		}
		s.close();
	}
}
