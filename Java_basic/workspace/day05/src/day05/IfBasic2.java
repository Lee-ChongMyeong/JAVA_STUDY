package day05;

public class IfBasic2 {

	public static void main(String[] args) {
	
		int a = 700;
		
		if (a < 10) {
			System.out.println("a는 10미만입니다.");
		}else if (a < 20) {
			System.out.println("a는 10이상 20미만입니다.");
		}else if (a < 30) {
			System.out.println("a는 20이상 30미만 입니다.");
		}else {
			System.out.println("a는 30이상입니다.");
		}
	}
	

}
