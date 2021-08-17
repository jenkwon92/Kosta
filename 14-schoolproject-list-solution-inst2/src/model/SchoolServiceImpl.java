package model;

import java.util.ArrayList;

public class SchoolServiceImpl implements SchoolService {
	private ArrayList<Member> list=new ArrayList<Member>();
	/**
	 * ����Ʈ�� �б� ������ ������ ���(�߰�)�ϴ� �޼��� 
	 * ���ڰ����� ���޵� ������ ��ü�� tel�� 
	 * ����Ʈ�� ��ҷ� ����� �б� ������ ��ü�� tel�� �ߺ��Ǹ� 
	 * ��Ͻ�Ű�� �ʾƾ� �Ѵ� 
	 * @param member
	 */
	@Override
	public void addMember(Member member) {
		boolean flag=false;
		for(int i=0;i<list.size();i++) {
			if(member.getTel().equals(list.get(i).getTel())) {//���� tel�� ������ 
				flag=true;
				break;
			}
		}		
		if(flag) //�ߺ��Ǹ� ��Ͻ�Ű�� �ʰ� �޼��� ��� 
			System.out.println(member.getTel()+" tel�� �ߺ��Ǿ� �߰��� �� �����ϴ�");
		else //�ߺ����� ������ ��� 	
			list.add(member);	
	}
	@Override
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	/**
	 * ��ȭ��ȣ�� ����Ʈ�� ����� ������ ��ü�� �˻��ؼ� ��ȯ�ϴ� �޼��� 
	 * ���� �������� ������ null�� ��ȯ�Ѵ� 
	 * @param tel
	 * @return member
	 */
	@Override
	public Member findMemberByTel(String tel) {
		Member member=null;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				member=list.get(i);
				break;
			}
		}
		return member;
	}
	/**
	 * �Ű������� ���޵� ���ڰ� tel�� �ش��ϴ� ����Ʈ ����� ������ ������ �����ϸ�
	 * �����ϰ� ���� ����� ������ ��ȯ,
	 * �������� ������ tel �� �ش��ϴ� ������ ������ ��� ���� �Ұ� �޼����� ��ȯ�Ѵ� 
	 * @param tel
	 * @return message
	 */
	@Override
	public String deleteMemberByTel(String tel) {
		String message=null;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				message=list.remove(i).toString();
				break;
			}
		}
		if(message!=null)
			return message;
		else
			return tel+" tel �� �ش��ϴ� ������ ������ ��� ���� �Ұ�";
	}
}





















