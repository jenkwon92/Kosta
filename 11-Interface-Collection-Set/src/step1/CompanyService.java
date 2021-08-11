package step1;

import java.util.ArrayList;

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

	/**
	 * �Ű������� ���޵� empNo �� �ش��ϴ� ��� ������ array ���� �����ϸ� �ش� ��ü�� �ּҰ��� ��ȯ�ϰ� �������� ������ null��
	 * ��ȯ
	 * 
	 * @param empNo
	 * @return employee
	 */
	public Employee findEmployeeByEmpNo(String empNo) {
		Employee employee = null;
		for (int i = 0; i < count; i++) {
			if (empNo.equals(array[i].getEmpNo())) { // �Ű������� ���޵� empNo�� �迭 ����� empNo�� ��ġ�ϸ�
				employee = array[i];
				break; // for�� �����
			}
		}
		return employee;

	}

	/*
	 * public int findPositionByEmpNo(String empNo) { int position=-1; for (int i =
	 * 0; i < count; i++) { if (array[i].getEmpNo().equals(empNo)) { position = i;
	 * break; } } return position; }
	 */

	/**
	 * �Ű� ������ ���ڰ��� ���޵� �����ȣ empNo �� �迭 ����� �����ȣ�� ��ġ�ϸ� �迭�� ��ġ�� ��ȯ�ϴ� �޼���, ���� ��ġ�ϴ� ��Ұ�
	 * ������ -1�� ��ȯ
	 * 
	 * @param empNo
	 * @return position
	 */

	public int findPositionByEmpNo(String empNo) {
		int position = -1;
		for (int i = 0; i < count; i++) {
			if (empNo.equals(array[i].getEmpNo())) {
				position = i;
				break;
			} // if
		} // for
		return position;
	}// method

	/**
	 * ��� ������ �����ϴ� �޼��� �Ű������� ���޵� ���ڰ� empNo�� �ش��ϴ� �����ü�� �迭��ҷ� �����ϸ� �����ϴ� �޼��� ���� �����ȣ��
	 * ��ġ�ϴ� �迭 ��Ұ� ���ٸ� ex> 99 �����ȣ�� �ش��ϴ� ����� ��� �����Ұ� ��� �޼����� �����
	 * 
	 * ��ġ�ϴ� ����� ������ �ش� ����� �迭�� ��ġ�� position �� �̿��� �� �������� �ѻ���� (count) ���� ���� ���� �ݺ��ϸ鼭
	 * �� ��Ҹ� �տ�ҷ� �Ҵ��ϴ� ������� �����Ѵ� (ex -> array[i] = array[i+1]) ������ �� �� ������� -1���ҽ�Ų��
	 * ���� ������ ��Ұ� �迭�� ������ ��Ҷ�� array[i]= array[i+1]; �۾��� �Ұ����ϹǷ�, �� ��쿡�� ���� null��
	 * �Ҵ��Ѵ� (array.length�� �̿��ϸ� �迭�� ������ ������� Ȯ�� �����ϴ�)
	 * 
	 * @param empNo
	 */
	public void deleteEmployeeByEmpNo(String empNo) {
		int position = findPositionByEmpNo(empNo);
		if (position == -1) {
			System.out.println(empNo + " �����ȣ�� �ش��ϴ� ����� ��� �����Ұ�");
		} else {
			for (int i = position; i < count; i++) {
				if (i+1 == array.length) { //������ ��Ұ� �迭�� ������ ��Ҷ��
					array[i] = null;
				} else {
					array[i] = array[i + 1];
				}
			}
			count--; // ���������Ƿ� �ѻ������ -1�Ѵ�.
		}
	}

}
