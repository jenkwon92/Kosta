package step3_solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {
	private String path;
	/*
	 *  생성자 매개변수로 전달받는 파일 경로에 해당하는 디렉토리가 
	 *  존재하지 않는다면 디렉토리를 생성한다
	 *  java.io.File 	getParentFile() , isDirectory(), mkdirs()
	 */

	public MenuService(String path) {
		super();
		this.path = path;
		
		//파일 경로의 상위 디렉토리 정보를 반환받는다
		File dir = new File(path).getParentFile() ; //C:\\kosta224\\iotest2\\lunch 여기까지 알수있음
											
		if(!dir.isDirectory()) { //디렉토리가 없으면 만들어준다
			dir.mkdirs(); //디렉토리를 생성한다
		}
	}

	//throws
	//System.in, Scanner, FileWriter, PrintWriter
	public void order() throws IOException {
		Scanner s = null;
		PrintWriter pw = null;
		try {
			//입력스트림
			s = new Scanner(System.in);
			pw = new PrintWriter(new FileWriter(path, true));
	
			while(true) {
				System.out.print("점심메뉴를 주문하세요 : ");
				String order = s.nextLine(); //대기하다가 메뉴입력 enter 누르면 동작
				if(order.equals("주문끝")) {
					System.out.println("주문이 완료되었습니다"); //위치중요
					break;
				}
				pw.println(order); //파일에 출력한다 - 1. 주문서 작성 후 
				System.out.println(order + "주문"); //위치중요 - 2. 주문확인을 얘기해준다
			}
		}finally {
			if(pw!= null) {
				pw.close(); //close시에 flush() 호출해서 출력
			}
			if(s!= null) {
				s.close();
			}
		}//finally
	}//method
}//main













