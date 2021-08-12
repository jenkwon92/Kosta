package step6;

import java.util.ArrayList;

public class ShoppingCartService {
	private ArrayList<ProductVO> list= new ArrayList<ProductVO>();
	public void addProduct(ProductVO productVO) { //부모클래스명, 상위인터페이스명 가능
		list.add(productVO);
	}
	
	public void printAll() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
