package step5;

import java.io.IOException;
import java.util.ArrayList;

public class TestObjectSerialization3 {
	public static void main(String[] args) {
		//�ټ��� ��ü�� ArrayList�� �����Ͽ� ��ü ����ȭ �ϴ� ����
		String path="C:\\kosta224\\iotest\\carlist.obj"; 
		CarService service = new CarService(path);
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(new Car("k5",2000));
		list.add(new Car("QM6",2500));
		
		try {
			service.saveList(list);
			System.out.println("car list�� ����ȭ�Ͽ� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
