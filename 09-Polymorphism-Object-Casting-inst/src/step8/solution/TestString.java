package step8.solution;

public class TestString {
	public static void main(String[] args) {
		String name1="������";
		//���ڿ��� ����� ����� �پ�, �Ʒ��� ���� ������� ���� 
		String name2=new String("������");
		System.out.println(name1+" "+name2);//�� �� �������� ��� 
		System.out.println(name1==name2);//���ڿ� �񱳽� == �����ڴ� ������� �ʴ´� 
		System.out.println(name1.equals(name2));//String class�� equals() �޼���� ���ڿ��� ���Ѵ� 
	}
}
