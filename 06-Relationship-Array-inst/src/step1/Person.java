package step1;

public class Person {
	private String name;
	public Person(String name) {	
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	 *  association �� use a ����� ��� ��ü�� ����ϴ� ���� 
	 *  �Ʒ��� ���� ��� ��ü(RentCar)�� ��������local variable�� ����,�����Ͽ� 
	 *  ����ϰ� �޼��尡 ����Ǹ� �޸𸮿��� �����ǵ��� �����Ѵ� 
	 */
	public void tour() {
		RentCar car=new RentCar("�׽���","����");
		System.out.println(name+" "+car.getColor()+"�� "+car.getModel()+" ��Ʈī Ÿ�� �����ϴ�");
	}
	
}


















