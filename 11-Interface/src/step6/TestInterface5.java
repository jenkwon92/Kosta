package step6;
interface OpenInterface{
	public void a();
	//public void b(){} //�Ϲ� ���� �޼��带 ���� �� ����
	//jdk 1.8 �̻󿡼��� default �޼��尡 ���� -> ���������� ����
	public default void newMethod() {}
}

class KbBank implements OpenInterface{
	@Override
	public void a() {
	}
	@Override
	public void newMethod() {
		//����Ʈ �޼��� �������̵� ����
	}
}
class Kaka0Bank implements OpenInterface{
	@Override
	public void a() {
	}
}
public class TestInterface5 {

}
