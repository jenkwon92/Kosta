package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
							//key:tel  value:Member ���� 
	private LinkedHashMap<String,Member> map=new LinkedHashMap<String,Member>();

	public void addMember(Member member) throws DuplicateTelException{
		if(map.containsKey(member.getTel()))
			throw new DuplicateTelException("��ȣ�� �̹� ����");
		map.put(member.getTel(), member);
		
	}

	public void printAll() {
		Collection<Member> col= map.values();
		Iterator<Member>it = col.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}


}
