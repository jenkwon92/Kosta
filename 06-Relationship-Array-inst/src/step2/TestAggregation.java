package step2;

public class TestAggregation {
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone("������20",120);
		//System.out.println(sp.getModel()+" "+sp.getPrice());
		//�� �ڵ忡 �����ϴ� SmartPhone class�� �����غ��� ( instance variable : model,price , constructor, getter,setter)
		Customer customer=new Customer("����");
		customer.setSmartPhone(sp);
		System.out.println(customer.getName());
		//���� ���� ����Ʈ�� �𵨸��� ��ȯ�޾� ����غ��� 
		System.out.println(customer.getSmartPhone().getModel());
		//���� ���� ����Ʈ�� ������ ��ȯ�޾� ����غ���
		System.out.println(customer.getSmartPhone().getPrice());
		System.out.println("******************");
		Customer customer2=new Customer("���");
		customer2.setSmartPhone(new SmartPhone("������9", 200));
		//custmer2 �� ��� ���� ����Ʈ�� �𵨸��� ��ȯ�޾� ���
		System.out.println(customer2.getSmartPhone().getModel());
		//������ ��� 
		System.out.println(customer2.getSmartPhone().getPrice());
		//customer2 ���� ����Ʈ�� model���� ������11�� �����Ѵ� 
		customer2.getSmartPhone().setModel("������11");
		System.out.println(customer2.getSmartPhone().getModel());//������11
	}
}

















