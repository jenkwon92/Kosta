package step2;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput {
	//�ֿܼ��� �Է¹޴� ����
	public static void main(String[] args) {
		//�ֿܼ� ����Ǵ� NodeStream �� �Է½�Ʈ��
		InputStream is = System.in;
		//ProcessingStream ��� ����
		Scanner s = new Scanner(is);
		System.out.print("ģ���̸��� �Է��ϼ��� : ");
		String name = s.nextLine();  //�̸��� �Է��� enter ������ ������ ���
		System.out.println("ģ���̸� : "+name);
		s.close();
	}
}
