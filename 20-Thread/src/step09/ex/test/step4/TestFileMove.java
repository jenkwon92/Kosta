package step09.ex.test.step4;

import java.io.File;

/*
 * ������ �̵���Ű�� ���� �׽�Ʈ
 * File class�� renameTo() �� �̿��ϸ� �ȴ�
 */
public class TestFileMove {
	public static void main(String[] args) {
		String orgPath = "C:\\kosta224\\iotest\\org\\����.jfif";
		String destPath = "C:\\kosta224\\iotest\\dest\\����.jfif";
		
		File orgFile = new File(orgPath);
		File destFile = new File(destPath);
		
		boolean result = orgFile.renameTo(destFile);
		System.out.println("move : "+result);
		
	}
}
