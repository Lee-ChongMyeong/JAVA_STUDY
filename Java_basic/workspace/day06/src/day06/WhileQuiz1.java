package day06;

import java.util.Scanner;

public class WhileQuiz1 {
	public static void main(String[] args) {
		/*
		 * while문과 Scanner를 이용해서
		 * 원하는 횟수만큼
		 * 
		 * "Hello Java!" 라는 문장을 반복해서
		 * 출력하는 구문을 작성해보겠습니다.
		 * 
		 * Scannner를 이용해서 int자료를 입력받고
		 * 
		 * 그 횟수만큼 Hello Java! 라는 문장을
		 * 콘솔창에 출력하는 구문을 작성해주세요.
		 */
		
		int num, count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 횟수만큼 반복시킬 수를 입력하세요 : ");
		num = sc.nextInt();
		
		
		while(count < num) {
			System.out.println("Hello Java!");
			count++;
		}
		sc.close();
	}
}
