package step7;

public class Employee {
	private String empNo;
	private String name;
	private int salary;
	public Employee(String empNo, String name, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	
	//Object �θ� Ŭ������ toString() �޼��带 �������̵��ؼ� �ּҰ� ��� ���� ���밪�� ��ȯ�ϰ� �Ѵ�
	public String toString() {
		return "empNo:"+empNo+" name:"+name+" salary:"+salary;
	}
}
