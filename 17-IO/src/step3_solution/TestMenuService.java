package step3_solution;

import java.io.IOException;

public class TestMenuService {
	public static void main(String[] args) {
		String path ="C:\\kosta224\\iotest2\\lunch\\menu.txt";
		MenuService service = new MenuService(path);
		//try
		try {
			service.order();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
	}
}

/*
 * 점심메뉴를 주문하세요 : 김밥
 * 김밥 주문
 * 점심메뉴를 주문하세요 : 라면
 * 라면 주문
 * 점심메뉴를 주문하세요 : 주문 씉
 * 주문이 완료되었습니다
 * 
 * menu.txt에는 
 * 김밥
 * 라면
 * 
*/
