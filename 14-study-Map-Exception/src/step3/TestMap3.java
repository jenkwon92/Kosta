package step3;

public class TestMap3 {
	public static void main(String[] args) {
		CartService service = new CartService();
		service.addProuct(new ProductVO("a","�����","���ѱ�",1200));
		service.addProuct(new ProductVO("b","¥�İ�Ƽ","���",1400));
		service.addProuct(new ProductVO("c","�����","�ȵ�",1300));
		service.printAll();
		String id ="d";
		System.out.println(service.findProductById(id)); //null
		id="b";
		System.out.println(service.findProductById(id)); //b�� �ش��ϴ� ��ǰ���� ���
		System.out.println("******������*******");
		service.printAll();
		service.deleteProductById(id);
		System.out.println("******������*******");
		service.printAll();
		System.out.println("*****�� ��ǰ�ݾ�******");
		System.out.println(service.getTotalPrice()); //2500
	}
}
