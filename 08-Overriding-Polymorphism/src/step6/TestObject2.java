package step6;
//��� �ڹ� Ŭ������ �ֻ��� �θ� Ŭ������ java.lang.Object�� toString() �� Ȯ���ϰ�, �������̵� �غ��� ����
class Food{//extends Object
	//Food(){super();}
}
class Food2{
	String menu;
	int price;
	Food2(String menu, int price){
		//super();
		this.menu = menu;
		this.price = price;
	}
	//Object �θ� Ŭ������ toString �޼��带 �������̵��ؼ� �ּҰ� ��� ��ü�� ���� ������ ��ȯ�ǰ� �Ѵ�
	public String toString() {
		return "menu:"+menu+" price:"+price;
	}
}
public class TestObject2 {
	public static void main(String[] args) {
		Food f1 = new Food();
		System.out.println(f1.toString()); //�θ� Ŭ���� Object�� toString()�� ȣ���ؼ� ��ü�� �ּҰ��� ��ȯ
		System.out.println(f1); //println �޼��忡�� ������ ������ ��, ��ü�� ���޵Ǹ� ���������� toString()�� ȣ���� ���� ���
		Food f2 = new Food();
		System.out.println(f2.toString());
		System.out.println(f2); //toString()�� ȣ������ �ʾƵ� println() �޼��� ���������� ȣ���Ͽ� ���� ���. ��������� ����
		System.out.println("***Object�� toString()�� �������̵��ؼ� �׽�Ʈ�غ���***");
		Food2 fo1 = new Food2("�Ѹ�",2000);
		System.out.println(fo1);
		Food2 fo2 = new Food2("�׶�",2100);
		System.out.println(fo2);
	}
}
