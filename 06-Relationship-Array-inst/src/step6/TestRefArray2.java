package step6;

public class TestRefArray2 {
	public static void main(String[] args) {
		//Person �迭�� ����,����,�Ҵ� ���ÿ� 
		//pa ���������� ������ Ÿ���� Person [] �迭 Ÿ���̴� 
		Person[] pa= {
				new Person("������",30),
				new Person("���ϴ�",34),
				new Person("�̰���",20)
		};
		int age=25;
		//pa �迭 ��� �� ���̰� ���� age �� �ʰ��ϴ� ����� name,age�� ��� 
		for(int i=0;i<pa.length;i++) {
			if(age<pa[i].getAge())
				System.out.println(pa[i].getName()+" "+pa[i].getAge());
		}
		System.out.println("**************************");
		int num=10;
		//pa �迭�� ��� ����� age�� num ��ŭ ������Ų�� 
		for(int i=0;i<pa.length;i++)
			pa[i].setAge(pa[i].getAge()+num);//���� ����(pa[i].getAge()) �� num �� ���ؼ� setAge �Ѵ� 
		
		//���Ȯ�� 
		for(int i=0;i<pa.length;i++)
			System.out.println(pa[i].getName()+" "+pa[i].getAge());
		/*
				������ 40
				���ϴ� 44
				�̰��� 30
		*/
	}//main
}//class












