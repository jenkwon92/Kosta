package test;

import java.util.ArrayList;

import model.Member;
import model.Student;

public class TestUnitList {
	public static void main(String[] args) {
		ArrayList<Member> list=new ArrayList<Member>();
		list.add(new Student("0101231234", "������", "����", "17"));
		//Member m=list.remove(0);
		//System.out.println("����:"+m.toString());
		System.out.println("������ ����Ʈ:"+list);
		System.out.println("����->"+list.remove(0).toString());
		System.out.println("������ ����Ʈ:"+list);
	}
}
