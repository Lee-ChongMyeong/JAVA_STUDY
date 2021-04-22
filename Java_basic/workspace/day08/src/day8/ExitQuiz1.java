package day8;

public class ExitQuiz1 {
	public static void main(String[] args) {
		
		/*
		 * 문제1.
		 * int arr[] = new int[100]; 을 이용해서
		 * 크기 100짜리 배열을 만들어주세요.
		 * 
		 * for문을 이용해서 arr[0] = 0, arr[1] = 10 .. 과 같이
		 * arr[99] = 990; 이 대입되도록 해주세요.
		 * 
		 * 그리고 출력할 때는 4의 배수를 제외한 나머지만을 출력되게 해 주시고
		 * 출력범위는 0~770 사이로 해 주세요.
		 */
		
		int arr[] = new int[100];
		
		for (int i =0; i < 100; i++) {
			arr[i] = i * 10;
		}
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] % 4 ==0 && arr[i] != 0) {
				continue;
			}
			if (arr[i] >= 770) {
				break;
			}
			System.out.println(arr[i]);
			
		}
		
		
		
	}
}
