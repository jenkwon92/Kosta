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
	
	case 2
	TestException1 ��Ȳ���� Exception Handling (����ó��) �� �ϴ� ����
	try�� catch��� java Ű���带 �̿��� Ư�� ���� ��Ȳ�� �߻��Ǹ� ����帧�� �����ϰ� 
	���α׷��� ���� ����ǵ��� ���ܸ� ó���Ѵ�.
	try{
		//���� ��Ȳ �߻� ���� ����
	} catch(NullPointerException ne){ //���ܰ� �߻��� �� catch ������ ����ȴ�
		//���� ó���Ͽ� ��� �帧�� �����ϴ� ����
	}
	
	case1�� case2 �� ���̴� case2���� try catch�� �̿��� Exception Handling �ؼ�
	���� ��Ȳ �߻��� ���α׷� ������ ������� �ʰ� 
	����帧�� ������ �� ���α׷��� ���� ����Ǵµ� �ִ�
 */
public class TestException2 {
	public static void main(String[] args) {
		String name = "������";
		//test�� ���� name�� null�� ���Ҵ��غ��� 
		name  = null; 
		try { //try ���� ���� �߻� ���� ����
			System.out.println(name.length()); //3���� ���ڷ� ����
		}catch (NullPointerException ne) { //���� �߻��ϸ� ����Ǵ� ����
			System.out.println("name������ �����Ƿ� ���̸� ���� �� �����ϴ�");
		}
		System.out.println("���α׷� ���� ����");
	}
}
