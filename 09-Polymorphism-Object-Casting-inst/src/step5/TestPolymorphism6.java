package step5;

public class TestPolymorphism6 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		service.printDetailInfo(new Manager("1","������",500,"������"));
		//empNo:1 name:������ salary:500 department:������
		service.printDetailInfo(new Engineer("2","����",700,"java"));
		//empNo:2 name:���� salary:700 skill:java
		service.printDetailInfo(new Employee("3","�˼���",400));
		//empNo:3 name:�˼��� salary:400 
	}
}
