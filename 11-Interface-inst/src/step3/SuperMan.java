package step3;

import step2.Flyer;
//�������� �������̽��� implements �Ͽ� �پ��� �������� �Ͽ� ������ �����ϴ� 
public class SuperMan implements Flyer,Fighter{
	@Override
	public void fly() {
		System.out.println("���۸��� ����");
	}

	@Override
	public void fight() {
		System.out.println("���۸��� �Ǵ�� �ο��");
	}
}
