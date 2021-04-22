package day05;

import java.util.Scanner;

public class IfBasicQuiz1 {
	public static void main(String[] args) {
		
		/*
		 *  Pass / Fail 채점 프로그램을 만들어주세요.
		 *  
		 *  double score; 를 선언한 다음 스캐너로 점수를
		 *  입력받아 보세요.
		 *  
		 *  입력받은 점수가 60.0 이상이면 if 블럭을 이용해서
		 *  "당신의 점수는 x점입니다. 시험에 통과하셨습니다."
		 *  라고 출력하시고
		 *  
		 *  입력받은 점수가 60.0 미만이면 else 블럭을 이용해서
		 *  "당신의 점수는 x점입니다. 다음 시험에 응시해주세요."
		 *  라고 출력해주시면 됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		double score = scan.nextDouble();
		
		
		
		if (score >= 60.0) {
			System.out.println("당신의 점수는" + score + "점입니다. 시험에 통과하셨습니다.");
		}else {
			System.out.println("당신의 점수는" + score + "점입니다. 다음 시험에 응시해주세요.");
		}
		
		scan.close();
	}
}
