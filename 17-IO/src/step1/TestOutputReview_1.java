package step1;

import java.io.IOException;

public class TestOutputReview_1 {
	public static void main(String[] args) {
		String filepath = "C:\\kosta224\\iotest\\study.txt";
		OutputStream_1 service = new OutputStream_1(filepath);
		
		
			try {
				service.outputData("������ 8�� 22��");
				System.out.println("��¿Ϸ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("���α׷� �������");
	}
}
