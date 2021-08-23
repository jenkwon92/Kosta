package step3;

import java.io.Serializable;

public class AccountVO implements Serializable{
	private static final long serialVersionUID = -1228027460190959086L;
	private String name;
	private int balance;
	//transient :��ü ����ȭ��󿡼� ����
	private transient String password;
	public AccountVO(String name, int balance, String password) {
		super();
		this.name = name;
		this.balance = balance;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AccountVO [name=" + name + ", balance=" + balance + "]";
	}
	
	
}
