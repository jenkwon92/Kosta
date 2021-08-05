package step3;

public class Car {
	private String model;
	// has a ( consist of ) -> composition 
	private Engine engine;
	/*
	 * Car �� Engine�� ����� composition �����̹Ƿ� life cycle�� �Բ� �Ѵ� 
	 * �� Car ��ü ������ Engine�� �����Ǿ� �ν��Ͻ� ������ �Ҵ�ǵ��� �Ѵ�  
	 */
	public Car(String model) {
		this.engine=new Engine("�ͺ�",2000);//Car ��ü �����ϸ� �׻� Engine ��ü�� ��������� 
		this.model=model;
	}	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
