package step5;
// TestList2 �� Generic�� �������� �ʾ��� ���� ��, Generic�� ������ TestList3�� ���غ���
import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		ArrayList list  = new ArrayList();
		list.add(new FriendDTO("������", 100));
		list.add(new FriendDTO("�ں���", 200));
		list.add(new FriendDTO("���ϴ�", 50));
		//list.add("��������"); //Generic�� �������� �ʾƼ� �ٸ� Ÿ���� ��ҵ� �߰� ����
		//list ��� �� index �� 1�� ����� name�� ����ϰ��� �Ѵ�
		/*
		Object o = list.get(1);
		FriendDTO dto = (FriendDTO)o ;//����ȯ, Object down casting �� �ʿ�
		System.out.println(dto.getName()); //�ڽ� Ŭ������ ������ ����� ȣ���� �� ����
		*/
		//�Ʒ��� ���� �ٿ��� ����
		//FriendDTO dto = (FriendDTO)list.get(1);
		//System.out.println(dto.getName());
		
		// �� ���̸� 
		System.out.println(((FriendDTO)list.get(1)).getMoney());
		
		//for���� �̿��� ����� getMoney() ȣ���ؼ� money�� ���
		for(int i =0;i<list.size(); i++) {
			FriendDTO fd = (FriendDTO)list.get(i);
			System.out.println(fd.getMoney());
		}
	}
}
