package step3_solution;

import java.io.IOException;

public class TestMenuService {
	public static void main(String[] args) {
		String path ="C:\\kosta224\\iotest2\\lunch\\menu.txt";
		MenuService service = new MenuService(path);
		//try
		try {
			service.order();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
	}
}

/*
 * ���ɸ޴��� �ֹ��ϼ��� : ���
 * ��� �ֹ�
 * ���ɸ޴��� �ֹ��ϼ��� : ���
 * ��� �ֹ�
 * ���ɸ޴��� �ֹ��ϼ��� : �ֹ� ��
 * �ֹ��� �Ϸ�Ǿ����ϴ�
 * 
 * menu.txt���� 
 * ���
 * ���
 * 
*/
