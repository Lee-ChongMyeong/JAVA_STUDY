package day04;

public class ArrayQuiz1 {

	public static void main(String[] args) {
		/*
		 *  배열 생성을 직접 해 주세요.
		 *  배열 arr1과 arr2를 만들어 주시되
		 *  arr1은 선언, 생성, 초기화를 분리해주세요
		 *  arr2는 선언, 생성, 초기화를 한줄로 처리해주세요.
		 *  
		 *  arr1, arr2의 자료형은 double입니다.
		 *  arr2는 한 줄로 처리할 때 1.1 2.2 3.3 4.4 5.5
		 *  순으로 5개의 자료를 넣어주시고
		 *  
		 *  arr1은 직접 자료를 몇개 넣을지 결정해주세요.
		 *  arr1은 arr1.length를 통해 요소 갯수를 측정해주세요.
		 *  arr2는 내부요소를 하나씩 System.out.println으로 
		 *  어떤 요소가 저장되어 있는지 콘솔창에 출력해주세요.
		 */
		
		double arr1 [];
		arr1 = new double [4];
		arr1[0] = 1.1;
		arr1[1] = 2.2;
		arr1[2] = 3.3;
		arr1[3] = 4.4;
		
		double arr2 [] = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		System.out.println("arr1의 요소 갯수 " + arr1.length);
		System.out.println();
		
		System.out.println("arr2의 요소 : " + arr2[0]);
		System.out.println("arr2의 요소 : " + arr2[1]);
		System.out.println("arr2의 요소 : " + arr2[2]);
		System.out.println("arr2의 요소 : " + arr2[3]);
		System.out.println("arr2의 요소 : " + arr2[4]);
		
	}
}
