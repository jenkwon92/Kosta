package model;

public interface SchoolService {

	/**
	 * ����Ʈ�� �б� ������ ������ ���(�߰�)�ϴ� �޼��� 
	 * ���ڰ����� ���޵� ������ ��ü�� tel�� 
	 * ����Ʈ�� ��ҷ� ����� �б� ������ ��ü�� tel�� �ߺ��Ǹ� 
	 * ��Ͻ�Ű�� �ʾƾ� �Ѵ� 
	 * @param member
	 */
	void addMember(Member member);

	void printAll();

	/**
	 * ��ȭ��ȣ�� ����Ʈ�� ����� ������ ��ü�� �˻��ؼ� ��ȯ�ϴ� �޼��� 
	 * ���� �������� ������ null�� ��ȯ�Ѵ� 
	 * @param tel
	 * @return member
	 */
	Member findMemberByTel(String tel);

	/**
	 * �Ű������� ���޵� ���ڰ� tel�� �ش��ϴ� ����Ʈ ����� ������ ������ �����ϸ�
	 * �����ϰ� ���� ����� ������ ��ȯ,
	 * �������� ������ tel �� �ش��ϴ� ������ ������ ��� ���� �Ұ� �޼����� ��ȯ�Ѵ� 
	 * @param tel
	 * @return message
	 */
	String deleteMemberByTel(String tel);
    //Version2 ���� �߰� ( jdk 1.8 �̻� ���� ) 
	public default int findIndexByTel(String tel) { 
		return 0;
	}
}






