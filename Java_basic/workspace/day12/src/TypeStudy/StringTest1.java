package TypeStudy;

public class StringTest1 {

	public static void main(String[] args) {
		
		// 스택에서 받아올수 있는 것 : 안내판 
		// 실제문자열은 힙에 저장
		
		String str1 = "Hello";
		String str2 = "Hello";
		//String str2 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);	// 문자를 비교하는것이 아니라, 안내판(100번지)을 비교하는 것임.
		
		String str3 = new String("Hello");	// 객체 생성, new로 만든것은 우리가 삭제 못함. 안내판(300번지)
		String str4 = new String("Hello");  // 안내판(400번지)
		
		System.out.println(str3);			
		System.out.println(str4);
		System.out.println(str3 == str4);	// 안내판 끼리 비교함

		
		System.out.println("============================");
		System.out.println("equals() 사용");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));	// 안내판은 다름. 
		System.out.println(str1.equals(str4));	
		System.out.println(str3.equals(str4));
		
	}

}
