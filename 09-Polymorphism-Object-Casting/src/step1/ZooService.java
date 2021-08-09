package step1;
//Service :  비즈니스 로직을 정의한 클래스
public class ZooService {
	public void pass(Animal a) {
		System.out.println(a);
	}
	//다형성을 지원 또는 적용하지 않는다면 아래와 같이 객체의 종류별로 메서드를 정의해야 한다.
	/* public void pass(Person p){}
	 * public void pass(Dog d){}
	 */
	//이후 추가적으로 새로운 객체가 전달된다면
	// 다형성을 적용하지 않으면아래와 같이 메서드가 또 추가 되어야 한다
	/*
	 *  public void pass(Monkey m){}
	 */
}
