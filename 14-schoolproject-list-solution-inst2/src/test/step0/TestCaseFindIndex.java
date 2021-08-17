package test.step0;

import model.Employee;
import model.SchoolService;
import model.SchoolServiceImplVer2;
import model.Student;
import model.Teacher;

public class TestCaseFindIndex {
	public static void main(String[] args) {
		// �����丵 ��� SchoolServiceImplVer2 �� �׽�Ʈ 
		SchoolService service=new SchoolServiceImplVer2();
		service.addMember(new Student("0101231234", "������", "����", "17"));
		service.addMember(new Teacher("0101231235", "�ǿ���", "����", "����"));
		service.addMember(new Student("0101231236", "��ٿ�", "����", "16"));
		service.addMember(new Employee("0101231237", "��ٿ�", "ȭ��", "�繫��"));
		service.addMember(new Student("0101231238", "�����", "����", "18"));
		service.addMember(new Teacher("0101231239", "�躴��", "����", "����"));
		System.out.println("**findIndexByTel test ����**");
		int index=service.findIndexByTel("7777");//�������� �ʴ� tel�� �׽�Ʈ 
		System.out.println("index:"+index);//-1 
		index=service.findIndexByTel("0101231236");//�����ϴ� tel�� �׽�Ʈ 
		System.out.println("index:"+index);//2
		System.out.println("**findIndexByTel test ����**");
	}
}










