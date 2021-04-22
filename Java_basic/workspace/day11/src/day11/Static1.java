package day11;

public class Static1 {

	public static int num1;	// static 변수 : 외부인 힙, 데이터 영역에 저장됨. 안사라짐.
							// static 은 static 끼리 통시할 수 있다.
	
	public static void stest() {
		num1 += 1;
		int num2 = 0;
		num2 += 1;
		System.out.println(num1 + "과" + num2);
	}
	
	
	public static void main(String[] args) {
		stest();
		stest();
		stest();
	}
}
