package step09.study;

import java.io.File;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;
	
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}
	
	@Override
	public void run() {
		try {
			movie();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void movie() throws InterruptedException {
		String orgPath = "C:\\kosta224\\iotest\\repository";
		String destPath = "C:\\kosta224\\iotest\\movie";
		
		File destFile = new File(destPath);
		if(!destFile.exists()) {
			destFile.mkdirs();
		}
		
		for(int i=0; i<moveCount; i++) {
			File orgFile = new File(orgPath);
			
			String [] fileList = orgFile.list();
			
			for(String f : fileList) {
				File file = new File(orgFile, f);
				file.renameTo(new File("C:\\kosta224\\iotest\\movie", f));
			}
			Thread.sleep(movePeriod);
			System.out.println("MoveFileWorker Thread가 파일들을 이동");
		}
		
		
		
		
	}
	
	
}
