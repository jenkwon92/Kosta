package step5.kosta.service;

import step5.service.PizzaService;

public class SeaFoodPizzaService extends PizzaService{
	@Override
	protected void topping() {
		System.out.println("�ػ깰 ����");
	}
}
