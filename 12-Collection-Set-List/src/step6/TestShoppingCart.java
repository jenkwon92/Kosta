package step6;

//ArrayList ���� ����
public class TestShoppingCart {
	public static void main(String[] args) {
		ShoppingCartService service = new ShoppingCartService(); 
		//ShoppingCartService class�� instance variable�� ArrayList �� �ִ�
		service.addProduct(new ProductVO("�׶�","����",2000)); //list�� �߰�
		service.addProduct(new ProductVO("���̽�������","����",1100)); //list�� �߰�
		service.addProduct(new ProductVO("���������","����",6000)); //list�� �߰�
		service.printAll(); //���� ��ٱ��Ͽ� �ִ� ��ǰ�� �߰�������� ��� ��µȴ�
		
		int totalPrice = service.getCartTotalPrice();
		System.out.println("��ǰ �Ѿ� : "+totalPrice+"��"); //9100��
	}
}
