package step5;

public class TestArray4 {
	public static void main(String[] args) {
		//문자열을 저장하는 배열 선언, 생성 할당 동시에 
		String food[]= {"고기","마라탕","김치찌개"}; //length가 3인 문자열 타입의 배열을 생성하고 초기화
		for(int i=0; i<food.length;i++) //실행문이 한 라인이면 {} 중괄호 생략가능
			System.out.println(food[i]);
	}
}
