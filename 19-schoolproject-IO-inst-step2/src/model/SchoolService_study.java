package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService_study {
							//key:tel  value:Member ���� 
	private LinkedHashMap<String,Member> map=new LinkedHashMap<String,Member>();
	//��ü ������ ������ ��ü ����ȭ�Ͽ� ������ ���� ��� 
	private String path="C:\\kosta224\\iotest\\school\\member-list.obj";
	
	/**
	 * ��ü ������ȭ�Ͽ� ���Ͽ��� ������ ������ �ε��ϴ� �޼���
	 * 
	 * FileInputStream < ObjectInputStream :readObject() -> instance variable map�� �Ҵ�
	 * 
	 * tip> ���α׷� ù ���� �������� ������ �����Ƿ� if(file.isFile()){��ü ������ȭ}
	 * @throws IOException 
	 */
	public void loadData() throws IOException {
		ObjectInputStream ois = null;
		File dir = new File(path);
		try {
			if(dir.isFile()) {
				ois = new ObjectInputStream(new FileInputStream(path));
				ois.readObject();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(ois != null) {
				ois.close();
			}
		}
	}
	/**
	 * ��ü ����ȭ�Ͽ� ���Ͽ� ������ ������ �����ϴ� �޼���
	 * 
	 * FileOutputStream < ObjectOutputStream : writeObject(map) ->
	 * 
	 * tip> �����Ϸ��� ������ ���丮�� �������� ���� ���� ���丮�� �����Ѵ� mkdirs()
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void saveData() throws IOException {
		ObjectOutputStream oos =null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(path));
			File dir = new File(path+File.separator+"iotest");
			if(!dir.exists()) {
				dir.mkdirs();
			}
			oos.writeObject(dir);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(oos != null) {
				oos.close();
			}
		}
	}
	
	
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



















