package step2;

public class Test2DArray {
	public static void main(String[] args) {
		// ������ �迭 
		// 3�Ⱓ �ſ� ���췮 ���� -> 2���� �迭 
		int [][] rain=new int[3][12];
		//ù�� ù���� ���췮 ���� 
		rain[0][0]=100;
		//ù�� 2�� 
		rain[0][1]=120;
		//�������� 12�� 
		rain[2][11]=200;
		System.out.println(rain[2][11]);
		System.out.println("**************");
		// �������б� 1�г� 3���� 2�г� 5���� 3�г� 6���� 
		int[][] school=new int[3][];
		school[0]=new int[3];//1�г� 3���� ���� 
		school[1]=new int[5];//2�г� 5���� ���� 
		school[2]=new int[6];//3�г� 6���� ���� 
		//���� ���б� ������ �г��� ������ �ݿ� 20�� �Ҵ� �� ��� 
		int i=school.length-1;	//�г��� ������ �ε��� 	2
		int j=school[i].length-1; //�г⿡ ������ ���� ������ �ε��� 5 
		school[i][j]=20;
		System.out.println(school[2][5]);
	}
}















