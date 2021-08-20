package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	private String filePath;

	public OutputService(String filePath) {
		super();
		this.filePath = filePath;
	}

	public void outputData(String data) throws IOException {
		// filePath �� �ش��ϴ� ���Ͽ� data�� ����Ѵ�
		// ���Ͽ� ����Ǵ� NodeStream�� ����
		//FileWriter fw = new FileWriter(filePath, true); //true :append �߰� 
		///System.out.println("p");
		//NodeStream �� ����Ǿ� ����� �����ϴ� ProcessingStream ����
		//PrintWriter pw = new PrintWriter(fw);
		//�� �ζ����� �ٿ�����
		PrintWriter pw =null; //���������� �׻� ����� �ʱ�ȭ
		try {
			pw = new PrintWriter(new FileWriter(filePath, true));
			pw.println(data);
		} finally { //finally�� �׻� ����
			//��Ʈ���� �ݾ��ش� (����� �ڿ��� ������� �����ش�)  
			// ���������� flush() �� ȣ���ؼ� buffer(�޸�)�� �ִ� ������ ���� ���Ͽ� ��� 
			if (pw != null) //pw ��Ʈ�� ��ü�� �����ϸ�
				pw.close();
		}
	}
}
