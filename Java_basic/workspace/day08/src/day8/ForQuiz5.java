package day8;

import java.util.Scanner;

public class ForQuiz5 {
	public static void main(String[] args) {
		
		/*
		 * 문제5
		 * 
		 * 중첩 반복문을 사용해서
		 * 아래와 같이 별을 찍어주세요.
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */

		for (int i =0; i < 5; i++) {
			for (int y=0; y <= i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
