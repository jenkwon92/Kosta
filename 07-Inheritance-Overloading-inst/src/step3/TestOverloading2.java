package step3;

class Human{
	private String name;
	private int salary;
	Human(){}
	Human(String name){ //������ �����ε� : ������ �̸����� �پ��� �Ű������� ���� 
		this.name=name;
	}
	Human(String name,int salary){//������ �����ε�
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}	
}
public class TestOverloading2 {
	public static void main(String[] args) {
		Human h1=new Human();
		System.out.println(h1.getName()+" "+h1.getSalary());//null 0 
		Human h2=new Human("�迬��");// �پ��� ���ڰ����� ��ü�� ���� 
		System.out.println(h2.getName()+" "+h2.getSalary());//�迬�� 0
		Human h3=new Human("����ȣ",300);// ������ �����ε��� �Ǿ� �����Ƿ� �پ��� ���ڰ����� ��ü�� ������ �� �ִ�
		System.out.println(h3.getName()+" "+h3.getSalary());
	}
}


















