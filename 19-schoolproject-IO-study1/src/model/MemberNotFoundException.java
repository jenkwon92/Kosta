package model;

public class MemberNotFoundException extends Exception {
	private static final long serialVersionUID = 9125566498639098205L;
	public MemberNotFoundException(String message) {
		super(message); //�θ� ������ ȣ���Ͽ� ��ü ������ message�� �Ҵ�.  ���Ŀ� catch �������� �θ� �޼����� getMessage()�� Ȯ�� ����
	}
}
