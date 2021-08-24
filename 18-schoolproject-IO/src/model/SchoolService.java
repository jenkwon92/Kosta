package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
	// key:tel value:Member ����
	private LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();
	private String path ="C:\\kosta224\\iotest\\Member.obj";
	public void addMember(Member member) throws DuplicateTelException {
		if (map.containsKey(member.getTel())) // tel�� �����ϸ�
			throw new DuplicateTelException(member.getTel() + "tel�� �ߺ��Ǿ� ��ϺҰ��մϴ�");
		map.put(member.getTel(), member);
	}

	public void printAll() {
		Collection<Member> col = map.values();
		Iterator<Member> it = col.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel) == false)
			throw new MemberNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ �����ϴ�");
		return map.get(tel);
	}

	public Member deleteMemberByTel(String tel) throws MemberNotFoundException {
		if(!map.containsKey(tel))
			throw new MemberNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ ��� �����Ұ�");
		return map.remove(tel);
	}

	public void updateMember(Member member) throws MemberNotFoundException{
		if(!map.containsKey(member.getTel()))
			throw new MemberNotFoundException(member.getTel()+"tel�� �ش��ϴ� �������� �������� �ʾ� �����Ұ�");
		map.put(member.getTel(), member);	
	}
	
	// saveData ����
		public void saveData(LinkedHashMap<String, Member> map) throws IOException {
			ObjectOutputStream oos = null;
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(path));
				oos.writeObject(map);
			} finally {
				if (oos != null)
					oos.close();
			}
		}// saveData ��

		// loadData ����
			@SuppressWarnings("unchecked")
			public LinkedHashMap<String, Member>  loadData() throws FileNotFoundException, IOException, ClassNotFoundException  {
				ObjectInputStream ois = null;
				try {
					ois = new ObjectInputStream(new FileInputStream(path));
					Member member = (Member)ois.readObject();
					map.put(path, member);
				} finally {
					if (ois != null)
						ois.close();
				}
				return map;
			}// loadData ��
			
}
