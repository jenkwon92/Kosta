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
	public void copyAndPaste() throws IOException  {
		/*
		 * try -finally를 써주지 않으면 
		 * printWriter에서 FilenotFoundException이 발생됐을때 아래 while이 실행되지않고 Throws IOException을 통해서 바로 예외처리가 되기때문에
		 * 항상 br, pw를 닫아줘야하므로 finally문을 사용해서 닫아주는 기능수행이 필요하다
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










