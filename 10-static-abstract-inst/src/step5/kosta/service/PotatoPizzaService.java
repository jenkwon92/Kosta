package step5.kosta.service;

import step5.service.PizzaService;

public class PotatoPizzaService extends PizzaService{
	@Override
	protected void topping() {
		System.out.println("���� ����");
	}
	//�������� ���ڴ� ���츦 ġ� �߰��ؼ� ����ڴ�
	@Override
	protected void prepare() {
		System.out.println("ġ� �߰��ϴ�");
		super.prepare();
	}
}
