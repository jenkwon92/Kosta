package step5.test;

import step5.access.Bank;

public class KostaBank extends Bank{
	public void test() {
		publicTest();//public �̹Ƿ� �ٸ� ��Ű���� ���� ���� 
		protectedTest();//�ٸ� ��Ű�������� ��ӹ޾����Ƿ� protected method ���ٰ��� 
		//defaultTest();//default method�� �ٸ� ��Ű������ ���� �Ұ� 
		//privateTest(); // private method�� �ڽ��� Ŭ���� �������� ���� �����ϹǷ� ���ٺҰ� 
	}
}
