package step5.test;

import step5.kosta.service.PotatoPizzaService;
import step5.kosta.service.SeaFoodPizzaService;
import step5.service.PizzaService;

public class TestAbstract3 {
	public static void main(String[] args) {
		PizzaService serviceList[]= {new PotatoPizzaService(),new SeaFoodPizzaService()};
		for(int i=0;i<serviceList.length;i++) {
			serviceList[i].makePizza();//���� ������ ��� �۾� ������ �ϳ��� �޼��忡�� ó�� 
			System.out.println("***************");
		}
	}
}
