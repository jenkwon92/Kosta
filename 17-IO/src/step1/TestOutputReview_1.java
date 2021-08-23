package step1;

import java.io.IOException;

public class TestOutputReview_1 {
	public static void main(String[] args) {
		String filepath = "C:\\kosta224\\iotest\\study.txt";
		OutputStream_1 service = new OutputStream_1(filepath);
		
		
			try {
				service.outputData("오늘은 8월 22일");
				System.out.println("출력완료");
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("프로그램 정상수행");
	}
}
