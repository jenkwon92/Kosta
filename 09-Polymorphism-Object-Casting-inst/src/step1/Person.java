package step1;

public class Person extends Animal{
	@Override //@ : ������̼�(�ǹ��ִ� �ּ�, �����ϰ� ��Ÿ�ӿ� ������ �ش�) 
	//@Override: �޼��� �������̵� �� ������ ������ �������̵� ������ üũ  
	public void eat() {// �޼��� �������̵��� �θ� �޼��带 �ڽſ� �°� ������ 
		System.out.println("����� ������ �Դ�");
	}
}
