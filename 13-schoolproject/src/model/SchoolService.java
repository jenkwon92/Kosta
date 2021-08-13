package model;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList <Member> list = new ArrayList<Member>();

	public void addMember(Member member) {
		list.add(member);
	}

	public void printAll() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	 public Member findMemberByTel(String tel) { 
		 Member member = null;
		 for(int i=0; i<list.size(); i++) {
			 if((list.get(i).getTel()).equals(tel)){
				 member = list.get(i);
				 break;
			 }
		 }
		 return member; 
	}
	 

	
	public Member deleteMemberByTel(String tel) {
		Member member = findMemberByTel(tel);
		if(member == null) {
			System.out.println(tel+"tel에 해당하는 구성원 정보가 없어서 삭제 불가");
		}else {
			System.out.println(tel+"tel에 해당하는 구성원 삭제");
			list.remove(member);
			
		}
		return member;
	}
}

















