package test;
/*
 * Nested Class ��ø Ŭ����
 * class ���ο� class�� ����
 * private member�� �ٸ� Ŭ�������� ������ �� ������ nested class(inner class) ������ ���ٰ���
 * �ݵ�� Outer class �� ��ü ������ ���ؼ� Inner class�� ��ü ������ ����
 */
public class TestNestedClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.test();
		outer.writerTest();
		System.out.println("******");
		//ClientOuter co = new ClientOuter();
	}
}
