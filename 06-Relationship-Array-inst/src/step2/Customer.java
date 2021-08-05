package step2;

public class Customer {
	private String name;
	/*
	 * aggregation : has a ���� �� Customer�� SmartPhone�� ������ �ִ� ���� 
	 * �Ʒ��� ���� �ν��Ͻ� ������ ������ ���� 
	 */
	private SmartPhone smartPhone;
	public Customer(String name) {		
		this.name = name;
	}
	//���ϰ��� ����Ʈ�� ��ü�� �ּҰ��̹Ƿ� ����Ÿ���� Ŭ�������� SmartPhone�� �ȴ� 
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	//setSmartPhone �޼��带 �����غ��� 
	//ȣ���� ������ ������ ���ڰ��� ����Ʈ�� ��ü�� �ּҰ��̰�
	//�̸� ���޹ޱ� ���� �Ű������� Ÿ���� ����Ʈ�� ��ü��
	//Ŭ�������� SmartPhone �� �ȴ� 
	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone=smartPhone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}













