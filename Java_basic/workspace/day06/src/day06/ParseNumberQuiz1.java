package day06;

import java.util.Scanner;

public class ParseNumberQuiz1 {
	public static void main(String[] args) {
		
		/*
		 * String형 변수 s1, s2를 선언해주세요.
		 * double형 변수 n1, n2를 선언해주세요.
		 * 
		 * Scanner를 이용해서 s1, s2에
		 * 문자열을 입력받고
		 * 
		 * 입력받은 문자열을 실수로 변환해서 n1, n2에 저장해주세요.
		 * 
		 * 저장한 n1, n2는
		 * System.out.println()을 이용해 합을 구해주세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 실수로 입력해주세요 : ");
		String s1 = sc.nextLine();
		System.out.println("첫 번째 숫자를 실수로 입력해주세요 : ");
		String s2 = sc.nextLine();
		
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		
		System.out.println("두 수의 합 : " + (n1 + n2));
		
		sc.close();
	}
}
