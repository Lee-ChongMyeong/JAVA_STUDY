package TypeStudy;

import java.util.Scanner;

public class LoginMain {

	/*
	 * 문제
	 * 
	 * 로그인을 구현해보도록 하겠습니다.
	 * 
	 * 먼저 Scanner를 사용해서 String id에는 아이디를,
	 * String pw에는 비밀번호를 입력받습니다.
	 * 
	 * if-else문의 조건식을 활용해서 입력받은 id와 pw를
	 * .equals("아이디 혹은 비밀번호")로 비교해주시고
	 * 비교결과가 둘 다 true 인 경우는
	 * "로그인에 성공하였습니다."
	 * 둘 중 하나가 false라면
	 * "로그인에 실패했습니다." 라는 문구를 콘솔창에 띄워주세요.
	 * 접속용 아이디는 kgitbank 비밀번호는 password로 해주세요.
	 * 
	 */
	
	public static void main(String[] args) {
		
		String id;
		String pw;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("접속 아이디를 입력해주세요");
		id = sc.nextLine();
		System.out.println("접속 비밀번호를 입력해주세요");
		pw = sc.nextLine();
		
		if (id.equals("kgitbank") && pw.equals("password")) {
			System.out.println("로그인에 성공하였습니다.");
		}else {
			System.out.println("로그인에 실패하였습니다.");
		}
		
		sc.close();
		
		
	}

}
