package step3;
//abstract class �� abstract method test 
//abstract class �� ���� ��üȭ �� �� ���� -> �θ� Ŭ���� ���ҿ� ����
//abstract method�� �ϳ� �̻� �����ϸ� �ش� Ŭ������ abstract �� ����Ǿ�� �Ѵ� 
abstract class Animal{
	Animal(){
		System.out.println("Animal ��ü ����");
	}
	//abstract method�� �����ΰ� �������� �ʰ� ���� �Ѵ� 
	//�ڽ�(����) Ŭ�������� ������ �����Ѵ� 
	public abstract void eat();
}
// Animal �� ��� ������ Animal�� abstract method�� �����ϰų� �ƴϸ� �ڽŵ� abstract�� ����Ǿ�� �Ѵ� 
class Person extends Animal{
	Person(){ super();
		System.out.println("Person ��ü ����");
	}
	@Override
	public void eat() {
		System.out.println("����� �Դ�");
	}
}
public class TestAbstract1 {
	public static void main(String[] args) {
		//Animal a=new Animal();// abstract class �� ����ȭ �� �� ����( �� ���� ��ü ���� �� �� ���� ) 
		Animal a=new Person();//�ڽ� ��ü ������ super() �� �̿��ؼ� ��ü ������ �ȴ� -> abstract class�� �θ� Ŭ�����μ��� ���ҿ� ���� 
		a.eat();
	}
}









