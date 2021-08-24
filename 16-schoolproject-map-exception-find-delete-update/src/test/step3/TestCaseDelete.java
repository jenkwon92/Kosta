package test.step3;

import model.DuplicateTelException;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Teacher;

public class TestCaseDelete {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		try {
			service.addMember(new Teacher("011","장기하","제주","영어"));//-> 중복된다 
			System.out.println("등록 ok");
		}catch(DuplicateTelException de) {//기존 tel이 존재하면 
			System.out.println(de.getMessage());//011 tel 중복되어 등록불가합니다!
		}	
		
		service.printAll(); //두명의 상세정보 (toString() 가 출력되어야 한다 
		System.out.println("구성원 테스트 완료");
		try {
			String tel ="016"; //정상흐름
			tel = "018"; //예외흐름
			Member m = service.findMemberByTel(tel);
			System.out.println("검색ok : "+m); //tel이 존재하면 검색 ok  
			System.out.println(m);
		}catch(MemberNotFoundException me){
			System.out.println(me.getMessage()); //018 tel에 해당하는 구성원 정보가 없습니다
		}
		System.out.println("구성원 검색 테스트 완료**");
		try {
			String tel="011"; //정상흐름
			//tel ="018"; //예외흐름
			Member mem = service.deleteMemberByTel(tel);
			System.out.println("삭제완료 삭제정보" +mem); //삭제 완료 삭제정보
			service.printAll(); //삭제되었으므로 1명만 출력(정상흐름일떄는)
		}catch(MemberNotFoundException me){
			System.out.println(me.getMessage()); //018 tel 에 해당하는 구성원 정보가 없어서 삭제불가
		}
	}
	
}
