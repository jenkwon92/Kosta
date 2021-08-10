package step5.service;

public abstract class PizzaService {
	protected void prepare() {
		System.out.println("���츦 �����");
	}
	/*
	 *  �θ� �������� ������ �� ���� �޼���� abstract�� �����ؼ�
	 *  �ڽ� Ŭ���� �������� �ݵ�� �����ϰ� �����Ѵ�
	 */
	protected abstract void topping();
	protected void bake() {
		System.out.println("����");
	}
	
	protected void cutting() {
		System.out.println("�ڸ���");
	}
	protected void boxing() {
		System.out.println("�����ϴ�");
	}
	
	/*
	 * �۾� ����(�˰���) �� ������ �ڽ� Ŭ�������� �����ִ� ���ø� �޼���
	 */
	public void makePizza() {
		prepare();
		topping(); //�ڽ� ��ü�� �������̵��� �޼��尡 ȣ��
		bake();
		cutting();
		boxing();
	}
}
