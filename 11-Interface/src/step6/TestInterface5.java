package step6;
interface OpenInterface{
	public void a();
	//public void b(){} //일반 구현 메서드를 가딜 수 없다
	//jdk 1.8 이상에서는 default 메서드가 지원 -> 유지보구성 차원
	public default void newMethod() {}
}

class KbBank implements OpenInterface{
	@Override
	public void a() {
	}
	@Override
	public void newMethod() {
		//디폴트 메서드 오버라이딩 가능
	}
}
class Kaka0Bank implements OpenInterface{
	@Override
	public void a() {
	}
}
public class TestInterface5 {

}
