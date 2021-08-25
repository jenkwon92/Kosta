package step09.study;

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
 	1. Ȯ���ڸ� �����ϰ� ����  //math random ����ϸ� �����Ӿ�����
 	2. �ð�����  					//dateformat�� �̿��ϸ� �����ʳ�? 
 	1,2 �� �̿��� ���ϸ� ����	
 	3. ���丮 �� ���� ����	//is directory , isfile �̿��ؼ� �ƴ� ��� ������� . IO , serialization ����ȭ �̿�
 	4. ���� �̵�				//������ �̿��ؼ� �����ָ� ����������
 	
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
















