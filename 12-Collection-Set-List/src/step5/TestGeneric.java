package step5;

import java.util.ArrayList;

class Animal{}
class Person extends Animal{}
class Dog extends Animal{}
class Car{}
public class TestGeneric {
	public static void main(String[] args) {
		//Generic�� is a ����ÿ��� ��ҷ� �߰� ����
		ArrayList <Animal> list = new ArrayList<Animal>();
		list.add(new Animal());
		list.add(new Person()); //Animal �� �ڽ��̹Ƿ� ���� 
		list.add(new Dog()); //Animal �� �ڽ��̹Ƿ� ���� 
		//list.add(new Car()); //compile error, Animal ���� �����Ͽ� ���� �����Ƿ�
	}
}
