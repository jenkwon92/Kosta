package step8.solution;

import step5.Employee;

public class CompanyService {
	// �θ� Employee Ÿ���� �迭�� �����ؼ� Employee �� �ڽ� ��ü��(Manager, Engineer) �� �����ϰ� �ȴ�
	private Employee[] array;
	// ���� �迭�� ����� �� �����
	private int count; // instance variable�� ���� �ص� �⺻ �ʱ�ȭ0

	public CompanyService(int length) {
		array = new Employee[length]; // ���޹��� ���ڰ� 10�� ������ �迭�� �����Ѵ�. (���, ��ü���� ����)
	}

	public void add(Employee e) {
		array[count++] = e; // array�� count index ������ ��Ҹ� �߰��� �� count�� 1�� �����ȴ�
	}

	public void printAll() {
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]); // println ���������� toString()�� ȣ��Ǿ� ��µȴ�.
		}
	}

	public Employee findEmployeeByEmpNo(String empNo) {
		Employee employee = null;
		for (int i = 0; i < count; i++) {
			if (array[i].getEmpNo().equals(empNo)) {
				employee = array[i];
				break;
			}
		}
		return employee;
	}
	
	public void deleteEmployeeByEmpNo(String empNo) {
		Employee arr = null;
		for (int i = 0; i < count;i++) {
			if (empNo.equals(array[i].getEmpNo())) {
				array[i] = arr;
				array[i] = array[i + 1];
				break;
			} else {
				System.out.println(empNo + " �����ȣ�� �ش��ϴ� ����� ���� ���� �Ұ�");
				break;
			}

		}
	}
	/*
	 * public Employee[] findEmployeeByEmpNo(String empNo) { for(int i=0;
	 * i<array.length; i++) { if(array[i].getEmpNo().equals(empNo)) { return
	 * array[i]; } } return array; }
	 */

}
