package step5;

public class TestArray1 {
	public static void main(String[] args) {
		//�迭 ���� 
		int age[];
		//�迭 ���� 
		age=new int[3];//�迭 ���� length 3���� �Ҵ� 
		//�迭��ҿ� ���� �Ҵ� 
		age[0]=22; //�迭 �ε����� 0���� ���� 
		age[1]=18;
		age[2]=26;
		//�迭 ��Ҹ� ��� 
		System.out.println(age[2]);
		//�迭 ���� 
		System.out.println(age.length);//3
		System.out.println("*******for loop�� �̿��� age �迭 ��� ��Ҹ� ���********");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}		
	}
}


















