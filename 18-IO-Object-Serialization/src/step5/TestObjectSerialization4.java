package step5;

import java.io.IOException;
import java.util.ArrayList;

public class TestObjectSerialization4 {
	public static void main(String[] args) {
		//�ټ��� ��ü�� ArrayList�� �����Ͽ� ��ü ����ȭ �ϴ� ����
		String path="C:\\kosta224\\iotest\\carlist.obj"; 
		CarService service = new CarService(path);
		
		
		try {
			ArrayList<Car> list =service.loadList();
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println("car list�� ������ȭ�Ͽ� Ȯ��");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
