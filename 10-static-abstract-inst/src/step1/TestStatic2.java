package step1;

public class TestStatic2 {
	//instance variable 
	String name="������";
	//static variable : static ��� ����� �����ϰ� �ؾ� �Ѵ� -> class loading ������ �ѹ� �޸𸮿� ���� , ��� ������ �ǹǷ�
	static String name2="�ں���";
	//object member method
	public void test1() {
		System.out.println("object member method test1 "+name);
	}
	//static member method 
	public static void test2() {
		//test1(); //compile error : static -> non-static ���� �ٷ� ���� �Ұ� 
		//�Ʒ��� ���� ��ü �����ؾ� �Ѵ� 
		new TestStatic2().test1();
	}
	public void test3() {
		test2();// object �� member method test3() �� ������ ���ؼ��� ��ü ������ ������ �ϹǷ� static member�� �ٷ� ���� ����
		// test3() �� ����ȴٴ� ���� class loading -> ��ü ���� �� ������ �ϴϱ� static�� �̸� class loading ������ ����ǹǷ� 
		// non-static ���� static���� �ٷ� ���� ���� 
	}
	public static void main(String[] args) {
	System.out.println("main method�� static method�̴�");
	// compile error : name�� instance variable �̹Ƿ� ��ü �����ÿ��� �޸𸮿� ���� 
	// static ���� non-static���� �ٷ� ������ �Ұ� 	
	//	System.out.println(name);
	// ���� Ŭ���� �������� ��ü�� �����ؼ� �����ؾ� �Ѵ� 
		TestStatic2 t=new TestStatic2();
		System.out.println(t.name);
		t.test1();
		System.out.println(name2);//static member�̹Ƿ� �ٷ� ���� ���� 
	}
}




