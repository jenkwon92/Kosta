package test.step1;

import model.DuplicateTelException;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseAdd {
	public static void main(String[] args) {
		SchoolService service=new SchoolService();
		try {
			service.addMember(new Student("011","������","����","21"));
			System.out.println("��� ok");
		}catch(DuplicateTelException de) {//���� tel�� �����ϸ� 
			System.out.println(de.getMessage());//011 tel �ߺ��Ǿ� ��ϺҰ��մϴ�!
		}
		try {
			service.addMember(new Teacher("016","RM","����","����"));
			System.out.println("��� ok");
		}catch(DuplicateTelException de) {//���� tel�� �����ϸ� 
			System.out.println(de.getMessage());//016 tel �ߺ��Ǿ� ��ϺҰ��մϴ�!
		}	
		try {
			service.addMember(new Teacher("011","�����","����","����"));//-> �ߺ��ȴ� 
			System.out.println("��� ok");
		}catch(DuplicateTelException de) {//���� tel�� �����ϸ� 
			System.out.println(de.getMessage());//011 tel �ߺ��Ǿ� ��ϺҰ��մϴ�!
		}	
		service.printAll(); // �� ���� ������ ( toString() ) �� ��µǾ�� �Ѵ� 
	}
}




