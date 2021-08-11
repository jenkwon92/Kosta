package step1;

class Fish{
	int count;
	static int sCount;
	Fish(){
		count++;
		sCount++;
	}
}
public class TestStatic3 {
	public static void main(String[] args) {
		Fish f1=new Fish();
		System.out.println(f1.count);//1
		System.out.println(Fish.sCount);//1
		Fish f2=new Fish();
		System.out.println(f2.count);//1
		System.out.println(Fish.sCount);//2
		Fish f3=new Fish();
		System.out.println(f3.count);//1  ������ ��ü ������ heap������ ������ ��ü �����Ǿ� count�� �Ź� ���Ӱ� 0->1 �� �޸𸮿� ���� 
		System.out.println(Fish.sCount);//3 ������ class loading�ÿ� �� �ѹ� meta space ������ static sCount�� �޸𸮰� ����ǰ� ���� ������Ʈ��
	}
}
