package test;

import model.Employee;
import model.Member;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addMember(new Student("0101231234", "곽승진", "용인", "17"));
		service.addMember(new Teacher("0101231235", "권용은", "수지", "국어"));
		service.addMember(new Student("0101231236", "김근영", "수원", "16"));
		service.addMember(new Employee("0101231237", "김근원", "화성", "재무부"));
		service.addMember(new Student("0101231238", "김민주", "용인", "18"));
		service.addMember(new Teacher("0101231239", "김병준", "용인", "수학"));
		service.printAll();
		
		System.out.println("********add 완료***********");
		
		
		String tel = "0101231234";
		Member member = service.findMemberByTel(tel);
		System.out.println(member);
		
		System.out.println("********find 완료***********");
		
		
		tel="0101231237";
		System.out.println(service.deleteMemberByTel(tel));
		System.out.println(member);
		
		System.out.println("********delete 완료***********");
		
	}
}
