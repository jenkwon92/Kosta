package step7;

import step4.Animal;
import step4.Monkey;
import step4.Person;
import step4.Tiger;

public class TestPolymorphism8 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		Animal ani[]= {new Monkey(),new Tiger(),new Person()};
		service.playAll(ani);
		/*
		 *  �����̰� ����Ÿ�� ���
		 *  ȣ���̰� ����ϸ� ��� 
		 *  ����� Ƽ���� �����ϴ�
		 *  ����� ����Ʈ�ϸ� ��� 
		 */
	}
}
