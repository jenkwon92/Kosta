package step2;
/*
 * ���� ������ �׽�Ʈ
 */
public class TestAccessModifier {
	public static void main(String[] args) {
		Account a = new Account();
		
		System.out.println(a.no1);//�������̹Ƿ� 0���� �ʱ�ȭ
		a.no1=1111; //�Ҵ�
		System.out.println(a.no1);
		
		//default �� ������ ���� 
		a.no2 = 2222; //������ ��Ű���̹Ƿ� ���� ����
		System.out.println(a.no2);
		
		//private�� �����غ��� 
		//private �� �ٸ� Ŭ�������� ������ �Ұ��ϹǷ� �Ʒ��ڵ��
		//compile error�� ����
		//a.no3 = 3333;
		
	}
}
