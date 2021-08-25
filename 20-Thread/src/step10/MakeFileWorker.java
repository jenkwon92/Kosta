package step10;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;
	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}
	@Override
	public void run() {
		makeDir();
		try {
			makeFile();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void makeDir() {
		File dir = new File(CommonInfo.MAKE_PATH);
		if(!dir.isDirectory())
			dir.mkdirs();
	}	
	
	public void makeFile() throws InterruptedException, IOException {
		for(int i=0; i<makeCount; i++) {
			String fileName = createFileName(i);
			File file = new File(CommonInfo.MAKE_PATH+File.separator+fileName);
			file.createNewFile();
			System.out.println(fileName+" »ý¼º - MakeFileWorker Thread" );
			Thread.sleep(makePeriod);
		}
	}
	
	public String createFileName(int i) {
		String fileName = i+"_"+System.currentTimeMillis();
		Random r = new Random();
		if(r.nextBoolean())
			fileName +=".avi";
		else
			fileName +=".mp3";
		
		return fileName;
	}
}
