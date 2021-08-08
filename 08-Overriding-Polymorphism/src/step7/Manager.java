package step7;

public class Manager extends Employee{
	private String department;

	public Manager(String emNo, String name, int salary, String department) {
		super(emNo, name, salary);
		this.department = department;
	}
	
	public String toString() {
		return super.toString()+" department:"+department;
	}
}
