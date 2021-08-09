package step5;

public class CompanyService {
	public void printDetailInfo(Employee e) {
		//toString 메서드를 오버라이딩했으므로, 아래와 같이 출력하면 된다
		System.out.println(e); //println 내부에 참조값이 전달되면 toString()을 호출해 주기 떄문
		//System.out.println(e.toString()); //오버라이딩한 toString 메서드가 실행
	}
}
