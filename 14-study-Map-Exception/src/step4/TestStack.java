package step4;

import java.util.Stack;

/**
 * Stack 자료구조 특징 : Last In, First Out (LIFO)
 * 
 * @author KOSTA
 *
 */
public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		//System.out.println(stack);
		//마지막 요소 추출
		//System.out.println(stack.pop());
		//System.out.println(stack);
		//System.out.println(stack.pop());
		//System.out.println(stack.isEmpty()); //비어있으면 true, 요소가 있으면 false
		// while 문을 이용해서 stack 의 요소를 모두 출력
		
		while(stack.isEmpty()== false)  // 또는while(!stack.isEmpty()){}
			System.out.println(stack.pop());
		System.out.println(stack); //전부타 추출했으므로 비어있음 []
		
	}
}
