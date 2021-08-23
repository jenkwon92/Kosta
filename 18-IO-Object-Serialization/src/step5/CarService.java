package step5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarService {
	private String path;
	
	public CarService(String path) {
		super();
		this.path = path;
	}

	public void saveList(ArrayList<Car> list) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(list);
		}finally {
			if(oos != null)
				oos.close();
		}
	}
	
	//unchecked - warning���� : warning�� ���� �ʰڴٴ� ������̼�
	//������ Ÿ��üũ�� ���� �ʰڴٴ� �ǹ�
	@SuppressWarnings("unchecked") 
	public ArrayList<Car> loadList() throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<Car> list =null;
		ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(new FileInputStream(path));
			list = (ArrayList<Car>) ois.readObject();
			
		}finally {
			if(ois != null)
				ois.close();
		}
		return list;
	}


}
