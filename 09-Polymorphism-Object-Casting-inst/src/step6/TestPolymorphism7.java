package step6;
/*
 *  ������ ���� �迭 ���� : �θ� Ÿ���� �迭 ��ü�� �ڽ� ��� ��ü�� �߰��ؼ� ������ �� �ִ� 
 */
class Car{}
class Animal{}
class Person extends Animal{}
class Dog extends Animal{}
public class TestPolymorphism7 {
	public static void main(String[] args) {
		// �迭 Array�� �Ϲ������� ����� Ÿ�����θ� ��ҷ� ������ �����ϴ� 
		Animal[] ani1= new Animal[3];
		ani1[0]=new Animal();
		ani1[1]=new Person();// �θ� Ÿ���� �迭�� �ڽ� ��ü�� ��ҷ� �߰��� �� �ִ� -> ������ ����迭 
		//�Ʒ��� Car ��ü�� Animal �� is a ���谡 �ƴϹǷ� compile error 
		//ani1[2]=new Car();
		ani1[2]=new Dog();// is a �����̹Ƿ� �߰� ���� 
	}
}
