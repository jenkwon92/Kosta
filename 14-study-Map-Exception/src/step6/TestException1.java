package step6;
/*
 * case 1
 * ���α׷� ���� �� Exception ��Ȳ �߻��Ǹ� 
 * JVM�� Exception ��ü�� ������ �޼����� �ֿܼ� ����ϰ� ���α׷� �����Ű�� ���� Ȯ���ϴ� ����
 * 
 * �Ʒ� �ڵ带 �����ϸ� 
 * JVM��  Exception in thread "main" java.lang.NullPointerException
	at step6.TestException1.main(TestException1.java:16)
	�޼����� �ܼ�ȭ�鿡 ����ϰ� ���α׷��� ������ ����ȴ�
 */
public class TestException1 {
	public static void main(String[] args) {
		String name = "������";
		//test�� ���� name�� null�� ���Ҵ��غ��� 
		name  = null; 
		System.out.println(name.length()); //3���� ���ڷ� ����
		System.out.println("���α׷� ���� ����");
	}
}
