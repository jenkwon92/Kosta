package step2;

public class TestInterface1 {
	public static void main(String[] args) {
		//����̹Ƿ� ���Ҵ� �Ұ� 
		//Flyer.ID="starjava";
		//����� ���� 
		System.out.println(Flyer.ID);
		//������ ���� 
		//���� �������̽� Ÿ���� ������ ���� ��ü ������ �� �ִ� 
		Flyer f1=new Bird();
		f1.fly();
		Flyer f2=new Airplane();
		f2.fly();
	}
}
