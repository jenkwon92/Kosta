package step9;

class Product{}
class Food extends Product{}
class Computer extends Product{}
//...�� �� ���� ��ǰ���� �ִٰ� ����

class KostaMarket{
	public void pay(Product p) { //�پ��� ��ǰ�� �θ� Ÿ���� ������ ��� ó���� �����ϴ� -> ������ ������ ����
		System.out.println("��ǰ�� ����"+p);
	}
}

public class TestPolymorphism {
	public static void main(String[] args) {
		KostaMarket m = new KostaMarket();
		//���� ��ǰ�� �����ؾ� �Ѵ�
		m.pay(new Food());
		m.pay(new Computer());
	}
}
