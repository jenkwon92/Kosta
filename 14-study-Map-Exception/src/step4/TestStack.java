package step4;

import java.util.Stack;

/**
 * Stack �ڷᱸ�� Ư¡ : Last In, First Out (LIFO)
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
		//������ ��� ����
		//System.out.println(stack.pop());
		//System.out.println(stack);
		//System.out.println(stack.pop());
		//System.out.println(stack.isEmpty()); //��������� true, ��Ұ� ������ false
		// while ���� �̿��ؼ� stack �� ��Ҹ� ��� ���
		
		while(stack.isEmpty()== false)  // �Ǵ�while(!stack.isEmpty()){}
			System.out.println(stack.pop());
		System.out.println(stack); //����Ÿ ���������Ƿ� ������� []
		
	}
}
