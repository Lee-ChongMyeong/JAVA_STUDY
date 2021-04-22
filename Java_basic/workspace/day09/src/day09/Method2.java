package day09;

	

public class Method2 {
	
	public static void exchangeTHB(double won) {
		System.out.println("원화 금액 : " + won + "원");
		System.out.println("바트화 환산 : " + won/35.65 + "바트");
	}
	
	public static void exchangeEUR(double won) {
		System.out.println("원화 금액 : " + won + "원");
		System.out.println("유로화 환산 : " + won/1280.47 + "유로");
	}
	
	
	
	public static void main(String[] args) {
		exchangeTHB(400000);
		exchangeEUR(6000000);
		
	}
}
