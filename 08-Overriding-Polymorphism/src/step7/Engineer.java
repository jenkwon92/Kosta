package step7;

public class Engineer extends Employee{
	private String skill;
	
	public Engineer(String empNo, String name, int salary, String skill) {
		super(empNo, name, salary);
		this.skill = skill;
	}
	
	//�޼��� �������̵�
	@Override //������̼� -> �ǹ��ִ� �ּ� �����ϰ� ��Ÿ�ӽ� ������ �ش� 
	//@Override ������̼��� �����Ͻÿ� �������̵� ������ üũ���ش�
	public String toString() {
		return super.toString()+" skill:"+skill;
	} 
}
