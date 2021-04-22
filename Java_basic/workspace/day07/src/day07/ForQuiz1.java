package day07;

import java.util.Scanner;

public class ForQuiz1 {
	public static void main(String[] args) {
		/*
		 * 
		 * 문제1.
		 * 스캐너를 이용해서 int 변수 하나를 설정받으세요.
		 * 
		 * 그리고 설정받은 변수 횟수만큼
		 * 
		 * "Hello World" 라는 문장을 실행하도록
		 * 
		 * for 문을 작성해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("반복횟수 만큼 숫자를 입력하세요 :");
		num = sc.nextInt();
		
		for(int i= num; i > 0; i--) {
			System.out.println("Hello world" + i);
		}
		
		sc.close();
		
	}
}
