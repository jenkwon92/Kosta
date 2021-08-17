package step5;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue: FIFO (First In, First Out)
 * Stack : LIFO (Last In, First Out)
 */
public class TestQueue {
	public static void main(String[] args) {
		Queue <String> queue = new LinkedList<String>();
		queue.add("�������� �ȳ�");
		queue.add("����?");
		queue.add("������?");
		queue.add("�����");
		//queue�� FIFO (���Լ���)
		//System.out.println(queue.poll());
		//System.out.println(queue);
		// while loop, isEmpty(), poll() �̿��� ��� ��Ҹ� ����
		while(queue.isEmpty() == false) { //��� ���� ���� ����
			System.out.println(queue.poll()); //FIFO�� ����ȴ�
		}
		System.out.println(queue);
	}
}
