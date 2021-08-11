package step1;
/*
 * static member�� ������ ��ü ������ �ʿ���� Ŭ���� �ε常���� ��밡��
 * -> static member�� ������ ���� Ŭ������.���(�޼���, ����) 
 */
class Person{
	int money1;//instance variable : heap ������ ���� 
	static int money2;//static variable : meta space ������ ���� -> Class loading ������ �޸𸮿� ���� 
	public void test1() {
		System.out.println("object member method");
	}
	public static void test2() {
		System.out.println("static member method");
	}
}
public class TestStatic1 {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.money1);//money1�� instance variable�̹Ƿ� �� ���ΰ� ���� ��ü ������ �ʿ�
		p.test1();//��ü�� ��� �޼����̹Ƿ� ��������.�޼���� ȣ���Ѵ� 
		//static member�� ������ ��ü �������� Ŭ���������� ���� ���� 
		System.out.println(Person.money2);
		Person.test2();
	}
}





