package step6.solution;

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

	public void deleteEmployeeByEmpNo(String empNo) {
		for(int i=0; i<=count; i++) {
			if(empNo.equals(array[i].getEmpNo())){
				array[i]=array[i+1];
				break;
			}else {
				System.out.println(empNo+"�����ȣ�� �ش��ϴ� ����� ���� ���� �Ұ�");
				break;
			}
		}
		
		
	}
}
