package step3;

public class TestForLoop3 {
	public static void main(String[] args) {
		/*
		  ������ 2�� ���� 9�ܱ��� ���
		  ��ø for (Nested Loop) �� �̿��Ѵ� 
		 */
		
		int row = 9;
		int col =9;
		
		for(int i=2;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");				
			}
			System.out.println();
		}
	}
}
