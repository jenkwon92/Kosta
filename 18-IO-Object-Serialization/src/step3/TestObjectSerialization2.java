package step3;

import java.io.IOException;

public class TestObjectSerialization2 {
	public static void main(String[] args) {
		String path = "C:\\kosta224\\iotest\\account.obj";
		AccountService service = new AccountService(path);
		try {
			AccountVO avo = service.loadObject();
			System.out.println(avo.getName()); //������
			System.out.println(avo.getBalance()); //200
			System.out.println(avo.getPassword()); //null = >transient �̹Ƿ�
			System.out.println("���������� ������ȭ�Ͽ� �޸𸮿��� Ȯ�� (heap��������Ȯ��)");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
