package step5;

import step4.solution.Employee;

//java.lang.Object �� method �� ����غ��� ����
class Car{ //extends Object
	//Car(){super();}
}
public class TestObject1 {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.getClass()); //��ӹ��� Object�� getClass() �޼��带 ȣ���� �� ��ü�� � Ŭ������ �����Ǿ������� Ȯ��
		Employee e = new Employee("1","������",100);
		System.out.println(e.getClass());
	}
}
