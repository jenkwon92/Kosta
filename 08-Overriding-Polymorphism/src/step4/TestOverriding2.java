package step4;

public class TestOverriding2 {
	public static void main(String[] args) {
		//step1
		Employee e=new Employee("1","������",400);
		System.out.println(e.getDetails()); //empNo:1 , name:������  salary:400
		
		//step2
		Engineer en = new Engineer("2","�̰���",500,"�ڹ�");
		System.out.println(en.getDetails());
		
		//step3
		Manager m= new Manager("3","�迬��",700,"��������");
		System.out.println(m.getDetails());
	}
}
