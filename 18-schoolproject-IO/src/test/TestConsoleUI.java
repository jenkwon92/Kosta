package test;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.DuplicateTelException;
import model.MemberNotFoundException;
import view.ConsoleUI;

public class TestConsoleUI {
	public static void main(String[] args) {
		ConsoleUI ui = new ConsoleUI();
		try {
			ui.execute();
		} catch (DuplicateTelException de) {
			System.out.println(de.getMessage());
		} catch (MemberNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
