package day8;

import java.util.Scanner;

public class ForQuiz9 {
	public static void main(String[] args) {
		/*
		 * 아까 8번문제에서 짰던 double 관련 코드를
		 * 향상된 for문 문법을 이용해서 출력하도록 고쳐보세요.
		 * 
		 * 입력은 기존 for문 방식으로 진행합니다.
		 */
		
		double arr[] = new double[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i < arr.length; i++) {
			System.out.println("숫자" + (i+1) + "를 입력하세요 : ");
			arr[i] = sc.nextDouble();
		}
		
		for (double a : arr) {
			System.out.println(a);
		}
		
		sc.close();
		
		
	}
}
