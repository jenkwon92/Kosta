package step1;

import java.util.ArrayList;

/*
 * try , catch review
 */
public class TestException4 {
	public static void main(String[] args) {
		String name = "������";
		//name = null;
		ArrayList<String> list = new ArrayList<String>();
		try { //try : ���� �߻� ���� ���� ��ȭ
			System.out.println(name.length()); //Exception �߻��ϸ� �Ʒ� �ļ��۾����� ������� �ʰ� ��� catch ������ ����ȴ�
			System.out.println("�ļ� �۾�����" +list.get(2));
		} catch (NullPointerException ne) { //���� �߻��� �ش� Exception�� ó�� -> ��� �帧�� ����
			System.out.println("�̸��� ���������� �Է��ϼž� �մϴ�");
		}catch (IndexOutOfBoundsException ie) {
			System.out.println("����Ʈ�� ������ �ʰ��Ͽ� ������ Ȯ���� �� �����ϴ�");
		}catch (Exception e) { //���� ���� Ŭ������ ����ó��
			e.printStackTrace(); //���� �޼����� �߻���θ� ���
		}
		System.out.println("���α׷� ���� ����");
	}
}
