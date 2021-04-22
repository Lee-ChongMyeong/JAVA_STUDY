package day06;

import java.util.Scanner;

public class DoWhileQuiz1 {
	public static void main(String[] args) {
		
		/*
		 * 여러분이 신용카드 프로그램을 만들었습니다.
		 * 이 신용카드는 전월실적이 50만원 이상이면 다음달에
		 * 혜택을 주고 그렇지 않으면 혜택을 끊어버립니다.
		 * 
		 * do~while문을 이용해서 혜택이 몇 달째에 끊어지는지
		 * 확인할 수 있는 프로그램을 만들어주세요.
		 * 
		 * 사용변수 - int output, month;
		 * 변수 output에 사용자가 스캐너를 이용해서
		 * 직접 값을 매번 입력하게 만들어줍니다.
		 * 
		 * month변수는 while문이 한 바퀴 돌때마다 1씩 증가합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int output = 0;
		int month = 0;
		
		do {
			month++;
			System.out.println("현재 개월 수 : " + month);
			System.out.println("전월 실적 : " + output + "만원");
			System.out.println("============================");
			System.out.println("이번달 실적을 입력해주세요.");
			output = sc.nextInt();
		}while(output >= 50);
		
		System.out.println("실적유지 마지막은 " + month + "개월째입니다.");
		System.out.println("실적" + output + "만원으로 계약해지 되었습니다.");
		
	}
}
