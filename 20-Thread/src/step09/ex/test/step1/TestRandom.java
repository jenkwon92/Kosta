package step09.ex.test.step1;

import java.util.Random;

//mp3 or avi ���ڿ���  �����ϰ� ����
public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		//for(int i = 0; i<10; i++)
		//System.out.println(r.nextBoolean());
		String ext = null;
		if(r.nextBoolean())
			ext =".avi";
		else
			ext = ".mp3";
		System.out.println(ext);
	}
}
