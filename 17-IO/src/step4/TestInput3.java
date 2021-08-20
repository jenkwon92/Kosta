package step4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput3 {
	public static void main(String[] args) {
		String path ="C:\\kosta224\\iotest2\\lunch\\menu.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			//readLine() 을 이용해서 읽을 라인이 존재할때 까지 반복하면서 콘솔에 출력
			/*
			 * String data=br.readLine(); //첫 라인을 입력받는다 while(data != null) {
			 * System.out.println(data); data = br.readLine(); }
			 */
			
			while(br.ready()) { //입력받을 정보가 있으면 true,
				System.out.println(br.readLine());
			}
			
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
