package step8;

class GrandParent{//extends Object -> ��� ���谡 ���� Ŭ������ extends Object�� �ڵ����� 
	GrandParent(){//super(); �� �ڵ����� -> ��� �ڹ� Ŭ������ root or �ֻ��� Ŭ������ Object�� �����ڸ� ȣ���� Object ��ü�� ���� 
		System.out.println("GrandParent ��ü����");
	}
}

class Parent extends GrandParent{
	Parent(){//super(); �� �ڵ� ���� 
		System.out.println("Parent ��ü����");		
	}
}
class Child extends Parent{
	Child(){
		//super();// ������ �ڵ����� ���� 
		System.out.println("Child ��ü����");
		//super();//super()�� ������ �ȿ��� ù���ο� ��ġ�Ǿ�� �Ѵ�. �ƴϸ� compile error 
	}
}
public class TestSuper2 {
	public static void main(String[] args) {
		new Child();//�ڽ� ��ü�� �����ϸ�  �θ�ü->�ڽİ�ü ������ �����ȴ� 
	}
}
