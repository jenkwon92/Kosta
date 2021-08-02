package step4;

public class KostaMember {
	private String id;
	public String password;
	
	public void setId(String id) {
		//this는 현재 객체를 가르킨다. this.id는 인스턴스 변수 id , id는 매개변수 id이다.
		//매개변수 id와 인스턴스 id를 구분하기 위해 this java keyword를 사용한다.
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	//password에 대한 setter 와 getter를 정의해본다 
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}
