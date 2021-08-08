package step1;

class Animal{ //extends Object
	int age;
	//Animal(){} 2. �θ� Ŭ������ �����ڸ� �����ε��Ͽ� �⺻ �����ڸ� �߰�
	Animal (int age){
		this.age = age;
	}
}
// Person class�� error�� ���� ������ �⺻���� ���ԵǴ� �������� super()��
// �θ��� �Ű������� ���� �⺻ �����ڸ� ȣ���ϱ� ����
//Animal �θ� Ŭ������ �⺻ �����ڰ� �������� �����Ƿ� �Ʒ� Ŭ������ compile error�� ����.
// �ذ� ����� 1. �ڽ� Ŭ������ �����ڿ��� super() �� ����� �� �θ� �������� �Ű������� �˸´� ���ڰ��� �����ϸ� �ȴ�
//				  2. �θ� Ŭ������ �����ڸ� �����ε��Ͽ� �⺻ �����ڸ� �߰��Ѵ�.
class Person extends Animal{
	String name;
	//�Ʒ� �����ڴ� compile error �� ���� ���̽�
	/*
	 * Person(){ super(); }
	 */
	//�����ڸ� ����ϰ� ������ ���ڰ��� �����ϴ� super(���ڰ�) �� ����ϸ� �ȴ�
	Person(int age, String name){
		super(age); //�ݵ�� ù���ο� ��ġ�Ǿ�� �Ѵ�
		this.name = name;
	}
}

public class TestSuper3 {
	public static void main(String[] args) {
		Person  p = new Person(22,"������"); //Object->Animal->Person ������ ��ü ����
		System.out.println(p.name+" "+p.age);
	}
}
