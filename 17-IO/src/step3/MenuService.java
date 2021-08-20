package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
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
		//File dir = new File(path).getParent() ; //C:\\kosta224\\iotest2\\lunch 여기까지 알수있음
													
		File dir = new File(path); 
		if(!dir.getParentFile().isDirectory()) { //디렉토리가 없으면 만들어준다
			dir.mkdirs(); //디렉토리를 생성한다
		}
	}

	//throws
	//System.in, Scanner, FileWriter, PrintWriter
	public void order() throws IOException {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		while(true) {
			System.out.println("점심 메뉴를 주문하세요 : ");
			String menu = sc.nextLine();
			if(menu.equals("주문 끝")) {
				break;
			}
			System.out.println(menu+"주문");
		}
		
		
		FileWriter fw = new FileWriter(path);
		PrintWriter pw = new PrintWriter(fw);
		pw.println();
		pw.close();
		
	}
	
	
}













