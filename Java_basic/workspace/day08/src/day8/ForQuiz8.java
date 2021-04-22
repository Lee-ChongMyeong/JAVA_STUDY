package day8;

import java.util.Scanner;

public class ForQuiz8 {
	public static void main(String[] args) {
		
		/*
		 * 문제8.
		 * double[] arr = new double[4];
		 * 를 이용해서 double 배열 arr(길이4)를 만들어주세요.
		 * 
		 * 그 다음 for문과 arr.length를 이용해서
		 * double의 0번째 ~ 4번째 까지의 요소에
		 * 각각 실수 숫자를 입력받아보세요.
		 * 
		 * 입력을 다 받으면 for문을 이용해서
		 * 그 입력받은 숫자를 전체적으로 출력해보세요.
		 */
		
		double arr[] = new double[4];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i =0; i < arr.length; i++) {
			System.out.println("숫자" + (i+1) + "를 입력하세요 : ");
			arr[i] = sc.nextDouble();
			
		}
		
		for (int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		sc.close();
		
		
		
	}
}
