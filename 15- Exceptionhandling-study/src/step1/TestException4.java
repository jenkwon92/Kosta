package step1;

import java.util.ArrayList;

public class TestException4 {
	public static void main(String[] args) {
		String name="������";
		/*
		 * array�� arrayList ���� 
		 * �迭�� primitive type(int, byte, char ��)�� object ��θ� ���� �� ������, arrayList�� object element�� ���� �� �ִ�.
		 * �迭�� ���׸��� ����� �� ������, arrayList�� Ÿ�� �������� �������ִ� ���׸��� ����� �� �ִ�.
		 * ���̿� ���� �迭�� length ������ ����, arrayList�� size() �޼��带 ����Ѵ�.
		 * �迭�� element���� �Ҵ��ϱ� ���� assignment(�Ҵ�) �����ڸ� ����ϰ�, arrayList�� add() �޼��带 ���� element�� �����Ѵ�
		 */
		name=null;
		ArrayList<String>list = new ArrayList<String>();
	
			try {
				System.out.println(name.length());
				System.out.println(list.get(0));
			}catch(NullPointerException ne){
				System.out.println("�̸��� �Է����ּ���");
			}catch(IndexOutOfBoundsException ie){
				System.out.println("����Ʈ ������ �ʰ��� �����Դϴ�");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				System.out.println("�׻����ȴ�");
			}
			System.out.println("���α׷� ���� ����");
		
	}
}
