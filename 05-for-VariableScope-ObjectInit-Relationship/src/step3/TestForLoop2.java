package step3;

public class TestForLoop2 {
	public static void main(String[] args) {
		System.out.println("아");
		System.out.println("이");
		
		System.out.println("*********");
		System.out.println();
		System.out.println();
		System.out.print("아");
		System.out.print("이");
		System.out.print("유");
		System.out.println("\t팬");
		System.out.println("*********");
		/*
		 	1  2  3  4  5
		 	1  2  3  4  5
		 	1  2  3  4  5
		 */
		int row = 3;
		int col = 5;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
