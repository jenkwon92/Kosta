package test;

import java.io.IOException;

import view.ConsoleInstUI6;

public class TestConsoleUI {
	public static void main(String[] args) {
		//���� �׽�Ʈ 
		//ConsoleUI ui=new ConsoleUI();
		//Ǯ�̺� �׽�Ʈ 
		ConsoleInstUI6 ui=new ConsoleInstUI6();
		try {
			ui.execute();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
