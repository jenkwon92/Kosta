package step5;
// Generic�� ������ List �� ��
import java.util.ArrayList;

public class TestList3 {
	public static void main(String[] args) {
		ArrayList<FriendDTO> list  = new ArrayList<FriendDTO>();
		list.add(new FriendDTO("������", 100));
		list.add(new FriendDTO("�ں���", 200));
		list.add(new FriendDTO("���ϴ�", 50));
		//list.add("������"); //Generic�� ��õ� Ÿ���� �ƴϹǷ� compile error
		//list ��� �� index�� 1�� ����� name�� ���
		//Generic �� ����Ǿ����Ƿ� ������ casting�� �ʿ����
		System.out.println(list.get(1).getName());

		
		//for���� �̿��� ����� getMoney()�� ȣ���� money�� ���
		//������ ĳ���� �۾��� �ʿ����
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getMoney());
		}
	}
}
