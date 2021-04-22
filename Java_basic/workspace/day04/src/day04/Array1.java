package day04;

public class Array1 {

	public static void main(String[] args) {
		int[] arr;	// int arr[];
		// 배열의 선언, arr라는 이름에 int 자료를 여러 개 담겠음.
		
		arr = new int[5];
		// 배열의 생성, arr라는 이름에 int 5개를 담겠음.
		
		// 위 문법은 아래와 같이 한 줄로 표현 가능(선언 및 생성) 
		// int[] arr = new int [5];
		
		arr[0] = 1; arr[1] = 2; arr[2] = 3;
		arr[3] = 4; arr[4] = 5;
		// 배열 내부에 자료 저장, 순번은 0번부터 시작
		
		System.out.println("arr내부의 첫 번째 요소 : " + arr[0] );
		System.out.println("arr내부의 첫 번째 요소 : " + arr[1] );
		System.out.println("arr내부의 첫 번째 요소 : " + arr[2] );
		System.out.println("arr내부의 첫 번째 요소 : " + arr[3] );
		System.out.println("arr내부의 첫 번째 요소 : " + arr[4] );
		// 자료 출력도 저장과 다르지 않음.
		

	}

}
