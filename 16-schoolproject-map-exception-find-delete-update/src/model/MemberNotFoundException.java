package model;

public class MemberNotFoundException extends Exception{
	private static final long serialVersionUID = 1955721522384187141L;
	public MemberNotFoundException(String message) {
		super(message); //�θ� ������ ȣ���Ͽ� ������ message�� �Ҵ�  , ���Ŀ� catch �������� �θ� �޼��常 getMessage()�� Ȯ�� ����
	}
}
