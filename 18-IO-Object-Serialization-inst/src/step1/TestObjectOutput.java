package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// ��ü ����ȭ�Ͽ� ���Ͽ� ��ü�� ������ ������ �����ϴ� ���� 
// �����Ϸ��� �ϴ� ��ü�� Ŭ������ java.io.Serializable interface ���� ���� �Ͽ� ���� �ʴٸ� �Ʒ��� ���� ���ܰ� �߻��ȴ� 
// java.io.NotSerializableException: step1.Person
public class TestObjectOutput {
	public static void main(String[] args) {		
		try {
			//���Ͽ� ����Ǵ� NodeStream
			FileOutputStream fos=new FileOutputStream("C:\\kosta224\\iotest\\person.obj");
			//��ü ����ȭ ����� �����ϴ� ProcessingStream
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Person p=new Person("������","����",100);
			oos.writeObject(p);
			oos.close();
			System.out.println("��¿Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









