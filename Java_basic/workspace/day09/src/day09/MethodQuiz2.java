package day09;

public class MethodQuiz2 {
	
	public static double A(double num1, double num2){
		System.out.println("입력값 : " + num1 + " 과 " + num2);
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
		/*
		 * 문제2.
		 * 
		 * 이번에는 자료형 double을 리턴하는 메서드를 만들어보겠습니다.
		 * 
		 * 입력받는 것은 double num1, double num2 입니다.
		 * 
		 * return 값은 num1 + num2 입니다.
		 * 
		 * main 에서도 내부에서 직접 사용도 해 보세요.
		 */
		
		System.out.println(A(1.1, 2.2));
		// 실수는 2진수로 안떨어지는 경우가 많음. 근사값으로 가는 경우가 많다.
		// 3.300000000003 -> 2진수로 나타났을때 근사값 / 2진수로 딱 떨어지게 표현 불가능.
	}
}
