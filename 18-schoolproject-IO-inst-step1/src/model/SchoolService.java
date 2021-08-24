package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
							//key:tel  value:Member ���� 
	private LinkedHashMap<String,Member> map=new LinkedHashMap<String,Member>();

	public void addMember(Member member) throws DuplicateTelException {
		if(map.containsKey(member.getTel()))//tel �� �����ϸ�
			throw new DuplicateTelException(member.getTel()+" tel �ߺ��Ǿ� ��ϺҰ��մϴ�!");
		map.put(member.getTel(), member);
	}
	public void printAll() {
		Collection<Member> col=map.values();
		Iterator<Member> it=col.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false)
			throw new MemberNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ �����ϴ�! ");
		return map.get(tel);
	}
	public Member deleteMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false)
			throw new MemberNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ ��� �����Ұ�");
		return map.remove(tel);
	}
	public void updateMember(Member member) throws MemberNotFoundException {
		if(map.containsKey(member.getTel())==false)
			throw new MemberNotFoundException(member.getTel()
					+" tel�� �ش��ϴ� ������ ������ ��� �����Ұ�");
		map.put(member.getTel(), member);
	}
}



















