package test;

import java.io.IOException;

import view.ConsoleInstUI7;

public class TestConsoleUI {
	public static void main(String[] args) {
		//���� �׽�Ʈ 
		//ConsoleUI ui=new ConsoleUI();
		//Ǯ�̺� �׽�Ʈ 
		ConsoleInstUI7 ui=new ConsoleInstUI7();
		
		try {
			ui.execute();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} //loadData(), saveData() ������ �߻��ϸ� �����̵��� �ʵ����Ѵ� 
			//����, consoleUI ���� ó���� ���شٸ� ������ �߻��ϴ��� ������ ���� �� (�����͸� �������� ���� ��Ȳ�̴��� �ϴ� execute()����
		
	}
}
