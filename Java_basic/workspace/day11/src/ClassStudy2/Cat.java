package ClassStudy2;

public class Cat {
	/*
	 * 좀 더 구체화된 고양이를 만들어보겠습니다.
	 * 
	 * 먼저 Cat이 가져야 하는 속성(변수)
	 * String name, int age, String catFood
	 * 
	 * Cat의 행동(메서드)
	 * name과 age에 대한 정보를 콘솔창에 찍어주세요(ShowCatInfo)
	 * 
	 * System.out.println(catFood + "를 먹습니다."); 를 출력하는
	 * EatFood()를 작성해주세요.
	 * 
	 * System.out.println("야옹 야옹"); 을 출력하는
	 * CatMeow()를 작성해주세요.
	 * 
	 */
	
	public String name;
	public int age;
	public String catFood;
	
	public Cat(String cname, int cage, String ccatFood) {
		
		name = cname;
		age = cage;
		catFood = ccatFood;
		
	}
	
	public void ShowCatInfo() {
		System.out.println("고양이의 이름은 : " + name + ", 나이는 : " + age);
	}
	
	public void EatFood() {
		System.out.println(catFood + "를 먹습니다.");
	}
	
	public void CatMeow() {
		System.out.println("야옹야옹");
	}
	
}
