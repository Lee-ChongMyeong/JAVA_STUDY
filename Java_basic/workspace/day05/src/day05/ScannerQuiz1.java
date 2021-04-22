package day05;

import java.util.Scanner;

public class ScannerQuiz1 {

	public static void main(String[] args) {
		/*
		 *  Scanner를 이용해서 double 자료를 2개 입력받아주세요.
		 *  입력받을 변수는 double a, b; 로 선언해서 사용해주시면 됩니다.
		 *  
		 *  입력받은 a,b 변수를 더한 합을 System.out.println()을 이용해 출력해주세요.
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("실수 1을 입력하세요 : ");
		double a = scan.nextDouble();

		System.out.println("실수 2를 입력하세요 : ");
		double b = scan.nextDouble();
		
		System.out.println("입력한 실수 2개의 합 : " + (a + b));
		
		scan.close();
		// scan.close()를 하지 않으면, 컴퓨터가 느려짐.
		
	}

}
