package step3;
//�ڵ带 �� ���� Ȯ���ϱ� ���� �ϳ��� ���Ͽ� Ŭ������ ������ �����Ѵ� -> �н����� (���� ���߽ÿ��� ������ ���Ͽ��� Ŭ���� �����ϴ� ���� ����)
class Person{
	public void eat() {
		System.out.println("�Դ�");
	}
	//public void eat() {} // �޼����� �Ű������� �����ϹǷ� error 
	
	//�޼��� �����ε� : method overloading -> ������ �޼�������� �پ��� �Ű�����parameter�� ���� 
	public void eat(int count) {
		System.out.println(count+"�κ� �Դ�");
	}
	//public void eat(int kkk) {}//error, �������� �ٸ��ٰ� �ؼ� �����ε��� �Ǵ� ���� �ƴϴ�. �Ű������� Ÿ��,����,������ �޶�� �����ε��� ���� 
	//�޼��� �����ε�
	public void eat(String menu) {
		System.out.println(menu+" �Դ�");
	}
	//�޼��� �����ε� 
	public void eat(String menu,int count) {
		System.out.println(menu+" "+count+"�κ� �Դ�");
	}
}
//�ϳ��� ���Ͽ��� ���� Ŭ���� ���ǽÿ��� main �� �ִ� Ŭ������ public �� ����ϰ� ���ϸ� ���� main�� �ִ� Ŭ���������� �Ѵ� 
public class TestOverloading1 {
	public static void main(String[] args) {
		Person p=new Person();
		p.eat();
		p.eat(2);
		p.eat("������");
		p.eat("������", 3);
	}
}








