package step1;

import java.util.LinkedHashSet;

public class TestSet1 {
	public static void main(String[] args) {
		//java.util.Set Ư¡ ->  �ߺ��� �������� �ʴ´�
		//<String> : Generic -> �ڷᱸ��ü�� ������ ����� Ÿ���� ����
		LinkedHashSet <String> set = new LinkedHashSet<String>();
		set.add("������");
		set.add("�ں���");
		set.add("������");
		//set.add(777); //compile error , Generic ���� <String> �� ��������Ƿ� �ٸ� Ÿ���� �����ʹ� ����� �� ����
		System.out.println(set.size()); //����� ��
		System.out.println(set); //toString method�� �������̵� �Ǿ�����. �ּҰ���� ���� ���밪�� ����
		System.out.println(set.toString());  //���� ������
		set.clear();
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("************");
		LinkedHashSet <Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(10);
		set2.add(22);
		set2.add(33);
		set2.add(22); // �ߺ�����x
		//set2.add("������"); //������ ����
		set2.add(new Integer(44));
		System.out.println(set2.size());
		System.out.println(set);
		System.out.println(set2.isEmpty());
		set2.clear();
		System.out.println(set2.isEmpty());
	}
}



















