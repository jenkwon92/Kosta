package step6;

import java.util.ArrayList;

public class ShoppingCartService {
	private ArrayList<ProductVO> list= new ArrayList<ProductVO>();
	public void addProduct(ProductVO productVO) { //�θ�Ŭ������, �����������̽��� ����
		list.add(productVO);
	}
	
	public void printAll() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
