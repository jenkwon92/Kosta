package step4;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���"); //0�� index �� �߰�
		list.add("�ܹ���"); //1�� index �� �߰�
		list.add("«��"); //2�� index �� �߰�
		list.add("���"); //3�� index �� �߰�
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2)); //index�� ��Ҹ� ��ȯ
		System.out.println("���� : "+list.remove(1));//index 1 �� ��Ҹ� ����
		System.out.println(list);
		//for ������ ��� ��Ҹ� ���
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("���� : " +list.set(2,"����")); //��µǴ� ���� ���� �� ������ ,  index 2�� �ش��ϴ� ��Ҹ� ����
		System.out.println(list); //���� ��
		list.clear();
		System.out.println(list);
	}
}
