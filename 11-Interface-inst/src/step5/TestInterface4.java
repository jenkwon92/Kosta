package step5;
//�� ���� ���� Ȯ�� ���� �������̽��� ���� Ŭ������ �ϳ��� ���Ͽ��� �ۼ��Ѵ� 
class A{}
class B{}
//class C extends A,B{} // compile error , �ڹٴ� ���� ����̹Ƿ� ���� Ŭ������ ��ӹ��� �� ���� 

interface Ex1{
	public void ex1();
}
interface Ex2{
	public void ex2();
}
interface Ex3 extends Ex1,Ex2{// �ڹٴ� ���� ��������� �������̽��� ���� ����� ��� ( �߻�޼��� ��ӹ޴´� ) 
	public void ex3();
}
// Ex3 �������̽��� implements �ϴ� Ŭ������ ��ӹ��� ��� �߻� �޼��带 �����ؾ� �Ѵ� 
public class TestInterface4 implements Ex3{

	@Override
	public void ex1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ex2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ex3() {
		// TODO Auto-generated method stub
		
	}

}




