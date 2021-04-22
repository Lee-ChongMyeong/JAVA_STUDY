package day07;

public class ForQuiz3 {
	public static void main(String[] args) {
		
		/*
		 * 문제3.
		 * 방정식 4x + 5y = 60이 있을때
		 * 
		 * x와 y의 자연수 해를 구해서 출력해보세요.
		 * 
		 * 힌트1. 중첩 for문을 사용합니다.
		 * 하나의 for문은 x의 해를 담당하고
		 * 하나의 for문은 y의 해를 담당합니다.
		 * 
		 * 힌트2.
		 * 중첩 for문 내부의 if문을 활용해서 해가 맞는지 아닌지 검증합니다.
		 */
		
		for(int x = 1; x < 20; x ++) {
			for(int y = 1; y < 20; y++) {
				if ((4 * x + 5 * y) == 60) {
					System.out.println("x의 해 : " + x);
					System.out.println("y의 해 : " + y);
					System.out.println("=======================");
				}
			}
		}
		
		
	}
}
