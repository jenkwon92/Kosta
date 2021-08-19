package test.step2;

import model.DuplicateTelException;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Teacher;

public class TestCaseFind {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		try {
			service.addMember(new Teacher("011","�����","����","����"));//-> �ߺ��ȴ� 
			System.out.println("��� ok");
		}catch(DuplicateTelException de) {//���� tel�� �����ϸ� 
			System.out.println(de.getMessage());//011 tel �ߺ��Ǿ� ��ϺҰ��մϴ�!
		}	
		
		service.printAll(); //�θ��� ������ (toString() �� ��µǾ�� �Ѵ� 
		System.out.println("������ �׽�Ʈ �Ϸ�");
		try {
			String tel ="016"; //�����帧
			tel = "018"; //�����帧
			Member m = service.findMemberByTel(tel);
			System.out.println("�˻�ok : "+m); //tel�� �����ϸ� �˻� ok  
			System.out.println(m);
		}catch(MemberNotFoundException me){
			System.out.println(me.getMessage()); //018 tel�� �ش��ϴ� ������ ������ �����ϴ�
		}
	}
	
}
