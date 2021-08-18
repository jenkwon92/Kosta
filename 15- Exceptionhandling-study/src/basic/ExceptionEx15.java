package basic;

import java.io.File;

public class ExceptionEx15 {
	public static void main(String[] args) {
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다");
	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다");
		} catch (Exception e) {
			// fileName이 부적절한 경우 , 파일이름을 '제목없음.txt'로 한다
			fileName = "제목없음.txt";
			e.printStackTrace();
		}finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}

	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
