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
	// key:tel value:Member 하위
	private LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();
	private String path ="C:\\kosta224\\iotest\\Member.obj";
	public void addMember(Member member) throws DuplicateTelException {
		if (map.containsKey(member.getTel())) // tel이 존재하면
			throw new DuplicateTelException(member.getTel() + "tel이 중복되어 등록불가합니다");
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
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없습니다");
		return map.get(tel);
	}

	public Member deleteMemberByTel(String tel) throws MemberNotFoundException {
		if(!map.containsKey(tel))
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없어서 삭제불가");
		return map.remove(tel);
	}

	public void updateMember(Member member) throws MemberNotFoundException{
		if(!map.containsKey(member.getTel()))
			throw new MemberNotFoundException(member.getTel()+"tel에 해당하는 구성원이 존재하지 않아 수정불가");
		map.put(member.getTel(), member);	
	}
	
	// saveData 시작
		public void saveData(LinkedHashMap<String, Member> map) throws IOException {
			ObjectOutputStream oos = null;
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(path));
				oos.writeObject(map);
			} finally {
				if (oos != null)
					oos.close();
			}
		}// saveData 끝

		// loadData 시작
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
			}// loadData 끝
			
}
