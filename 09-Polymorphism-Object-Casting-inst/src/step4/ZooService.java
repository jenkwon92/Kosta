package step4;

public class ZooService {
	public void enter(Animal a) {
		//a�� �����ϴ� ��ü�� Person���� Ȯ�� 
		if(a instanceof Person)
			((Person) a).ticketing();//Object Casting
		a.play();
	}
}
