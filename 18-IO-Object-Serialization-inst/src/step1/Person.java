package step1;

import java.io.Serializable;

// Person class�κ��� ������ ��ü�� ����ȭ(�ܺη� ���۵Ǳ� ���� ����)�Ǳ� ���ؼ���
// �Ʒ��� ���� Serializable interface�� implements �ؾ� �Ѵ� 
public class Person implements Serializable {
	/**
	 * ���� ������������ ���� serialVersionUID�� �����Ѵ�
	 */
	//private static final long serialVersionUID = 9160681603708373621L;
	private String name;
	private String address;
	private int money;
	// �ν��Ͻ� ���� �߰�
	private String hobby;

	public Person(String name, String address, int money) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
	}

	public Person(String name, String address, int money, String hobby) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
		this.hobby = hobby;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", money=" + money + "]";
	}

}
