package step1;

public class TestRefArrayReview {
	public static void main(String[] args) {
		ItemVO [] items= {
				new ItemVO("1","�����",1000),
				new ItemVO("2","¥�İ�Ƽ",1600),
				new ItemVO("3","����ø�",800)
		};
		ItemService service=new ItemService();
		//service.printNameAll(items);
		int price=1200;
		//price(1200) �̸��� item�� name�� price�� ���
		service.printNameAndPriceByPrice(items,price);
	}
}
