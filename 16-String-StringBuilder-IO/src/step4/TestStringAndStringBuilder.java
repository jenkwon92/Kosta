package step4;

/*
 	���ڿ��� �ٷ�� String�� StringBuilder �� Ư¡
 	
 	String : �Һ� , ��� -> ���ڿ� �������(literal pool)�� ���� , 
 				�ѹ� ������ ���ڿ��� ���� ������ �����ؼ� ��� -> ������ ���ڿ��� ���� ���� ��� �޸𸮸� ȿ�������� ���
 				String ���ڿ��� �޼��带 �̿��� �����͸� �߰� �Ǵ� ���� �Ǵ� ������ ��쿡�� ��ü�� ������� �ʰ�
 				���� ����
 	StringBuilder : ����, StringBUilder �޼��带 �̿��� �߰��Ǵ� ���� �Ǵ� ������ ��� ��ü�� ����
 							������ ���ڿ��� ���� ����� �� ����
 							
 		String		vs 	StringBuilder		vs		StringBuffer
 		�Һ�						����							����
 		���λ���					��ü�� ����					��ü�� ����
 																		����ȭ ����(thread safe)-> ���� ���ο���
 */
public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String name = "������"; // String�� �Һ�(���)
		System.out.println(name.concat("��")); // �������� ���ڿ��� ���� ���� -> String�� ���� ������ ������ �� �����Ƿ�
		System.out.println(name);//name�� ������
		System.out.println("********************");
		StringBuilder sb = new StringBuilder("������"); //StringBuilder or StringBuffer�� ���� 
		System.out.println(sb.append("��"));// �������� ->StringBuilder �� ��ü�� ����
		System.out.println(sb); //sb�� �������� (���� ��ü�� �����)
		System.out.println("********************");
		String nick = "�����";
		StringBuilder snick = new StringBuilder("�����");
		System.out.println(nick+" "+snick);
		//�� �׽�Ʈ
		System.out.println(nick == snick.toString()); //==�δ� ���ڿ� �񱳺Ұ�
		System.out.println(nick.equals(snick.toString())); //equlas�� �񱳵� (StringBuilder or StringBuffer�� toString() �ʿ�)
		System.out.println(nick.contentEquals(snick)); //contentEquals��  String�� StringBuilder or StringBuffer�� �ٷ� ��
		
	}
}








