package step3;

public class TestComposition {
	public static void main(String[] args) {
		Car car=new Car("�ҳ�Ÿ");
		System.out.println(car.getModel());
		// car ��ü�� engine�� type�� ��ȯ�޾� ����غ��� 
		System.out.println(car.getEngine().getType());
		//car ��ü�� engine displacement�� ��ȯ�޾� ����غ��� 
		System.out.println(car.getEngine().getDisplacement());//2000
		//car ��ü�� engine displacement�� 2500 ���� �����غ��� 
		car.getEngine().setDisplacement(2500);
		System.out.println(car.getEngine().getDisplacement());//2500
	}
}
