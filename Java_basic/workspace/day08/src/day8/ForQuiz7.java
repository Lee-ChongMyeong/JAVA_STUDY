package day8;

public class ForQuiz7 {
	public static void main(String[] args) {
		
		/*
		 * 문제7
		 * 
		 * 다음과 같은 패턴의 별을 찍어보세요.
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****	
		 * 
		 * 중첩 반복문을 사용합니다.
		 * 
		 */
		
		for (int i =0; i < 5; i++) {
			for (int y=0; y < 5 - i; y++) {
				System.out.print(" ");
			}
			for (int j =0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
