package step1;

public class TestStatic4 {
	public static void main(String[] args) {
		//java se api ���� �����ϴ� static ����ϱ� 
		String s1="1";
		String s2="2";
		int i=3;
		System.out.println(s1+s2+i);//123 ( ���ڿ��̹Ƿ�)
		//java.lang.Integer class�� static method�� �̿��� ���ڿ��� ������ ��ȯ 
		int num1=Integer.parseInt(s1);//���ڿ��� ������ ��ȯ 
		int num2=Integer.parseInt(s2);
		System.out.println(num1+num2+i);
	}
}
