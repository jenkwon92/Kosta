package step6.solution;

//�������� 
public class TestPolymorphismEx {
	public static void main(String[] args) {
		//CompanyService �� �ڽ��� instance variable�� 
		//10���� length�� ���� �迭�� �����ϰ� �����ڿ��� �ʱ�ȭ�Ѵ�  
		
		CompanyService service=new CompanyService(10);
		service.add(new Manager("12","������",500,"��������"));
		service.add(new Engineer("23","�ں���",700,"java"));
		service.add(new Employee("35","���ϴ�",300));
		service.printAll();
		
		/*
		 	empNo:12 name:������ salary:500 department:�������� 
		 	empNo:23 name:�ں��� salary:700 skill:java
		 	empNo:35 name:���ϴ� salary:300 
		 */
		//���߼��� : Employee , Manager, Engineer , CompanyService
		System.out.println("********add �Ϸ�***********");
		
		String empNo="23";
		Employee emp=service.findEmployeeByEmpNo(empNo);
		System.out.println(emp);
		//empNo:23 name:�ں��� salary:700 skill:java
		empNo="35";
		Employee emp2=service.findEmployeeByEmpNo(empNo);
		System.out.println(emp2);
		//empNo:35 name:���ϴ� salary:300
		empNo="99";
		Employee emp3=service.findEmployeeByEmpNo(empNo);
		System.out.println(emp3);
		//null 
		System.out.println("********find �Ϸ�***********");
		empNo="99";
		service.deleteEmployeeByEmpNo(empNo);
		//�������� ���� ���� �Ʒ��� ���� �޼����� ��µȴ� 
		//99 �����ȣ�� �ش��ϴ� ����� ���� ���� �Ұ� 
		
		//�����ϸ� �����ȣ�� �ش��ϴ� �迭 ��Ҹ� ���� 
		empNo="12";
		service.deleteEmployeeByEmpNo(empNo);
		service.printAll();
		/*
		 	empNo:23 name:�ں��� salary:700 skill:java
		    empNo:35 name:���ϴ� salary:300
		 */
	}
}













