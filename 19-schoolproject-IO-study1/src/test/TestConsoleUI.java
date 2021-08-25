package test;

import java.io.IOException;

import view.ConsoleInstUI7;

public class TestConsoleUI {
	public static void main(String[] args) {
		//내꺼 테스트 
		//ConsoleUI ui=new ConsoleUI();
		//풀이본 테스트 
		ConsoleInstUI7 ui=new ConsoleInstUI7();
		
		try {
			ui.execute();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} //loadData(), saveData() 문제가 발생하면 실행이되지 않도록한다 
			//만약, consoleUI 에서 처리를 해준다면 문제가 발생하더라도 실행이 먼저 됨 (데이터를 가져오지 못한 상황이더라도 일단 execute()동작
		
	}
}
