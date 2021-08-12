package step5;

import java.util.ArrayList;

//Generic�� ������ List �� Ȱ���ϴ� ����
public class TestList4 {
	public static void main(String[] args) {
		ArrayList<FriendDTO> list = new ArrayList<FriendDTO>();
		list.add(new FriendDTO("������", 100));
		list.add(new FriendDTO("�ں���", 200));
		list.add(new FriendDTO("���ϴ�", 50));
		// index�� 2�� ģ���� money�� ���
		System.out.println(list.get(2).getMoney());
		System.out.println("*************");
		int money = 100; // list �� ��ҿ��� money �̻��� ������ ��ü�� name�� ��� ���
		// for �� �̿�
		for (int i = 0; i < list.size(); i++) {
			if (money >= list.get(i).getMoney()) {
				System.out.println(list.get(i).getName());
			}
		}
		System.out.println("*************");

		String name = "�ں���";
		// list�� ��� �� name �� ��ġ�ϴ� ����� money�� ����غ���
		// 200
		for (int i = 0; i < list.size(); i++) {
			//���ڿ� �񱳴� �� equals�� �ؾ��Ѵ�
			if (name.equals(list.get(i).getName()))  // ==�ε� �񱳰� ������ ��찡 ������, �׻� �������� ����
				System.out.println(list.get(i).getMoney());
		}
		System.out.println("*************");
		System.out.println(list); //list ���� toString �� �������̵� �Ǿ�������, FriendDTO���� toString�� ���� ������ �ּҰ��� ��µ�
		//API ���� ��
		//Methods inherited from class java.util.AbstractCollection  - toString
	}
}











