package test;

import java.util.ArrayList;

public class Outer {
	private int money = 100;
	private ArrayList<Inner> list = new ArrayList<Inner>();
	public void writerTest() {
		list.add(new Inner());
		list.add(new Inner());
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).writer); //Inner�� private member�� ���� ������ ���
	}
	public class Inner{
		private String writer = "���";
		public void test() {
			//Nested (Inner) class�� Outer class�� private member �� ���� ���� ����
			System.out.println(money);
		}
	}
}
