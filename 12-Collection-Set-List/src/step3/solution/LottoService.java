package step3.solution;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {
	/**
	 * �ζ� 1~45 ������ ���� (�ߺ��Ǿ�� �ȵȴ�) 6���� ���;� �Ѵ�
	 * 
	 * ������ �� �߻���Ű�� ���� Random�� �̿�
	 * 
	 * �ߺ� ���� x, ������ ���ؼ� TreeSet�� �̿��Ѵ�
	 * 
	 * while loop�� ���� (������? Random �� nextInt()�� ������ ������ ������� �ֱ� ������) -> TreeSet��
	 * size() �� 6�� �� ������ �ݺ��ؾ� ��
	 * 
	 * @return
	 */
	public TreeSet<Integer> createLottoNumber() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();

		while (set.size() < 6) {
			// nextInt (45) �� 0~44 ���� ������ ���� �����Ƿ� +1�� �Ѵ�
			set.add(r.nextInt(45) + 1);
		}
		// ���� for������ ǥ���Ѵٸ�
		/*
		 * for(;set.size()<6;){ set.add(r.nextInt(45) + 1); }
		 */
		return set;

	}
}
