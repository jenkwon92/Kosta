package step7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestIterator {
	public static void main(String[] args) {
		//Iterator : �ݺ���. Collection �迭�� ��� �ڷ� ����ü���� �ϳ��� ������ ������� ��ҵ��� �ݺ� ������ �� �ֵ���
		//				 ����� �����ϴ� �������̽�
		// ���� �������̽� Ÿ������ ��������
		Collection<String> c1 = new LinkedHashSet<String>();
		c1.add("ī��");
		c1.add("�׶�");
		c1.add("�Ѹ�");
		Iterator<String> it1 = c1.iterator();
		while(it1.hasNext()) //���� ��Ұ������� true
			System.out.println(it1.next()); //���� ��Ҹ� ��ȯ
		System.out.println("**********************");
		Collection<String>c2 = new ArrayList<String>();
		c2.add("ġŲ");
		c2.add("�����");
		c2.add("����");
		Iterator<String> it2 = c2.iterator();
		while(it2.hasNext())
			System.out.println(it2.next()); //��� �ڷᱸü���� iterator��� �ϳ��� ������� �������� 
														  // ��κ� for���� ����ϱ������� �����ص� ��
	}
}
