package step4;
//abstract method�� �ϳ� �̻� �����ϸ� abstract class�� ����Ǿ�� �Ѵ� 
abstract class Parent{
	int money=100;
	public void eat() {
		System.out.println("�Դ�");
	}
	//abstract method 
	public abstract void study();
}
class Child extends Parent{
	//��ӹ޴� Parent class�� abstract method�� �ݵ�� �����ؾ� �Ѵ�. ���� �������� ������ �ڽ��� abstract class�� ����Ǿ�� �Ѵ� 
	@Override
	public void study() {
		System.out.println("�����ϴ�");
	}	
}
public class TestAbstract2 {
	public static void main(String[] args) {
		Parent p=new Child();
		System.out.println(p.money);//�θ�κ��� ��ӹ��� �ν��Ͻ� ���� 
		p.eat();//��ӹ��� �޼��� 
		p.study();//�������̵��� �ڽ��� �޼��� 
	}
}












