package step1;

//Service : ����Ͻ� ������ ������ Ŭ����(Object)
public class ItemService {
	// �Ű������� ���޵� ���ڰ��� items �迭�̹Ƿ� ������ Ÿ���� ItemVO[] �̾�� �Ѵ�
	// items �迭 ��� �������� name�� ��� ����Ѵ�
	public void printNameAll(ItemVO[] items) {
		for (int i = 0; i < items.length; i++)
			System.out.println(items[i].getName());
	}
	public void printNameAndPriceByPrice(ItemVO[] items, int price) {
		for (int i = 0; i < items.length; i++) {
			if(items[i].getPrice()<price) {
				System.out.println(items[i].getName()+" "+items[i].getPrice());
			}//if
		} // for
	}// method
		// �ڵ� ���� ctrl + shift + f
}
