package day07;

import java.util.Scanner;

public class ForQuiz4 {
	public static void main(String[] args) {
		
		
		/*
		 * 문제4)
		 * 별찍기를 하겠습니다.
		 * 
		 * 반복문을 이용해서 ****** 를 콘솔창에 출력해주세요.
		 * 
		 * 반복문의 반복횟수는 5회 입니다.
		 * 
		 * 개선1)
		 * 5번이 아니라 사용자가 입력한 횟수만큼 출력하게 바꿔주세요.
		 * 
		 * 개선2)
		 * x * x 형 정사각형을 화면에 출력하도록 만들어주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 반복하겠습니까?");
		int num = sc.nextInt();
		
		for(int i =0; i<num; i++) {
			for(int y = 0; y<num; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
