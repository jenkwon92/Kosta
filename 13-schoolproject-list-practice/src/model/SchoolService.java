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
			System.out.println("중복값이 있어 입력이 불가능 합니다");
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
			return tel +" tel에 해당하는 구성원 정보가 없어서 삭제 불가";
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
			message= tel +" tel에 해당하는 구성원 정보가 없어서 삭제 불가";
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
			return tel +" tel에 해당하는 구성원 정보가 없어서 삭제 불가";
		}
	}
	*/
}
