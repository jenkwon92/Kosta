package step3;

import java.io.IOException;

public class TestObjectSerialization1 {
	public static void main(String[] args) {
		String path = "C:\\kosta224\\iotest\\account.obj";
		AccountVO avo = new AccountVO("������", 200, "starjava");
		AccountService service = new AccountService(path);
		try {
			service.saveObject(avo);
			System.out.println("���������� ����ȭ�Ͽ� ���Ͽ� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
