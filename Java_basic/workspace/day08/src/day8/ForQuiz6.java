package day8;

public class ForQuiz6 {
	public static void main(String[] args) {
		/*
		 * 문제6.
		 * 
		 * 문제 5와 같은 유형이지만
		 * 별의 패턴이
		 * 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 * 인 중첩 반복문을 작성해주세요.
		 */
		
		for (int i =0; i < 5; i++) {
			for (int y=0; y < 5 - i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
