package step6;

public class TestRefArray2 {
	public static void main(String[] args) {
		//Person �迭�� ����, ����, �Ҵ� ���ÿ� 
		//pa ���������� ������ Ÿ���� Person[] �迭 Ÿ���̴�.
		Person[] pa = {
				new Person("������",30), 
				new Person("���ϴ�",34),
				new Person("�̰���",20)
		};
		int age =25;
		//pa �迭 ��� �� ���̰� ���� age �� �ʰ��ϴ� ����� name�� ���
		for(int i=0; i<pa.length;i++) {
			if(pa[i].getAge()>age) 
				System.out.println(pa[i].getName()+" "+pa[i].getAge()); 
		}
	System.out.println("*************");
	//pa �迭�� ��� ����� age �� num ��ŭ ������Ų��
	int num = 10;
	for(int i=0; i<pa.length;i++) 
		pa[i].setAge(pa[i].getAge()+num); //���� ���� pa[i].getAge()�� num�� ���ؼ� set Age �Ѵ�.
	
	
	//���Ȯ��
	for(int i=0;i<pa.length;i++)
		System.out.println(pa[i].getName()+" "+pa[i].getAge());
	/*
	 *  ������ 40
	 *  ���ϴ� 44
	 *  �̰��� 30
	 */
	}//main
}//class
