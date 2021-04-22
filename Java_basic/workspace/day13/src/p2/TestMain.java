package p2;

import p1.PublicTest;

public class TestMain {
	
	public static void main(String[] args) {
		
		PublicTest p1 = new PublicTest();	// PublicTest 객체, 생성자 호출(생성자는 public 에 있음)

// 		Error
//		System.out.println(p1.a);
//		System.out.println(p1.b);
		
//		p1.a = "퍼블릭은 아무데서나 접근 가능";
//		p1.b = 50;
//		System.out.println(p1.a);
//		System.out.println(p1.b);
	
		
		p1.Geta();
		p1.Getb();
		p1.Seta();
		p1.Setb();
		
		p1.Geta();
		p1.Getb();
		
	}
}
