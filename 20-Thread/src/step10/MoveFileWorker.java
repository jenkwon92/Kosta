package step10;

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
		makeDirs();
		for(int i=0; i<moveCount; i++) {
			try {
				Thread.sleep(movePeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			moveFiles(); //����ϴٰ� ������ ��������� ����- ���Ƣ�� �ʿ���� (���� 7�ʰ� ����� ������ ��������� �����̱�)
			System.out.println("MoveFileWorker Thread�� ���ϵ��� �̵�");
		}
	}
	
	//�̵���ų ���丮�� �������� ������ ���丮�� �����ϴ� �޼��� , run() ���� ȣ���ؼ� ���
	public void makeDirs(){
		File movieDir = new File(CommonInfo.MOVIE_PATH);
		File musicDir = new File(CommonInfo.MUSIC_PATH);
		
		if(!movieDir.isDirectory() ) {
			movieDir.mkdirs();
		}
		if(!musicDir.isDirectory())
			musicDir.mkdirs();
			
		//System.out.println("movie�� music directory ����");
			
	}
	
	//java.io.File listFiles() :File[]
	// renameTo()
	public void moveFiles() {
		//System.out.println("repository�� ������ ���ϵ��� Ȯ���ں��� movie�� music ���丮�� �̵�");
		// MakeFileWorker Thread �� ������ �����ϴ� ���丮
		File repositoryDir = new File(CommonInfo.MAKE_PATH);
		File[] files = repositoryDir.listFiles(); //���丮�� �ִ� ���� (or ���丮)���� �迭�� ��ȯ
		for(int i=0; i<files.length; i++) {
			//System.out.println(files[i].getName()+" �̵����Ѿ� �� ����");
			String destPath = null;
			if(files[i].getName().endsWith(".avi"))
				destPath = CommonInfo.MOVIE_PATH;
			else if(files[i].getName().endsWith(".mp3"))
				destPath = CommonInfo.MUSIC_PATH;
			File destFile = new File(destPath+File.separator+files[i].getName());
			//�̵���� ���� ��ü .renameTo(�̵������� ��ü)
			files[i].renameTo(destFile);
		}
	}
	
}
