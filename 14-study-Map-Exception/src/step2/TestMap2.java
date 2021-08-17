package step2;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class TestMap2 {
	public static void main(String[] args) {
		/*
		 * Map �迭 : key�� value������ ����. key�� �����͸� ����
		 * LinkedHashMap : ��� ������� ���� - �Է¼����� ����Ѵ�
		 * TreeMap : ���� ��� ����
		 */
		TreeMap<String, String> map = new TreeMap <String, String> ();
		map.put("7", "�����");
		map.put("4", "���");
		map.put("9", "�ᱹ��");
		System.out.println(map);
		//key�� �˻�
		System.out.println(map.get("4"));
		System.out.println(map.get("8")); //������ null
		System.out.println(map.remove("7")); //����, ������ ������ ��ȯ
		System.out.println(map.size());
		System.out.println("***map�� values �� ��� ���***");
		Collection<String> col = map.values();
		Iterator <String> it = col.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
