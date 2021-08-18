package step2;

import java.io.FileNotFoundException;
import java.io.FileReader;

class MemoService {
	public void readMemo(String filePath) throws FileNotFoundException {
		try {
			FileReader fr = new FileReader(filePath);
			System.out.println(fr + "의 파일 정보를 읽는 작업수행");
		} finally {
			System.out.println("finally는 항상 실행");
			// fr.close(); //사용한 후에는 항상 닫아줘야함
		}
	}
}

public class TestThrows1 {
	public static void main(String[] args) {
		MemoService service = new MemoService();
		String filePath = "C:\\kosta224\\b.txt"; // 존재하지 않는 파일 테스트
		try {
			service.readMemo(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); //예외 메세지와 발생 경로를 모두 출력
			System.out.println(e.getMessage()); // getMessage() -> 예외메세지를 반환
		}
		System.out.println("프로그램 정상수행");
	}
}
