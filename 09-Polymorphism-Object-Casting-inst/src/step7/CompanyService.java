package step7;

import step4.Animal;
import step4.Person;

public class CompanyService {
	public void playAll(Animal[] ani) {
		for(int i=0;i<ani.length;i++) {
			//�迭 ��Ұ� Person ��ü���� Ȯ�� 
			if(ani[i] instanceof Person) {
				//Person�� ������ ���(�޼���)�� �����ϱ� ���� Object down casting�� �Ѵ� 
				((Person) ani[i]).ticketing();
			}
			ani[i].play();
		}//for		
	}//method
}//class
