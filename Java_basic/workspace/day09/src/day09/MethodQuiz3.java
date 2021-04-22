package day09;

import java.util.Scanner;

public class MethodQuiz3 {
	
	public static void CtoF(double celcius){
		
		double fahrenheit = (celcius * 1.8) + 32;
		System.out.println("오늘의 섭씨 온도는 : " + celcius);
		System.out.println("오늘의 화씨 온도는 : " + fahrenheit);
	}
	
	public static void main(String[] args) {
		/*문제3
		 * 
		 * 리턴 자료형이 void인 메서드 CtoF를 작성하겠습니다.
		 * 
		 * CtoF는 double celcius 를 입력받습니다.
		 * 
		 * 이 자료는 섭씨 온도를 의미합니다.
		 * 
		 * 섭씨온도를 입력했을 때 화씨온도로 변환해서 콘솔창에 출력하는 프로그램을
		 * 작성해주시면 됩닌다.
		 * 
		 * 화씨 -> 섭씨 변환 공식은 
		 * 섭씨온도 = (화씨온도 -32) / 1.8
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("섭씨 온도를 입력하세요 : ");
		double celcius = sc.nextDouble();
		CtoF(celcius);
		
				
		
		
		
		
		
	}
}
