package model;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Member> list=new ArrayList<Member>();

	public void addMember(Member member) {
		boolean flag=false;
		for(int i=0; i<list.size(); i++) {
			if((member.getTel()).equals(list.get(i).getTel())){
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("�ߺ����� �־� �Է��� �Ұ��� �մϴ�");
		else
			list.add(member);
	}

	public void printAll() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public Member findMemberByTel(String tel) {
		Member member=null;
		for(int i=0; i<list.size(); i++) {
			if(tel.equals(list.get(i).getTel())) {
				member = list.get(i);
				break;
			}
		}
		return member;
	}


	public String deleteMemberByTel(String tel) {
		Member member = findMemberByTel(tel);
		String message = null;
		if(member !=null) {
			list.remove(member);
			message = member.toString();
		}
		if(message != null) {
			return message;
		}else {
			return tel +" tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�";
		}
	}
	
	
	/*
	public String deleteMemberByTel(String tel) {
		Member member = findMemberByTel(tel);
		String message = null;
		if(member != null) {
			list.remove(member);
			message = member.toString();
		}else {
			message= tel +" tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�";
		}
		return message;
	}
	*/
	/*
	public String deleteMemberByTel(String tel) {
		String message =null;
		for(int i=0; i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())){
				message = list.remove(i).toString();
				break;
			}
		}
		if(message != null) {
			return message;
		}else {
			return tel +" tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�";
		}
	}
	*/
}
