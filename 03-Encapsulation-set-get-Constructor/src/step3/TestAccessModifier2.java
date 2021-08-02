package step3;

import step2.Account; //ctrl+shift+o

/*
 * step3 패키지 클래스에서
 * step 3 패키지 클래스의 멤버에 접근해서 
 * 접근 제어자를 테스트 해보는 예제
 * 
 * import : 단축키 ctrl +shift + o
 * import는 다른 패키지 클래스를 사용하기 위해서 작성하는 구문
 */
public class TestAccessModifier2 {
	public static void main(String[] args) {
		Account a = new Account();
		System.out.println(a.no1);
		//System.out.println(a.no2); // default는 다른패키지에서 접근 불가능
		//System.out.println(a.no3); // private은 자신의 클래스내에서만 접근가능
		a.deposit(200); //public 이므로 다른 패키지에서 접근가능
		
		
	}
}
