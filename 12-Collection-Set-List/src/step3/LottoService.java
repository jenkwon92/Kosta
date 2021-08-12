package step3;

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
	 * while loop�� ���� (������? Random �� nextInt()�� ������ ������ ������� �ֱ� ������)
	 * -> TreeSet�� size() �� 6�� �� ������ �ݺ��ؾ� ��
	 * @return
	 */
	public TreeSet<Integer> createLottoNumber() {
		TreeSet<Integer> set  =new TreeSet(); 
		Random r = new Random();
		while(set.size()==6) {
			for(int i=1; i<=45; i++) {
				set.add(r.nextInt(i));
			}
			
			break;
		}
		
		return set;
	}

}
