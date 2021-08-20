package step3_solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		File dir = new File(path).getParentFile() ; //C:\\kosta224\\iotest2\\lunch ������� �˼�����
											
		if(!dir.isDirectory()) { //���丮�� ������ ������ش�
			dir.mkdirs(); //���丮�� �����Ѵ�
		}
	}

	//throws
	//System.in, Scanner, FileWriter, PrintWriter
	public void order() throws IOException {
		Scanner s = null;
		PrintWriter pw = null;
		try {
			//�Է½�Ʈ��
			s = new Scanner(System.in);
			pw = new PrintWriter(new FileWriter(path, true));
	
			while(true) {
				System.out.print("���ɸ޴��� �ֹ��ϼ��� : ");
				String order = s.nextLine(); //����ϴٰ� �޴��Է� enter ������ ����
				if(order.equals("�ֹ���")) {
					System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�"); //��ġ�߿�
					break;
				}
				pw.println(order); //���Ͽ� ����Ѵ� - 1. �ֹ��� �ۼ� �� 
				System.out.println(order + "�ֹ�"); //��ġ�߿� - 2. �ֹ�Ȯ���� ������ش�
			}
		}finally {
			if(pw!= null) {
				pw.close(); //close�ÿ� flush() ȣ���ؼ� ���
			}
			if(s!= null) {
				s.close();
			}
		}//finally
	}//method
}//main













