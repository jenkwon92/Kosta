package step2;

public class Account {
	//접근 제어자 테스트를 위해 4개의 변수를 선언한다 
	public int no1; // 가장 넓은 범위 접근제어자, 다른 패키지에서도 접근 가능
	int no2; //default 접근 제어자, 같은 패키지 내에서만 접근가능
	private int no3; // 가장 좁은 범위 접근제어자 자신의 클래스 내에서만 접근가능
	
	public void deposit(int money) {
		System.out.println(no3+" 계좌 "+money +"입금처리");
	}
	
}
