package step6;

import java.io.File;
import java.io.IOException;

//jva.io.File �� �̿��� ���� ������ �ٷ�� ����
public class TestFile {
	public static void main(String[] args) {
		String path="C:"+File.separator+"kosta224";
		File dir = new File(path);
		System.out.println(dir.exists());
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		System.out.println(dir.getPath());
		File dir2 = new File(dir.getPath()+File.separator+"iotest");
		System.out.println(dir2.getPath());
		System.out.println(dir2.exists());
		//directory�� ������ ������ 
		System.out.println("mkdir : "+dir2.mkdir());
		//iotest�� ���� ��ġ�� iotest2 ���丮�� ���� ���丮 music�� �ѹ� �����ؼ� �Բ� �����غ���
		//iotest ��, dir2 �� ���� ���丮 ��ü�� ��ȯ�޴´� getPatentFile();
		File pd = dir2.getParentFile();
		System.out.println(pd.getPath());
		File dir3 = new File(pd.getPath()+File.separator+"iotest2"+File.separator+"music");
		System.out.println(dir3.getPath());
		System.out.println(dir3.mkdirs());
		//���� ����
		File file = new File(dir3.getPath()+File.separator+"info3.txt");
		try {
			System.out.println("file ���� : "+file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
