package day8;

public class Continue1 {
	public static void main(String[] args) {
		
		
		String arr[] = {"클레멘타인", "자전차왕 엄복동", "리얼"};
		
		for(String movie : arr) {
			if (movie == "자전차왕 엄복동") {
				continue;
			}
			System.out.println(movie);
		}
		
	}
}
