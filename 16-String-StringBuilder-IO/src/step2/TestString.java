package step2;

public class TestString {
	public static void main(String[] args) {
		String name="������";
		System.out.println(name.concat("��"));
		System.out.println(name.contains("��"));
		System.out.println(name.contains("��"));
		System.out.println(name.indexOf("��")); //2  index��ȯ
		System.out.println(name.indexOf("��"));  //�������������� index�� -1�� ��ȯ
		System.out.println(name.startsWith("����")); //���̷� �����ϸ� true�� ��ȯ
		System.out.println(name.endsWith("����"));
		String info="���ϰ��ִ�";
		System.out.println(info.substring(2));//2 beginIndex
		System.out.println(info.substring(2,4)); //beginIndex���� endIndex �ձ���
		String id ="javaking ";
		System.out.println(id.length());
		System.out.println(id.trim()); //�� �� ������ ����
		System.out.println(id.trim().length()); //�� �� ������ ���� �� length Ȯ��
		String nick="���ڿ���";
		System.out.println(nick.replace("��", "��"));
		String fileName ="org.web.t.java";
		System.out.println(fileName.lastIndexOf(".")); //������ ���ڿ���index�� ��ȯ
		int i = fileName.lastIndexOf(".");
		System.out.println(fileName.substring(i+1)); //������ Ȯ���ڸ� ���Ѵ�
		System.out.println(fileName.replace(".java", "")); //.java �� ������ ���ڿ� ����
	} 
}
