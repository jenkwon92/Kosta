package step2;
//final java keyword ���� �׽�Ʈ 
class FinalEx{
	final String ADMIN_ID="java";
	public void test() {
		//�Ʒ��� ������ ����, final�� ����̹Ƿ� ���Ҵ� �Ұ� 
		//ADMIN_ID="spring";
	}
	public final void test2() {}
}
class SubFinalEx extends FinalEx{
	//�������̵带 �õ� 
	//public void test2() {} // �θ��� final �޼���� �������̵� �Ұ� compile error  
}
final class FinalEx2{}
//class SubFinalEx2 extends FinalEx2{} // final class�� ��� �Ұ� 
public class TestFinal {

}












