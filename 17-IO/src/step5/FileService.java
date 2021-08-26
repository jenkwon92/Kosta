package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		/*
		 * try -finally�� ������ ������ 
		 * printWriter���� FilenotFoundException�� �߻������� �Ʒ� while�� ��������ʰ� Throws IOException�� ���ؼ� �ٷ� ����ó���� �Ǳ⶧����
		 * �׻� br, pw�� �ݾ�����ϹǷ� finally���� ����ؼ� �ݾ��ִ� ��ɼ����� �ʿ��ϴ�
		 */
		BufferedReader br = new BufferedReader(new FileReader(copyFilePath));
		PrintWriter pw = new PrintWriter(pasteFilePath);
		
		while(br.ready()) {
			String order = br.readLine();
			pw.println(order);
		}
		
		if(br != null) {
			br.close();
		}
		
		if(pw != null) {
			pw.close();
		}
		
	}
	
	
	
}










