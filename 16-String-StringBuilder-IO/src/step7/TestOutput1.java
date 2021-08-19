package step7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 출력스트림 테스트 예제
 * 특정 파일을 생성해서 데이터를 출력해보는 예제
 * 
 */
public class TestOutput1 {
	public static void main(String[] args) {
		//장치에 연결되는 Node Stream 계열을 생성
		try {
			FileWriter fw = new FileWriter("C:\\kosta224\\iotest\\memo.txt");
			//기능을 지원하는 Processing Stream 계열을 생성
			PrintWriter pw = new PrintWriter(fw);
			pw.print("쉬는시간입니다");
			System.out.println("파일 생성 및 출력");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
