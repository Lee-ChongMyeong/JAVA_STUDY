package day07;

import java.util.Scanner;

public class ForQuiz2 {
	public static void main(String[] args) {
		/*
		 * 문제2)
		 * 스캐너를 이용해 정수를 하나 입력받으세요.
		 * 
		 * 입력받은 정수에 해당하는 구구단을 출력하는 코드를
		 * 
		 * 반복문을 이용해 작성해주세요.
		 * 
		 * 
		 * 개선문제)
		 * num 에 들어온 값이 2~9면 구구단 그대로 출력,
		 * 그러나 2미만 9초과면 범위에 맞는 숫자를 입력해주세요. 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 몇 단을 출력하시나요?");
		int num = sc.nextInt();
		
		if (num < 2 || num > 9) {
			System.out.println("범위에 맞는 숫자를 입력해주세요");
		}else {
			System.out.println(num + "단 출력을 합니다.");
			for (int i = 1; i <=9; i++) {
				System.out.println(num + "X" + i + "=" + (num * i));
			}
			
			System.out.println(num + "단 출력완료!!");
		}
		sc.close();
	}
}
