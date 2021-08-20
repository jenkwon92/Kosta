package step5_solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {
	private String copyFilePath;
	private String pasteFilePath;
	/*
	 * pasteFilePath ������ ���丮�� �������� �ʴ´ٸ�
	 * ���丮�� �������ش�
	 */
	public FileService(String copyFilePath, String pasteFilePath) {
		super();
		this.copyFilePath = copyFilePath;
		this.pasteFilePath = pasteFilePath;
		
		File dir = new File(pasteFilePath).getParentFile();
		if(dir.isDirectory()==false) {
			dir.mkdirs();
		}
	}
	//throws 
	/*
	 * copyFilePath�� ������ �Է¹޾� pasteFilePath�� ����ϴ� �޼���
	 * �Է½�Ʈ�� (BufferedReader)
	 * ��½�Ʈ�� (PrintWriter)
	 * try , finally ->close
	 * try�������� ���� ��Ʈ���� ����
	 * �Է¹��� �����Ͱ� ���� ����
	 * �Է¹޾� ����� �ݺ��Ѵ�
	 * 
	 */
	public void copyAndPaste() throws IOException  {
		BufferedReader br = null; //�ʱ�ȭ�� �����ָ� finally ���� ���ɼ��� ����
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader(copyFilePath)); //FileNotFoundException�� IOException�� �ڽ��̱⋚���� �ΰ��� throws�����ʿ����
			pw = new PrintWriter(pasteFilePath);
			
			String data = br.readLine();
			while(data != null) { //data�� null�� �ƴ� ���� �ݺ�
				pw.println(data); //���Ͽ� ���
				data = br.readLine(); //���� ������ �д´�
			}
		}finally {
			if(pw != null)
				pw.close();
			if(br != null) 
				br.close();				
			
		}
		
	}
	
	
	
}










