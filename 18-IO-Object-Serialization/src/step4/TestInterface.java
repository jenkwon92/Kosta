package step4;
interface Flyer{};
class Bird implements Flyer{}
class Eagle extends Bird{} // �θ�Ŭ������ Bird�� implements �����Ƿ� Eagle���� Flyer �������� ���� Ŭ������ �ȴ�
public class TestInterface {
	public static void main(String[] args) {
		Flyer f1 = new Bird();
		Flyer f2 = new Eagle();
		System.out.println(f1);
		System.out.println(f2);
	}
}
