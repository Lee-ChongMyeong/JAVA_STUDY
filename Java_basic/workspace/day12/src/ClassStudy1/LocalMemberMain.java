package ClassStudy1;

public class LocalMemberMain {

	public static void main(String[] args) {
		
		LocalMember lm = new LocalMember();
		lm.Member = "멤버변수입니다.";
		// lm.Local = "값을 바꾼 지역변수입니다.";
		lm.showLocalMember();

	}

}
