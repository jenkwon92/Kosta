package step4;

public class MyDate {
	private int day;

	public int getDay() {
		return day;
	}
/**
 * ���޵Ǵ� day���� 1�̻� 31 �����̸� �Ҵ��ϰ�
 * 1�̸� �Ǵ� 31 �ʰ��̸� DayException�߻� �� 
 * ȣ���� ������ �����Ѵ� (day instance veriable�� �Ҵ��Ű�� �ʴ´�)
 * @param day
 * @throws DayException 
 */
	public void setDay(int day) throws DayException {
		if(day< 1 || day>31) {
			throw new DayException("1�� �̻� 31�� ������ ���� �Ҵ� ����");
		}
		this.day = day;
	}
	
}
