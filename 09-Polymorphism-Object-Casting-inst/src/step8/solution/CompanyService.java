package step8.solution;

import step5.Employee;

public class CompanyService {
	//�θ� Employee Ÿ���� �迭�� �����ؼ� Employee �� �ڽ� ��ü��(Manager,Engineer)�� �����ϰ� �Ѵ� 
	private Employee[] array;
	//���� �迭�� ����� �� ����� 
	private int count;//instance variable�� ���� �ص� �⺻ �ʱ�ȭ 0 
	public CompanyService(int length) {
		array=new Employee[length];// ���޹��� ���ڰ� 10 �� ������ �迭�� �����Ѵ� ( ��� ��ü���� ���� ) 
	}
	public void add(Employee e) {
		array[count++]=e;//array�� count index ������ ��Ҹ� �߰��� �� count��  1�� �����ȴ� 
	}
	public void printAll() {
		for(int i=0;i<count;i++)
			System.out.println(array[i]);//println ���������� toString()�� ȣ��Ǿ� ��µȴ� 
	}
}
