package step3;

import step2.Airplane;
import step2.Bird;
import step2.Flyer;

public class TestInterface2 {
	public static void main(String[] args) {
		//�ϳ��� ��ü�� �پ��� �������̽� Ÿ���� ������ ���� �� �� �ִ� 
		Flyer f1=new SuperMan();
		f1.fly();
		Fighter f2=new SuperMan();
		f2.fight();
		System.out.println("**************");
		Flyer fa[]= {new Airplane(),new Bird(),new SuperMan()};
		//for loop �̿��ؼ� 
		for(int i=0;i<fa.length;i++)
			fa[i].fly(); // � ��ü���� ��ü���� ���� �������̽��� abstract method������ ��� ��ü�� ������ ������� �����ϰ� �� �� �ִ� -> ������ 
		
		/* ����Ⱑ ���� 
		 * ���� ���� 
		 * ���۸��� ����  
		 */
	}
}
