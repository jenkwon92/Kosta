package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
			dir.mkdirs(); //���丮�� �����Ѵ�
		}
	}

	//throws
	//System.in, Scanner, FileWriter, PrintWriter
	public void order() throws IOException {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		while(true) {
			System.out.println("���� �޴��� �ֹ��ϼ��� : ");
			String menu = sc.nextLine();
			if(menu.equals("�ֹ� ��")) {
				break;
			}
			System.out.println(menu+"�ֹ�");
		}
		
		
		FileWriter fw = new FileWriter(path);
		PrintWriter pw = new PrintWriter(fw);
		pw.println();
		pw.close();
		
	}
	
	
}













