package step3.copy;

import java.io.File;

public class MenuService {
	private String path;
	/*
	 *  ������ �Ű������� ���޹޴� ���� ��ο� �ش��ϴ� ���丮�� 
	 *  �������� �ʴ´ٸ� ���丮�� �����Ѵ�
	 *  java.io.File 	getParentFile() , isDirectory(), mkdirs()
	 */

	public MenuService(String path) {
		super();
		this.path = path;
		
		//���� ����� ���� ���丮 ������ ��ȯ�޴´�
		//File dir = new File(path).getParent() ; //C:\\kosta224\\iotest2\\lunch ������� �˼�����
													
		File dir = new File(path); 
		if(!dir.getParentFile().isDirectory()) { //���丮�� ������ ������ش�
			dir.getParentFile().mkdirs(); //���丮�� �����Ѵ�
			//path�� menu.txt�� ����ֱ� ������ ������ ���ϴ� ���丮�� �����������
			//dir.getParentFile() ������  C:\\kosta224\\iotest2\\lunch �ǹ��ϰԵ�
		}
	}
	
	
}
