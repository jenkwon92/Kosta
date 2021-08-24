package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import model.DuplicateTelException;
import model.Employee;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

//������ �߰� �� ��üȸ������, �˻� , ����
// ��ü ����ȭ�� ���� ������ ����
public class ConsoleInstUI7 {
	private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() {
		try {
			service.loadData();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("*******�л�������α׷��� �����մϴ�******");

		exit:  while (true) {
			System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
			String menu = scanner.nextLine();
			switch (menu) {
			case "1":
				addView();
				break;
			case "2":
				deleteView();
				break;
			case "3":
				findView();
				break;
			case "4":
				System.out.println("**��ü����������**");
				service.printAll();
				break;
			case "5":
				try {
					service.saveData();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("*******�л�������α׷��� �����մϴ�******");
				break exit;
			default:
				System.out.println("�߸��� �Է°��Դϴ�!!");
				break ;
			}//switch
		}//while
		if(scanner != null)
		scanner.close();
	}// execute method

	public void addView() {
		Member member = null;
		System.out.println("�Է��� �������� ������ �����ϼ��� 1.�л�  2.������ 3.����");
		String info = scanner.nextLine();
		System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���");
		String tel = scanner.nextLine();
		System.out.println("2. �̸��� �Է��ϼ���");
		String name = scanner.nextLine();
		System.out.println("3. �ּҸ� �Է��ϼ���");
		String address = scanner.nextLine();
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
		} catch (DuplicateTelException e) {
			e.printStackTrace();
		}
		System.out.println("����Ʈ�� �߰� : " + member);
	}// addView method

	public void deleteView(){
		System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���");
		String tel = scanner.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel + "�� �ش��ϴ� �������� �����Ͽ����ϴ�");
		} catch (MemberNotFoundException e) {
			e.printStackTrace();
		}
	}// delete method

	public void findView() {
		System.out.println("��ȸ�� �������� ��ȭ��ȣ�� �Է��ϼ���");
		String tel = scanner.nextLine();
		try {
			Member member = service.findMemberByTel(tel);
			System.out.println("��ȸ��� : "+member);
		} catch (MemberNotFoundException e) {
			e.printStackTrace();
		}
	}// find method

}// class
