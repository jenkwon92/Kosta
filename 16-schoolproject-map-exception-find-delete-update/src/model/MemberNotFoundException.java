package model;

public class MemberNotFoundException extends Exception{
	private static final long serialVersionUID = 1955721522384187141L;
	public MemberNotFoundException(String message) {
		super(message); //부모 생성자 호출하여 생성시 message를 할당  , 이후에 catch 구문에서 부모 메서드만 getMessage()로 확인 가능
	}
}
