package step5.access;

// ���� ������ �׽�Ʈ�� ���� Ŭ���� , protected ���� �����ڸ� Ȯ���غ��� 
public class Bank {
	public void publicTest() {
		System.out.println("public method");
	}

	protected void protectedTest() {
		System.out.println("protected method");
	}

	void defaultTest() {
		System.out.println("default method");
	}

	/*
	 * private void privateTest() { System.out.println("private method"); }
	 */

}
