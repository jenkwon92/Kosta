package step2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import step1.Person;

// ��ü ������ȭ�� ���� ���Ͽ� ����� ��ü�� ������ �Է¹޾� �޸𸮷� �����ϴ� ���� 
public class TestObjectInput {
	public static void main(String[] args) {		
		try {
			//���Ͽ� ����Ǵ� NodeStream
			FileInputStream fis=new FileInputStream("C:\\kosta224\\iotest\\person.obj");
			//��ü ������ȭ�� ���� ProcessingStream 
			ObjectInputStream ois=new ObjectInputStream(fis);
			//Person ��ü�� name�� ��ȯ�޾� ����Ϸ��� �Ѵٸ� Object down casting�� �ʿ� 			
			Person p=(Person)ois.readObject();
			System.out.println(p.getName());
			System.out.println(p);
			ois.close();
			System.out.println("�Է¿Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
