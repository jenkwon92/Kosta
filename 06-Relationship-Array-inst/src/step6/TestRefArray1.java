package step6;

public class TestRefArray1 {
	public static void main(String[] args) {
		//������ �����͸� �����ϴ� �迭 
		//�迭 ���� 
		Person [] pa;
		//�迭 ���� 
		pa=new Person[3];
		//�迭 ��� �Ҵ� 
		System.out.println(pa[0]);
		pa[0]=new Person("������",30);
		pa[1]=new Person("���ϴ�",34);
		pa[2]=new Person("�̰���",20);
		// �迭 ù��° ����� name�� ��ȯ�޾� ��� 
		System.out.println(pa[0].getName());
		System.out.println("**pa �迭�� ��� ����� name�� age�� ���**");
		//for loop�� �̿� 
		for(int i=0;i<pa.length;i++) {
			System.out.println(pa[i].getName()+" "+pa[i].getAge());
		}
	}
}













