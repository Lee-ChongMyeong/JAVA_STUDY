package day11;

public class Static1 {

	public static int num1;	// static ���� : �ܺ��� ��, ������ ������ �����. �Ȼ����.
							// static �� static ���� ����� �� �ִ�.
	
	public static void stest() {
		num1 += 1;
		int num2 = 0;
		num2 += 1;
		System.out.println(num1 + "��" + num2);
	}
	
	
	public static void main(String[] args) {
		stest();
		stest();
		stest();
	}
}
