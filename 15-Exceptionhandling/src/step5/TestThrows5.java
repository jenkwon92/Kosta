package step5;

import java.util.ArrayList;

import step4.DayException;
/*
 * Exception�� UncheckedException�迭�� CheckedException�迭�� ������ �� �ִ�
 * UncheckedException�� RuntimeException�� ���� (�ڽ�) Ŭ�������� ���ϸ� �����ڳ� �޼��忡�� ������ throws ���̵� ȣ���� ������
 * ���ĵǴ� ������ ������
 * CheckException�� RuntimeException �迭(��, �ڽ� ) �� �ƴ� ��� Exception�� ���ϸ� �����ڳ� �޼��忡�� 
 * Exception �߻��� throws�� �ݵ�� ����ؾ� �Ѵ� (������� ������ compile error�� ����)
 */
class ExceptionEx{
	/*
	 * �Ʒ� �޼����
	 * throws NullPointerException �� ���� �ʾƵ� ȣ���� ������ ��������. 
	 * ������ RuntimeException�� ���� Exception �̹Ƿ�
	 * ��, RuntimeException �迭�� Exception�� ������  throws �� ����� �ʿ䰡 ����.
	 */
	public void test1(String name) { 
		System.out.println(name.length() + "�� �̸��Դϴ�");
	}
	//IndexOutOfBoundsException�� RuntimeException�� �ڽ� Ŭ�����̹Ƿ� ������ throws���� ȣ���� ������ ���޵ȴ�
	public void test2(int index) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���");
		list.add("���");
		System.out.println(list.get(index));
	}
	//�Ʒ� DayException�� RuntimeException�� �ڽ��� �ƴϹǷ� throws �� �ݵ�� ����ؾ� �Ѵ�
	public void test3(int day) throws DayException {
		if(day<1 || day>31) {
			throw new DayException("�߸��� ��¥ �����Դϴ�.");
		}
		System.out.println(day+"�Ϸ� �������� ���������ϴ�");
	}
}
public class TestThrows5 {
	public static void main(String[] args) {
		ExceptionEx ex = new ExceptionEx();
		//���� �帧 �׽�Ʈ
		//ex.test1("RM");
		//���� ȣ�� �׽�Ʈ
		//ex.test1(null);
		//���� �帧 �׽�Ʈ
		//ex.test2(0);
		//���� �帧 �׽�Ʈ
		try {
			ex.test3(2);
		} catch (DayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
