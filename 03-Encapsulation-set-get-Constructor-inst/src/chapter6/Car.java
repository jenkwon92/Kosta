package chapter6;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car (){
		this("white", "auto",2);
	}
	
	Car(String color){
		this(color, "auto", 4);
	}
	
	Car (String color, String g, int d){
		this.color = color;
		this.gearType = g;
		this.door = d;
	}
	
}
