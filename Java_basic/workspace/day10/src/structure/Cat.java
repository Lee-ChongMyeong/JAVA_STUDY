package structure;

public class Cat {
	
	/*
	 * Cat 구조체를 만들어보겠습니다.
	 * 
	 * Cat 구조체는 내부 정보로
	 * 고양이의 이름(public String name)
	 * 고양이의 품종(public String race)
	 * 고양이의 나이(public int age)
	 * 를 가지게 만들어주세요.
	 * 
	 * 그리고 실제로 UsingPerson1.java의 메인 메서드 내부에서
	 * 고양이를 두 마리 생성해보세요.
	 * 두 마리의 고양이의 변수명, 이름, 품종, 나이는 자유롭게 설정해주세요.
	 * 
	 */
	
	public String name;
	public String race;
	public int age;
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("품종 : " + race);
		System.out.println("나이 : " + age);
	}
	
}
