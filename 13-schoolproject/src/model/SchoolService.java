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
			System.out.println(tel+"tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�");
		}else {
			System.out.println(tel+"tel�� �ش��ϴ� ������ ����");
			list.remove(member);
			
		}
		return member;
	}
}

















