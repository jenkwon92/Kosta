package step3;

//abstract class 와 abstract method test
abstract class Animal {
	Animal(){
		System.out.println("Animal 객체 생성");
	}
	//abstract method는 구현부가 존재하지 않고 선언만 한다
	//자식(하위) 클래스에게 구현을 강제한다.
	public abstract void eat();
}
//Animal 을 상속받으면 Animal abstract method 를 구현하거나 아니면 자신도 abstract로 선언되어야 한다.
class Person extends Animal {
	Person(){ super();
		System.out.println("Person 객체 생성");
	}
	@Override
	public void eat() {
		System.out.println("사람이 먹다");
		
	}
}

public class TestAbstract1 {
	public static void main(String[] args) {
		//Animal a = new Animal(); //abstract class는 실제화 할 수 없다(즉, 직접 객체 생성 할 수 없음)
		Animal a = new Person(); //자식 객체 생성시 super()를 이용해서 객체 생성은 된다
		a.eat();
	}
}
