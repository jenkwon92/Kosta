package step4;
/*
 * Has a ���� : aggregation ���踦 �����غ��� ���� 
 */
public class TestHasAEx {
	public static void main(String[] args) {
		School school=new School("�ڽ�Ÿ");
		System.out.println(school.getName());//�ڽ�Ÿ 
		school.setStudent(new Student("������","21"));
		System.out.println(school.getStudent().getName());//������
		System.out.println(school.getStudent().getStuId());//21 
		//�� �ڵ忡 �����ϴ� Ŭ������ �ۼ��غ��� 
	}
}
