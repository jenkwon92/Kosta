package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
								//key : tel ,  value : Member
	private LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();

	public void addMember(Member member) throws DuplicateTelException {
			if(map.containsKey(member.getTel())) {
				for(int i=0; i<map.size(); i++) {
				throw new DuplicateTelException("중복되어 등록불가");
			}
			map.put(member.getTel(), member);
			
		}
	}

	public void printAll() {
		Collection col = map.values();
		Iterator<Member> it = col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}


}
