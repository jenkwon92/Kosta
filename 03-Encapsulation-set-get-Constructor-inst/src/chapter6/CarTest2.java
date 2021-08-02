package chapter6;

public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car("red","manual",4);
		
		System.out.println(c1.color+" , " + c1.gearType + " , " + c1.door);
		System.out.println(c2.color+" , " + c2.gearType + " , " + c2.door);
		System.out.println(c3.color+" , " + c3.gearType + " , " + c3.door);
	}
}
