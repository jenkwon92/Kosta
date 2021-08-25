package step09.ex;

/*
 	��Ƽ ������ ���� ����
 	CommonInfo�� MAKE_PATH�� 1�� �������� 30�� �ݺ��ϸ� 30���� ������ ����
 	�� �� ���ϸ��� 0_�ð�����.avi or mp3 (Ȯ���ڴ� avi �Ǵ� mp3 �� �����ϰ� ����) ���� �����Ѵ�
 	
 	�̿� ���ÿ� CommonInfo�� MUSIC_PATH, MOVIE_PATH ���丮�� 
 	MAKE_PATH ���丮���� ������ ���ϵ��� Ȯ���ں��� �̵���Ų��
 	7�� �������� 5�� �����ؼ� ��� �̵��ǵ��� ó���Ѵ�
 	
 	�� ���۾��� ���ÿ� �����ϱ� ���ؼ� ��Ƽ ������ ������ �ʿ��ϴ� 
 	
 	������ �����ϴ� ������ : MakeFileWorker Thread
 	������ �̵���Ű�� ������ :MoveFileWorker Thread
 	������� implements Runnable ������� �����Ѵ�
 	
 	-���� �� ����
 	�ڷ����� �� �����׽�Ʈ
 	1. Ȯ���ڸ� �����ϰ� ����  //step09.ex.test.step1.TestRandom
 	2. �ð�����  					//step09.ex.test.step2.TestTime
 	1,2 �� �̿��� ���ϸ� ����	
 	3. ���丮 �� ���� ����	//step09.ex.test.step3.TestMakeFile
 	4. ���� �̵�					//step09.ex.test.step4.TestFileMove
 		
 	����
 	�� ���� �׽�Ʈ�� ���� ������ �̿��� 
 	��Ƽ ������ ���α׷� ����
 	 
 */
public class TestThread9 implements CommonInfo{
	public static void main(String[] args) {
		int makeCount = 30;
		int makePeriod = 1000;
		int moveCount = 5;
		int movePeriod = 7000;
		
		MakeFileWorker fileWorker = new MakeFileWorker(makeCount, makePeriod);
		MoveFileWorker moveWorker = new MoveFileWorker(moveCount, movePeriod);
		
		Thread t1 = new Thread(fileWorker);
		Thread t2 = new Thread(moveWorker);
		
		t1.start();
		t2.start();
	}
	
}
















