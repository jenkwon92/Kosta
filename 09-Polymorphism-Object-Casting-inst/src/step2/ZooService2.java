package step2;

import step1.Animal;//import ����Ű ctrl+shift+o
import step1.Dog;
import step1.Person;

public class ZooService2 {
	
	public void pass(Animal a) {
		if(a instanceof Person) {
			System.out.println("���� ����̴�");
		}else if(a instanceof Dog) {
			System.out.println("���� ����");
		}
		System.out.println("**is a ���� �׽�Ʈ**");
		//instanceof �� is a ���谡 �����Ǹ� true�� ��ȯ 
		System.out.println(a instanceof Animal);
	}
}
