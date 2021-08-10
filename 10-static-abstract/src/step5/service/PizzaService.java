package step5.service;

public abstract class PizzaService {
	protected void prepare() {
		System.out.println("도우를 만들다");
	}
	/*
	 *  부모 차원에서 구현할 수 없는 메서드는 abstract로 선언해서
	 *  자식 클래스 차원에서 반드시 구현하게 강제한다
	 */
	protected abstract void topping();
	protected void bake() {
		System.out.println("굽다");
	}
	
	protected void cutting() {
		System.out.println("자르다");
	}
	protected void boxing() {
		System.out.println("포장하다");
	}
	
	/*
	 * 작업 공정(알고리즘) 을 정의해 자식 클래스에게 물려주는 템플릿 메서드
	 */
	public void makePizza() {
		prepare();
		topping(); //자식 객체의 오버라이딩된 메서드가 호출
		bake();
		cutting();
		boxing();
	}
}
