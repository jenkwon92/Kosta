package step6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	private String orgImgPath;
	private String destImgPath;
	
	public ImageService(String orgImgPath, String destImgPath) {
		super();
		this.orgImgPath = orgImgPath;
		this.destImgPath = destImgPath;
	
		new File(destImgPath).getParentFile().mkdirs();
	}
	/**
	 * �̹��� ó���� ���� 1byte ������ ��Ʈ���� �̿��Ѵ�
	 * �Է½�Ʈ�� FileInputStream , BufferedInputStream
	 * ��½�Ʈ�� FileOutputStream, BufferedOutputStream
	 * @throws IOException 
	 */
	public void copyAndPasteImg() throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(orgImgPath));
			bos = new BufferedOutputStream(new FileOutputStream(destImgPath));
		
			int data = bis.read();
			
			while (data != -1) { //read() �޼���� �� �̻� ���� ����Ʈ�� ������ -1�� ��ȯ
				bos.write(data);
				data = bis.read();
			}
		}finally {
			if(bos != null) 
				bos.close();
			if(bis != null) 
				bis.close();
		}
	}	
}

















