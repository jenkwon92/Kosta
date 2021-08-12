package step5;

import java.util.ArrayList;

//Generic을 적용한 List 을 활용하는 예제
public class TestList4 {
	public static void main(String[] args) {
		ArrayList<FriendDTO> list = new ArrayList<FriendDTO>();
		list.add(new FriendDTO("아이유", 100));
		list.add(new FriendDTO("박보검", 200));
		list.add(new FriendDTO("강하늘", 50));
		// index가 2인 친구의 money를 출력
		System.out.println(list.get(2).getMoney());
		System.out.println("*************");
		int money = 100; // list 의 요소에서 money 이상을 보유한 객체의 name을 모두 출력
		// for 문 이용
		for (int i = 0; i < list.size(); i++) {
			if (money >= list.get(i).getMoney()) {
				System.out.println(list.get(i).getName());
			}
		}
		System.out.println("*************");

		String name = "박보검";
		// list의 요소 중 name 에 일치하는 요소의 money를 출력해본다
		// 200
		for (int i = 0; i < list.size(); i++) {
			//문자열 비교는 꼭 equals로 해야한다
			if (name.equals(list.get(i).getName()))  // ==로도 비교가 가능할 경우가 있지만, 항상 동작하지 않음
				System.out.println(list.get(i).getMoney());
		}
		System.out.println("*************");
		System.out.println(list); //list 에는 toString 이 오버라이딩 되어있지만, FriendDTO에는 toString이 없기 때문에 주소값이 출력됨
		//API 보는 법
		//Methods inherited from class java.util.AbstractCollection  - toString
	}
}











