package step2;

import step1.Dog;
import step1.Monkey;
import step1.Person;

// instanceof ������ �׽�Ʈ : is a ����� true , ��ü�� Ÿ���� �� 
public class TestInstanceof {
	public static void main(String[] args) {
		ZooService2 service=new ZooService2();
		service.pass(new Person());
		service.pass(new Dog());
		service.pass(new Monkey());
	}
}
