package step1;

import java.io.IOException;

public class TestOutputReview {
	public static void main(String[] args) {
		String filePath = "C:\\kosta224\\iotest\\friend.txt";
		OutputService service = new OutputService(filePath);
		try {
			service.outputData("������");
			System.out.println("��¿Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("���α׷� �������");
	}
}
