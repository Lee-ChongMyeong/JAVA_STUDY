package p1;

import java.util.Scanner;

public class PublicTest {
//	public String a;
//	public int b;
	
	private String a;	// 주방 내부에 있는 자원
	private int b;
	
	
	public PublicTest() {	// 생성자 : 홀 
		a = "퍼블릭 접근 제한자.";
		b = 10;
	}
	
	public void Geta() {	// Getter : 외부에서 Private 직접 조회 가능. Getter 한테 요청해서 정보를 보게 됨
		System.out.println(a);
	}
	
	public void Getb() {
		System.out.println(b);
	}
	
	public void Seta() {	// Setter : 값을 Private 변수에 집어 넣음. 내가 정한 범위내에서만 제약을 걸어서 넣을 수 있음.
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();
	}
	
	public void Setb() {
		Scanner scan2 = new Scanner(System.in);
		int c;
		c = scan2.nextInt();
		if (c > 100 ) {
			System.out.println("100보다 큰 값은 넣을 수 없습니다.");
			return;	// void 일 때 쓰면, 중간에 종료를 시킴 == break문처럼 되는 것임
		}
		b = c;
		scan2.close();
	 
	}
}
