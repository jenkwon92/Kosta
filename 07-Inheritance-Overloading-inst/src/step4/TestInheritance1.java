package step4;
class Animal{
	int age=1;
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{//Person�� Animal�� ��ӹ޴´� 
	public void study() {
		System.out.println("�����ϴ�");
	}
}
public class TestInheritance1 {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.age);//��ӹ޾����Ƿ� ��밡�� 
		p.eat();//���
		p.study();//Person �� ������ ���
	}
}
