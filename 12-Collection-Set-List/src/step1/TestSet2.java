package step1;

import java.util.TreeSet;

public class TestSet2 {
	public static void main(String[] args) {
		/*
		 * Set interface �� ���� �ڷᱸ��ü : �ߺ� ���� x
		 * LinkedHashSet : �ߺ� ���� x , �߰� ������ ����
		 * TreeSet : �ߺ� ���� x, ���� ��� ����
		 */
		
		TreeSet<String> set1 = new TreeSet<String> ();
		set1.add("����");
		set1.add("����");
		set1.add("������");
		set1.add("������");
		System.out.println(set1.size());
		System.out.println(set1); //TreeSet �� ���� ����� �ִ�
		System.out.println("**********************");
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(33);
		set2.add(77);
		set2.add(33);
		set2.add(22);
		System.out.println(set2.size());
		System.out.println(set2);//�������� ���ĵǾ� ����Ѵ�
	}
}
















