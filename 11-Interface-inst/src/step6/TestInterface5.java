package step6;
interface OpenInterface{
	public void a();
	//public void b() {} //�Ϲ� ���� �޼��带 ���� �� ���� 
	//jdk 1.8 �̻󿡼��� default �޼��尡 ���� -> ���������� ���� 
	public default void newMethod(){}
	// jdk 1.8 �̻󿡼��� static �޼��尡 ���� 
	public static void sMethod() {}
}
class KbBank implements OpenInterface{
	@Override
	public void a() {}
	@Override
	public void newMethod() {
		//����Ʈ �޼��� �������̵� ���� 
	}
}
class KaKaoBank implements OpenInterface{
	@Override
	public void a() {}
}
public class TestInterface5 {

}
