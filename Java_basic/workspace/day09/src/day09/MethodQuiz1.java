package day09;

public class MethodQuiz1 {
	
	public static int Plus(int a, int b, int c){
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		/*
		 * main 메서드 이외에 다른 메서드를 하나 더 작성해보겠습니다.
		 * 
		 * public static을 사용하고 int 형 자료를 return 합니다.
		 * 
		 * 메서드 이름은 Plus로 하겠습니다.
		 * 
		 * 이 메서드는 (int a, int b, int c)를 입력받고
		 * 
		 * a + b + c를 리턴합니다.
		 * 
		 * main에서도 내부에서 Plus를 호출하는 부분까지 함께 작성해보세요.
		 * 
		 * 
		 */
		int result = Plus(3,6,8);
		System.out.println(result);
		
		result = Plus(10,20,30);
		System.out.println(result);
		
		
		
	}
}
