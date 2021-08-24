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

//풀이본 공유 ConsoleInstUI1
public class ConsoleUI {
	private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() throws DuplicateTelException, MemberNotFoundException, FileNotFoundException, ClassNotFoundException, IOException {

		System.out.println("*******학사관리프로그램을 시작합니다******");
		exit: while (true) {
			LinkedHashMap<String,Member> map = service.loadData();
			Collection<Member> col = map.values();
			Iterator<Member> it = col.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("car list를 역직렬화하여 확인");
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			String menu = scanner.nextLine();
			switch (menu) {
			case "1":
				addView();
				break;
			case "2":
				System.out.println("구성원 삭제작업");
				try {
					deleteView();
				} catch (MemberNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "3":
				System.out.println("구성원 검색작업");
				findView();
				break;
			case "4":
				System.out.println("**전체구성원보기**");
				service.printAll();
				break;
			case "5":
				System.out.println("*******학사관리프로그램을 종료합니다******");
				break exit;
			default:
				System.out.println("잘못된 입력값입니다!");
			}
		}
		scanner.close();
	}

	// addView 시작
	public void addView() {
		System.out.println("입력할 구성원의 종류를 선택하세요 1.학생 2.선생님 3.직원");
		String info = scanner.nextLine();
		System.out.println("1.전화번호를 입력하세요");
		String tel = scanner.nextLine();
		System.out.println("2. 이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("3. 주소를 입력하세요!");
		String address = scanner.nextLine();
		Member member = null;
		switch (info) {
		case "1":
			System.out.println("4. 학번을 입력하세요");
			String stuId = scanner.nextLine();
			member = new Student(tel, name, address, stuId);
			break;
		case "2":
			System.out.println("4. 과목을 입력하세요");
			String subject = scanner.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3":
			System.out.println("4. 부서를 입력하세요");
			String department = scanner.nextLine();
			member = new Employee(tel, name, address, department);
			break;
		}
		try {
			service.addMember(member);
			LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();
			System.out.println("리스트 추가 : " + member);
			service.saveData(map);
		} catch (DuplicateTelException de) {
			System.out.println(de.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // addView 끝

	// deleteView 시작
	public void deleteView() throws MemberNotFoundException {
		System.out.println("삭제할 구성원의 전화번호를 입력하세요");
		String tel = scanner.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel + "에 해당하는 구성원을 삭제하였습니다.");
		} catch (MemberNotFoundException me) {
			System.out.println(me.getMessage());
		}
	}// deleteView 끝

	// findView 시작
	public void findView() {
		System.out.println("조회할 구성원의 전화번호를 입력하세요");
		String tel = scanner.nextLine();
		try {
			service.findMemberByTel(tel);
			System.out.println("조회결과" + service.findMemberByTel(tel));
		} catch (MemberNotFoundException me) {
			System.out.println(me.getMessage());
		}
	}// findView 끝

}
