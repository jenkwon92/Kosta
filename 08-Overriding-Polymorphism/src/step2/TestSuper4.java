package step2;

public class TestSuper4 {
	public static void main(String[] args) {
		Employee e = new Employee("123","������",500);
		System.out.println(e.getEmpNo()+" "+e.getName()+" "+e.getSalary());
		Manager m = new Manager("124","�����",700,"���ߺ�");
		System.out.println(m.getEmpNo()+" "+m.getName()+" "+m.getSalary()+" "+m.getDepartment());
		//Manager is a Employee -> is a ����
		//Empolyee �� instance variable :3��
		//Manager �� instance variable : 1 ��
		
		//Employee�� Manager class�� ������ ����
	}
}
