package step5;

public class SmartPhone {
	// instance variable ( or member variable ) 
	private String model;
	private int price;//instance variable 
	public String getModel() {
		return model;
	}
	//아래 model은 매개변수parameter이자 지역변수 
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	//price 는 parameter 이자 local variable 
	public void setPrice(int price) {
		this.price = price;
	}
	
}
