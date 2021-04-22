package day09;

import java.util.Scanner;

public class MethodQuiz4 {
	
	/*문제4.
	 * BMI 지수를 구하는 문제입니다.
	 * 
	 * BMI 지수를 구하는 공식은 (체중 / 신장(m) * 신장(m)) 입니다.
	 * 
	 * 신장(m)의 의미는 175cm -> 1.75m로 변환해야 한다는 의미입니다.
	 * 
	 * public static인 메서드 BMI를 만들어주세요. 입력자료는 없습니다.
	 * 
	 * 대신 메서드 내부에서 스캐너를 이용해서
	 * 체중인 double weight, 신장인 double height 초기화 시킵니다.
	 * 
	 * 그 다음 위의 공식을 이용해서 double result 변수에 결과값을 저장한 다음
	 * return result를 통해 리턴해주시면 됩니다.
	 */
	
	
	public static double BMI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("신장을 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("체중을 입력하세요(kg) : ");
		double weight = sc.nextDouble();
	
		double result = weight / ((height * 0.01)  * (height  * 0.01));	
		return result;
	}
	
	public static void main(String[] args) {
	
		double yourBmi = BMI();
		//System.out.println("당신의 BMI지수는 " + yourBmi + "입니다.");
		System.out.format("당신의 BMI지수는 %.2f 입니다. %n",  yourBmi);
	
	}
}
