package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {
	private String copyFilePath;
	private String pasteFilePath;
	/*
	 * pasteFilePath 파일의 디렉토리가 존재하지 않는다면
	 * 디렉토리를 생성해준다
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
	 * copyFilePath의 파일을 입력받아 pasteFilePath에 출력하는 메서드
	 * 입력스트림 (BufferedReader)
	 * 출력스트림 (PrintWriter)
	 * try , finally ->close
	 * try구문에서 각각 스트림을 생성
	 * 입력받을 데이터가 있을 동안
	 * 입력받아 출력을 반복한다
	 * 
	 */
	public void copyAndPaste() throws FileNotFoundException,IOException  {
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










