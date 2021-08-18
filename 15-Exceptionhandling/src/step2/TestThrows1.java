package step2;

import java.io.FileNotFoundException;
import java.io.FileReader;

class MemoService {
	public void readMemo(String filePath) throws FileNotFoundException {
		try {
			FileReader fr = new FileReader(filePath);
			System.out.println(fr + "�� ���� ������ �д� �۾�����");
		} finally {
			System.out.println("finally�� �׻� ����");
			// fr.close(); //����� �Ŀ��� �׻� �ݾ������
		}
	}
}

public class TestThrows1 {
	public static void main(String[] args) {
		MemoService service = new MemoService();
		String filePath = "C:\\kosta224\\b.txt"; // �������� �ʴ� ���� �׽�Ʈ
		try {
			service.readMemo(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); //���� �޼����� �߻� ��θ� ��� ���
			System.out.println(e.getMessage()); // getMessage() -> ���ܸ޼����� ��ȯ
		}
		System.out.println("���α׷� �������");
	}
}
