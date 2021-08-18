package step5;

import java.io.IOException;

/*
 * CheckedException : throws�� �ʿ��� Exception
 * UnCheckedException : ������ throws ��ð� �ʿ���� Exception ->Runtime�� ���� Ŭ����(subclass)
 */
 class Test{
	 public void test1(String salary) {
		 int m = Integer.parseInt(salary);
		 System.out.println("���� : "+m*12);
	 }
	 public void test2(int i) throws IOException {
		 if(i<0) {
			 throw new IOException();
		 }
		 System.out.println("���� �����");
	 }
 }
public class TestThrows6 {
	public static void main(String[] args) {
		Test t = new Test();
		//t.test1("400");
		//t.test1("��õ");
		try {
			t.test2(7);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
