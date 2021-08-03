package step3;

public class TestForLoop3 {
	public static void main(String[] args) {
		/*
		  구구단 2단 부터 9단까지 출력
		  중첩 for (Nested Loop) 를 이용한다 
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
