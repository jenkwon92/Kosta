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
		try {
			//��ġ�� ����Ǵ� Node Stream �迭�� ����
			FileWriter fw = new FileWriter("C:\\kosta224\\iotest\\memo.txt");
			//����� �����ϴ� Processing Stream �迭�� ����
			PrintWriter pw = new PrintWriter(fw);
			pw.print("���½ð��Դϴ�");
			System.out.println("���� ���� �� ���");
			pw.close(); //��Ʈ���� �ݾ��ش�(�̋� �߰������� �޸�(buffer)�� �ִ� �����͸� ���� ���Ͽ� ����Ѵ� - flush() ȣ��)
			//��Ʈ���� close ��, �ݾ��شٴ� ���� ��ġ�� ����� ������ ���������ν� �ٸ� �۾��ڰ� �ش� device�� ������ �� �ֵ��� �Ѵٴ� �ǹ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
