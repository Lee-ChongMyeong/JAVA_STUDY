package day07;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {		
		
		/*	
		 * 개선문제)
		 * Scanner를 이용해서 n을 입력받았을 때
		 * n의 배수에 해당하는 단 수만 출력하게 만들어보세요
		 * (*힌트 : % 연산자를 활용합니다.)
		 * 
		 * 
		 * ex) n에 3입력시 -> 3단, 6단, 9단 출력
		 * n에 4 입력시 -> 4단, 8단 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 배수로 출력하시겠어요? : ");
		int num = sc.nextInt();
		
		
		for (int i = num; i <= 9; i++) {
			if ( i % num == 0) {
				System.out.println(i + "단 출력을 시작합니다. ");
				for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + (i * j));
					}
				System.out.println(i + "단 출력을 마칩니다. ");
			}
			
		}
		sc.close();
		
		
	}
}
