package step1;
class Ex{
	String message;
	Ex(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
}

class MyEx extends Ex{
	MyEx(String message){
		super(message);
	}
}

public class Test {
	public static void main(String[] args) {
		MyEx m = new MyEx("a"); //�θ� �ν��Ͻ� ���� message�� �Ҵ�
		System.out.println(m.getMessage()); //��ӹ��� �޼��带 ȣ��
	}
}
