package day05;

import java.util.Scanner;

public class SwitchCaseQuiz1 {
	public static void main(String[] args) {
		
		/*
		 * Switch~case 문을 활용한 계산기를 만들겠습니다.
		 * int num1, num2; 를 선언해주세요
		 * num1 과 num2 는 모두 스캐너를 이용해 정수를 입력받습니다.
		 * 
		 * int option; 을 선언해주세요.
		 * option 정수도 스캐너를 이용해 정수를 입력받습니다.
		 * 정수를 입력받기 전에 1은 +, 2는 -, 3은 *, 4는 /, 5는 %
		 * 연산을 하게 된다는 사실을 
		 * System.out.println()을 이용해 알려주세요.
		 * 
		 * 다음 switch~case문을 작성해주시되
		 * switch구문의 변수는 option을 넣어주세요.
		 * 
		 * 다음 case별로 option이 1이면
		 * System.out.println()으로 num1 + num2를
		 * option이 2이면
		 * System.out.println()으로 num1 - num2를
		 * option이 3이면
		 * System.out.println()으로 num1 * num2를
		 * option이 4이면
		 * System.out.println()으로 num1 / num2를 
		 * option이 5이면
		 * System.out.println()으로 num1 % num2를 출력해주세요
		 * option이 범위 이외의 숫자라면
		 * System.out.println()으로 "범위 이외의 옵션입니다."
		 * 를 출력해주세요
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("실행 옵션을 선택해주세요.");
		System.out.println("1은 +, 2는 -, 3은 *, 4는 /, 5는 %");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("두 수의 합 : " + (num1 + num2));
			break;
		case 2:
			System.out.println("두 수의 차 : " + (num1 - num2));
			break;
		case 3:
			System.out.println("두 수의 곱 : " + (num1 * num2));
			break;	
		case 4:
			System.out.println("두 수의 나누기 : " + (num1 / num2));
			break;	
		case 5:
			System.out.println("두 수의 나머지 : " + (num1 % num2));
			break;
		default:
			System.out.println("범위 이외의 옵션입니다. ");
			break;
			
		}
		sc.close();
	}
}
