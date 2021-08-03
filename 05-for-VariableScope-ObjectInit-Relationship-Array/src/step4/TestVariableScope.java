package step4;

public class TestVariableScope {
	public static void main(String[] args) {
		/*
		 	Person : 참조형 데이터 타입
		 	p : 참조변수. 메인 메서드 내에 선언되어있으므로, local variable -> stack memory 영역에 저장
		 	new Person(); : 객체 생성 , heap memory 영역에 저장
		 */
		Person p = new Person("아이유");
		p.eat();
		p.eat2();
		p.testInit();
	}
}
