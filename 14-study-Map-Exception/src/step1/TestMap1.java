package step1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		// map�� key�� value ������ ����
		map.put("a", "������");
		map.put("b", "�ں���");
		System.out.println(map.size()); // 2
		System.out.println(map.toString()); // {a=������, b=�ں���}
		// key�� �̿��� value�˻�
		System.out.println(map.get("b")); // �ں���
		// ������ �����ϴ� key�� map�� �߰�
		map.put("a", "��ȿ��"); // key�� �����ؾ� �ϹǷ� value�� ������Ʈ
		System.out.println(map.size()); // 2
		System.out.println(map); // {a=��ȿ��, b=�ں���}
		System.out.println(map.get("a")); // ��ȿ���� ������Ʈ�� �Ǿ���
		// key�� ���� ������ Ȯ���غ���
		System.out.println(map.containsKey("a")); // �����ϸ�true
		System.out.println(map.containsKey("f")); // �������� ������ false
		// key�� �̿��� ����, ������ ��� ������ ��ȯ
		System.out.println(map.remove("b"));
		System.out.println(map.remove("r")); // ���� ��Ұ� ������ null��ȯ

		map.put("k", "�����");
		map.put("t", "�̰���");

		// map�� �����ϴ� key���� ��ȯ
		System.out.println("***map���� key�鸸 ���******");
		Set<String> set = map.keySet();
		// Iterator interface : java.util.Collection ������ ��� ����ü ��Ҹ� �ݺ�, ������ �� �ִ� ����� ����
		Iterator<String> it = set.iterator();
		while (it.hasNext())// ��Ұ� �����Ҷ����� true��ȯ
			System.out.println(it.next());// ��Ҹ� ��ȯ
		System.out.println(set);
		System.out.println("***map���� value�鸸 ���******");
		Collection<String> col = map.values();
		Iterator<String> it2 = col.iterator();
		while (it2.hasNext())
			System.out.println(it2.next());
	}
}












