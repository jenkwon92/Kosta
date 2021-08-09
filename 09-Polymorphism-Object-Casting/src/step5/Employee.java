package step5;

public class Employee {
	private String empNo;
	private String name;
	private int salary;
	
	public Employee(String empNo, String name, int salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "empNo:"+empNo+" name:"+name+" salary:"+salary;
	}
	
}
