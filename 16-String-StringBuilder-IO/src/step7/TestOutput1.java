package step7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��½�Ʈ�� �׽�Ʈ ����
 * Ư�� ������ �����ؼ� �����͸� ����غ��� ����
 * 
 */
public class TestOutput1 {
	public static void main(String[] args) {
		//��ġ�� ����Ǵ� Node Stream �迭�� ����
		try {
			FileWriter fw = new FileWriter("C:\\kosta224\\iotest\\memo.txt");
			//����� �����ϴ� Processing Stream �迭�� ����
			PrintWriter pw = new PrintWriter(fw);
			pw.print("���½ð��Դϴ�");
			System.out.println("���� ���� �� ���");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
