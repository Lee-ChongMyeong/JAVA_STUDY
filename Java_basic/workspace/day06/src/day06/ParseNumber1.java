package day06;

import java.util.Scanner;

public class ParseNumber1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자로 구성된 문자열을 입력해주세요.");
		String s1 = scan.nextLine();
		
		int n1 = Integer.parseInt(s1);
		System.out.println("입력한 문자열은 숫자 : " + n1);
		
		scan.close();
		
		
	}
}
