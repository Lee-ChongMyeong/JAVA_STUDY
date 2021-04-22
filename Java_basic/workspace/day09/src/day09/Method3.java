package day09;

import java.util.Scanner;

public class Method3 {
	
	
	public static double CmtoFt() {
		double ft = 30.48;
		return ft;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("당신의 키를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("당신의 키를 피트로 환산한 결과는");
		System.out.println(height / CmtoFt() + "ft 입니다.");
		
		sc.close();
	}
}
