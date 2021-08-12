package step5;
//DTO : Data Transfer Object , VO : Value Object
/**
 * @author KOSTA
 *
 */
public class FriendDTO {
	private String name;
	private int money;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public FriendDTO(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	/*
	 * @Override public String toString() { return "name : " +name
	 * +" money : "+money ; }
	 */
	
	//Alt+Shift+s +s
	@Override
	public String toString() {
		return "FriendDTO [name=" + name + ", money=" + money + "]";
	}
	
}

















