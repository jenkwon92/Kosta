package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

import model.DuplicateTelException;
import model.Employee;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

//Ǯ�̺� ���� ConsoleInstUI1
public class ConsoleUI {
	private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() throws DuplicateTelException, MemberNotFoundException, FileNotFoundException, ClassNotFoundException, IOException {

		System.out.println("*******�л�������α׷��� �����մϴ�******");
		exit: while (true) {
			LinkedHashMap<String,Member> map = service.loadData();
			Collection<Member> col = map.values();
			Iterator<Member> it = col.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("car list�� ������ȭ�Ͽ� Ȯ��");
			System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
			String menu = scanner.nextLine();
			switch (menu) {
			case "1":
				addView();
				break;
			case "2":
				System.out.println("������ �����۾�");
				try {
					deleteView();
				} catch (MemberNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "3":
				System.out.println("������ �˻��۾�");
				findView();
				break;
			case "4":
				System.out.println("**��ü����������**");
				service.printAll();
				break;
			case "5":
				System.out.println("*******�л�������α׷��� �����մϴ�******");
				break exit;
			default:
				System.out.println("�߸��� �Է°��Դϴ�!");
			}
		}
		scanner.close();
	}

	// addView ����
	public void addView() {
		System.out.println("�Է��� �������� ������ �����ϼ��� 1.�л� 2.������ 3.����");
		String info = scanner.nextLine();
		System.out.println("1.��ȭ��ȣ�� �Է��ϼ���");
		String tel = scanner.nextLine();
		System.out.println("2. �̸��� �Է��ϼ���");
		String name = scanner.nextLine();
		System.out.println("3. �ּҸ� �Է��ϼ���!");
		String address = scanner.nextLine();
		Member member = null;
		switch (info) {
		case "1":
			System.out.println("4. �й��� �Է��ϼ���");
			String stuId = scanner.nextLine();
			member = new Student(tel, name, address, stuId);
			break;
		case "2":
			System.out.println("4. ������ �Է��ϼ���");
			String subject = scanner.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3":
			System.out.println("4. �μ��� �Է��ϼ���");
			String department = scanner.nextLine();
			member = new Employee(tel, name, address, department);
			break;
		}
		try {
			service.addMember(member);
			LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();
			System.out.println("����Ʈ �߰� : " + member);
			service.saveData(map);
		} catch (DuplicateTelException de) {
			System.out.println(de.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // addView ��

	// deleteView ����
	public void deleteView() throws MemberNotFoundException {
		System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���");
		String tel = scanner.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel + "�� �ش��ϴ� �������� �����Ͽ����ϴ�.");
		} catch (MemberNotFoundException me) {
			System.out.println(me.getMessage());
		}
	}// deleteView ��

	// findView ����
	public void findView() {
		System.out.println("��ȸ�� �������� ��ȭ��ȣ�� �Է��ϼ���");
		String tel = scanner.nextLine();
		try {
			service.findMemberByTel(tel);
			System.out.println("��ȸ���" + service.findMemberByTel(tel));
		} catch (MemberNotFoundException me) {
			System.out.println(me.getMessage());
		}
	}// findView ��

}
