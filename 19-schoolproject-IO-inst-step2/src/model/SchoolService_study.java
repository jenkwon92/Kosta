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
							//key:tel  value:Member 하위 
	private LinkedHashMap<String,Member> map=new LinkedHashMap<String,Member>();
	//전체 구성원 정보를 객체 직렬화하여 저장할 파일 경로 
	private String path="C:\\kosta224\\iotest\\school\\member-list.obj";
	
	/**
	 * 객체 역직렬화하여 파일에서 구성원 정보를 로드하는 메서드
	 * 
	 * FileInputStream < ObjectInputStream :readObject() -> instance variable map에 할당
	 * 
	 * tip> 프로그램 첫 시작 시점에는 파일이 없으므로 if(file.isFile()){객체 역직렬화}
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
	 * 갹체 직렬화하여 파일에 구성원 정보를 저장하는 메서드
	 * 
	 * FileOutputStream < ObjectOutputStream : writeObject(map) ->
	 * 
	 * tip> 저장하려는 파일의 디렉토리가 존재하지 않을 떄는 디렉토리를 생성한다 mkdirs()
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
		if(map.containsKey(member.getTel()))//tel 이 존재하면
			throw new DuplicateTelException(member.getTel()+" tel 중복되어 등록불가합니다!");
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
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없습니다! ");
		return map.get(tel);
	}
	public Member deleteMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false)
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없어서 삭제불가");
		return map.remove(tel);
	}
	public void updateMember(Member member) throws MemberNotFoundException {
		if(map.containsKey(member.getTel())==false)
			throw new MemberNotFoundException(member.getTel()
					+" tel에 해당하는 구성원 정보가 없어서 수정불가");
		map.put(member.getTel(), member);
	}
}



















