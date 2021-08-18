package step1;

import java.util.ArrayList;

public class TestException4 {
	public static void main(String[] args) {
		String name="아이유";
		/*
		 * array와 arrayList 차이 
		 * 배열은 primitive type(int, byte, char 등)과 object 모두를 담을 수 있지만, arrayList는 object element만 담을 수 있다.
		 * 배열은 제네릭을 사용할 수 없지만, arrayList는 타입 안정성을 보장해주는 제네릭을 사용할 수 있다.
		 * 길이에 대해 배열은 length 변수를 쓰고, arrayList는 size() 메서드를 써야한다.
		 * 배열은 element들을 할당하기 위해 assignment(할당) 연산자를 써야하고, arrayList는 add() 메서드를 통해 element를 삽입한다
		 */
		name=null;
		ArrayList<String>list = new ArrayList<String>();
	
			try {
				System.out.println(name.length());
				System.out.println(list.get(0));
			}catch(NullPointerException ne){
				System.out.println("이름을 입력해주세요");
			}catch(IndexOutOfBoundsException ie){
				System.out.println("리스트 범위를 초과한 정보입니다");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				System.out.println("항상실행된다");
			}
			System.out.println("프로그램 정상 수행");
		
	}
}
