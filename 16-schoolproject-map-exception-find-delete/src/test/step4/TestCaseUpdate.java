package test.step4;

import model.DuplicateTelException;
import model.Employee;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseUpdate {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		try {
			service.addMember(new Student("011", "������", "����", "21"));
			System.out.println("��� ok");
		} catch (DuplicateTelException de) {// ���� tel�� �����ϸ�
			System.out.println(de.getMessage());// 011 tel �ߺ��Ǿ� ��ϺҰ��մϴ�!
		}
		try {
			service.addMember(new Teacher("016", "RM", "����", "����"));
			System.out.println("��� ok");
		} catch (DuplicateTelException de) {// ���� tel�� �����ϸ�
			System.out.println(de.getMessage());// 016 tel �ߺ��Ǿ� ��ϺҰ��մϴ�!
		}
		service.printAll(); // �� ���� ������ ( toString() ) �� ��µǾ�� �Ѵ�
		System.out.println("**��ϿϷ�***");
		//���������帧 �׽�Ʈ
		try {
			//������Ʈ�� ��ü 
			Employee e = new Employee("011", "�����", "����", "��������");
			service.updateMember(e);
			System.out.println("�����Ϸ�");
		} catch (MemberNotFoundException me) {
			System.out.println(me.getMessage());
		}
		//���� �����帧
		try {
			//������Ʈ�� ��ü 
			Teacher t = new Teacher("018", "�����", "����", "����");
			service.updateMember(t);
			System.out.println("�����Ϸ�");
		} catch (MemberNotFoundException me) {
			System.out.println(me.getMessage()); //018 tel�� �ش��ϴ� �������� �������� �ʾ� �����Ұ�
		}
		service.printAll();
	}
}
