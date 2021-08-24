package view;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

import model.DuplicateTelException;
import model.Employee;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class ConsoleUI {
	private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);
	
	public void execute() {
		System.out.println("*******�л�������α׷��� �����մϴ�******");
		exit: while (true) {
			System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
			String menu = scanner.nextLine();
			switch (menu) {
			case "1":
				addView();
				try {
					LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();
					service.saveData(map);
					System.out.println("member�� ����ȭ�Ͽ� ����");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case "2":
				System.out.println("*******������ ����*******");
				deleteView();
				break;
			case "3":
				System.out.println("*******������ ��ȸ*******");
				findView();
				break;
			case "4":
				System.out.println("*******��ü����������*******");
				service.printAll();
				break;
			case "5":
				System.out.println("*******�л�������α׷��� �����մϴ�******");
				try {
					LinkedHashMap<String, Member> map = service.loadData();
					System.out.println(map);
				} catch (ClassNotFoundException | IOException e) {
					e.printStackTrace();
				}
				break exit;
			default:
				System.out.println("�߸��� �Է°��Դϴ�!!");
				break;
			}
		}
		scanner.close();
	} // execute ��

	public void addView() {
		Member member = null;
		
		System.out.println("�Է��� �������� ������ �����ϼ��� 1.�л�  2.������ 3.����");
		String info = scanner.nextLine();
		System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���!");
		String tel = scanner.nextLine();
		System.out.println("2. �̸��� �Է��ϼ���");
		String name = scanner.nextLine();
		System.out.println("3. �ּҸ� �Է��ϼ���!");
		String address = scanner.nextLine();
		
		switch(info) {
		case "1":
			System.out.println("4. �й��� �Է��ϼ���");
			String stuNo = scanner.nextLine();
			member = new Student(tel, name, address, stuNo);
			break;
		case "2":
			System.out.println("4. ������ �Է��ϼ���");
			String subject = scanner.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3":
			System.out.println("4. �μ��� �Է��ϼ���");
			String department = scanner.nextLine();
			member =  new Employee(tel, name, address, department);
			break;
		}
		try {
			service.addMember(member);
			System.out.println(member.toString());
		} catch (DuplicateTelException e) {
			e.printStackTrace();
		}	
	}// addView ��
	
	public void deleteView() {
		System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���");
		String tel = scanner.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel+"�� �ش��ϴ� �������� �����Ͽ����ϴ�.");
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void findView() {
		System.out.println("��ȸ�� �������� ��ȭ��ȣ�� �Է��ϼ���");
		String tel= scanner.nextLine();
		try {
			Member member = service.findMemberByTel(tel);
			System.out.println(member);
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
