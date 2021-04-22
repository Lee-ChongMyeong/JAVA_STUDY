package day05;

import java.util.Scanner;

public class ifBasicQuiz2 {
	public static void main(String[] args) {
		
		/*
		 * 성적관리 프로그램 두 번째 입니다.
		 * double score; 변수에 스캐너를 이용해서 성적을 입력해주세요.
		 * 
		 * 입력받은 변수는 if~else if~else 구문으로 처리해야 하며
		 * 100점 이하 90점 이상은 "A입니다." 라는 문구를
		 * 90점 미만 80점 이상은 "B입니다." 라는 문구를
		 * 80점 미만 70점 이상은 "C입니다." 라는 문구를
		 * 70점 미만 60점 이상은 "D입니다." 라는 문구를
		 * 60점 미만은 "F입니다." 라는 문구를 콘솔창에 띄워주시면 됩니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		double score = sc.nextDouble();
		
		if (100>= score && score >= 90) {
			System.out.println("A입니다.");
		}else if (score <90 && score >= 80) {
			System.out.println("B입니다.");
		}else if (score <80 && score >= 70) {
			System.out.println("C입니다.");
		}else if (score <70 && score >= 60) {
			System.out.println("D입니다.");
		}else if (score > 100 || score < 0) {
			System.out.println("잘못된 범위의 값을 입력하셨습니다.");
		}else {
			System.out.println("F입니다.");
		}
		
		sc.close();
		
	
	}
}
