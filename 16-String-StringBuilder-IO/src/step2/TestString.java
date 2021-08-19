package step2;

public class TestString {
	public static void main(String[] args) {
		String name="아이유";
		System.out.println(name.concat("님"));
		System.out.println(name.contains("이"));
		System.out.println(name.contains("어"));
		System.out.println(name.indexOf("유")); //2  index반환
		System.out.println(name.indexOf("ㅋ"));  //존재하지않으면 index는 -1을 반환
		System.out.println(name.startsWith("아이")); //아이로 시작하면 true로 반환
		System.out.println(name.endsWith("이유"));
		String info="잘하고있다";
		System.out.println(info.substring(2));//2 beginIndex
		System.out.println(info.substring(2,4)); //beginIndex부터 endIndex 앞까지
		String id ="javaking ";
		System.out.println(id.length());
		System.out.println(id.trim()); //양 옆 여백을 제거
		System.out.println(id.trim().length()); //양 옆 여백을 제거 후 length 확인
		String nick="코코오빠";
		System.out.println(nick.replace("오", "아"));
		String fileName ="org.web.t.java";
		System.out.println(fileName.lastIndexOf(".")); //마지막 문자열의index를 반환
		int i = fileName.lastIndexOf(".");
		System.out.println(fileName.substring(i+1)); //파일의 확장자를 구한다
		System.out.println(fileName.replace(".java", "")); //.java 를 제외한 문자열 생성
	} 
}
