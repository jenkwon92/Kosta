package test;

import model.Employee;
import model.Member;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addMember(new Student("0101231234", "������", "����", "17"));
		service.addMember(new Teacher("0101231235", "�ǿ���", "����", "����"));
		service.addMember(new Student("0101231236", "��ٿ�", "����", "16"));
		service.addMember(new Employee("0101231237", "��ٿ�", "ȭ��", "�繫��"));
		service.addMember(new Student("0101231238", "�����", "����", "18"));
		service.addMember(new Teacher("0101231239", "�躴��", "����", "����"));
		service.printAll();
		
		System.out.println("********add �Ϸ�***********");
		
		
		String tel = "0101231234";
		Member member = service.findMemberByTel(tel);
		System.out.println(member);
		
		System.out.println("********find �Ϸ�***********");
		
		
		tel="0101231237";
		System.out.println(service.deleteMemberByTel(tel));
		System.out.println(member);
		
		System.out.println("********delete �Ϸ�***********");
		
	}
}
