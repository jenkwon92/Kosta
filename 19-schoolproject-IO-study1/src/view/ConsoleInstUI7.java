package view;

import java.util.Scanner;

import model.DuplicateTelException;
import model.Employee;
import model.Member;
import model.SchoolService;
import model.Student;
import model.Teacher;

//구성원 추가 및 전체회원보기, 검색 , 삭제
// 객체 직렬화를 통한 데이터 유지
public class ConsoleInstUI7 {
	private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() {
		System.out.println("*******학사관리프로그램을 시작합니다******");
		
			while (true) {
				System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
				String menu = scanner.nextLine();
				exit : switch (menu) {
				case "1":
					try {
						addView();
					} catch (DuplicateTelException e) {
						e.printStackTrace();
					}
					break;
				case "2":
					deleteView();
					break;
				case "3":
					findView();
					break;
				case "4":
					System.out.println("**전체구성원보기**");
					service.printAll();
					break;
				case "5":
					System.out.println("*******학사관리프로그램을 종료합니다******");
					break ;
				default:
					System.out.println("잘못된 입력값입니다!!");
					break exit;
				}
			if(scanner != null) {
				scanner.close();
			}
		}
	}// execute method

	public void addView() throws DuplicateTelException {
		Member member = null;
		System.out.println("입력할 구성원의 종류를 선택하세요 1.학생  2.선생님 3.직원");
		String info = scanner.nextLine();
		System.out.println("1. 전화번호를 입력하세요");
		String tel = scanner.nextLine();
		System.out.println("2. 이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("3. 주소를 입력하세요");
		String address = scanner.nextLine();
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

		service.addMember(member);
		System.out.println("리스트에 추가 : " + member);
	}// addView method

	public void deleteView() {
		System.out.println("삭제할 구성원의 전화번호를 입력하세요");
		String tel =scanner.nextLine();
		service.deleteMemberByTel(tel);
	}// delete method

	public void findView() {

	}// find method

}// class
