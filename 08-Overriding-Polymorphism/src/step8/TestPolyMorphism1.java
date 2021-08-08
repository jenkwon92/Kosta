package step8;
//�������� ����Ǹ� �ϳ��� ��ü�� ���� Ÿ���� ������ ������ �� �ִٴ� ���� Ȯ���ϴ� ����
class Animal {
	public void eat() {
		System.out.println("�Դ�");
	}
	
	public void sleep() {
		System.out.println("�ڴ�");
	}
}

class Person extends Animal{
	//�޼��� �������̵�
	public void eat() {
		System.out.println("����� �Դ�");	
	}
}
public class TestPolyMorphism1 {
	public static void main(String[] args) {
		//�Ϲ������� �Ʒ��� ���� ��ü�� �����Ѵ�
		//Person p = new Person();
		//�Ʒ��� ���� �θ� Ÿ�� Animal �� p�����ε� ��ü�� ������ �����ִ�
		// -> �Ʒ� �ڵ����ó�� �θ� Ÿ���� ������ ���� �����ϴٴ� ���� � ������ ������?
		
		Animal p = new Person();
		p.sleep(); //��ӹ��� �θ� �޼��尡 ����
		p.eat(); //�ڽ��� �������̵��� �޼��尡 ����
	}
}
