package step7;

import step4.Animal;
import step4.Person;

public class CompanyService {
	public void playAll(Animal[] ani) {

		for (int i = 0; i < ani.length; i++) {
			if (ani[i] instanceof Person) {
				((Person) ani[i]).ticketing();
			}
			ani[i].play();
		}
	}
}
