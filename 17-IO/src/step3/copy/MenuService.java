package step3.copy;

import java.io.File;

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
			dir.getParentFile().mkdirs(); //디렉토리를 생성한다
			//path가 menu.txt만 담고있기 떄문에 생성을 원하는 디렉토리를 지정해줘야함
			//dir.getParentFile() 까지가  C:\\kosta224\\iotest2\\lunch 의미하게됨
		}
	}
	
	
}
