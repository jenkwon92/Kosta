package step09.study;

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
		try {
			file();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void file() throws InterruptedException {
		//String name = null;
		File dir = new File("C:\\kosta224\\iotest\\repository");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		for(int i=0; i<makeCount; i++) {
			String name  = i+"_"+name();
			File file = new File("C:\\kosta224\\iotest\\repository\\"+name);
			
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(name +" »ý¼º - MakeFileWorker Thread" );
				Thread.sleep(makePeriod);
		}
	}
	
	public String name() {
		
		String ext = null;
		Random r  =new Random();
		if(r.nextBoolean()) 
			ext =".avi";
		else 
			ext=".mp3";
		
		return System.currentTimeMillis() +ext;
	}
}
