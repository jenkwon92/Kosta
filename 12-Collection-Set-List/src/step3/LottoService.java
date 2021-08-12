package step3;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {
	/**
	 * 로또 1~45 까지의 정수 (중복되어서는 안된다) 6개가 나와야 한다
	 * 
	 * 임의의 수 발생시키기 위해 Random을 이용
	 * 
	 * 중복 인정 x, 정렬을 위해서 TreeSet을 이용한다
	 * 
	 * while loop가 적합 (이유는? Random 의 nextInt()는 동일한 정수를 만들수도 있기 때문에)
	 * -> TreeSet의 size() 가 6이 될 때까지 반복해야 함
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
