package step1;

public class TestPolymorphism3 {
	public static void main(String[] args) {
		ZooService service = new ZooService();
		service.pass(new Person());
		service.pass(new Dog());
		//�Ʒ��� ���� Monkey�� �߰��ȴ�
		//�������� �����ǹǷ� Service Ŭ���� ���� 
		//�߰� ������ �ʿ����
		service.pass(new Monkey());
	}
}
