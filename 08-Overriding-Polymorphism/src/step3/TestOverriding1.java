package step3;
class Animal {
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	//�޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� ������
	  public void eat() { 
		  System.out.println("����� ������ ����ϴ�"); 
		  super.eat(); //super keyword �� �̿��� �θ� eat �޼��带 ȣ��
	}
}
class Dog extends Animal{
	//�޼��� �������̵�
	public void eat() {
		System.out.println("�������� ���ٴ��� ����ϴ�");
		super.eat();
	}
}
class Student extends Person{
	public void eat() {
		System.out.println("�л��� �����ϸ� �Ļ��Ѵ�");
		super.eat();
	}
	
}
public class TestOverriding1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat(); //�������̵��� �ڽ��� �޼��尡 ����
		Dog d = new Dog();
		d.eat();
		Student s = new Student();
		s.eat();
	}
}
