package ClassStudy1;

public class LocalMember {
	// 멤버변수 : 클래스 안에 선언된 변수이다. 초기화를 하지 않아도 자동으로 각 데이터 타입의 기본값으로 자동 초기화 됩니다.
	// ex) int a;  -> 0으로 초기값이 설정됨
	
	// 지역변수 : 메서드 안에 선언된 변수이다. 지역변수는 메서드 블록 밖에서는 사용할 수 없습니다. 사용하기 전에 반드시 초기화를 해야합니다.
	
	public String Member;	// 멤버변수
	
	public void showLocalMember() {
		String Local;		// 지역변수
		Local = "지역변수 입니다.";
		System.out.println(Member);
		System.out.println(Local);
	}
}
