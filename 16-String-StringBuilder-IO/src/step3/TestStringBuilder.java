package step3;
//StringBuilder method test	
public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("�谡��");
		System.out.println(sb);
		System.out.println(sb.append("��ġ���"));
		System.out.println(sb.indexOf("��"));
		System.out.println(sb.substring(2,5)); //index 2���� 5�ձ���
		System.out.println(sb.insert(2, "��")); //�谡���� ��ġ���
		System.out.println(sb.delete(2, 5)); //�谡ġ���
		StringBuilder message =new StringBuilder("�����尡����");
		System.out.println(message.reverse());
	}
}
