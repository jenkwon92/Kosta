package step4.solution;

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

	public String getDetails() {
		return "empNo:" + empNo + " name:" + name + " salay:" + salary;
	}
}
