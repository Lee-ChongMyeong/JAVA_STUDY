package structure;

public class Person {
	
	
	/*
	 * 문제2.
	 * 
	 * 주류구매 메서드인 buyliquor() 를 작성해주세요.
	 * 
	 * 단, age가 19세 이상이면
	 * 
	 * System.out.println("주류를 구매했습니다.");
	 * 를 출력하고
	 * 
	 * 그 미만이면
	 * System.out.println("미성년자는 주류를 구매할 수 없습니다.");
	 * 가 출력되도록 메서드 내부에 if~else문을 작성해주세요.
	 */
	
	public String name;
	public String phoneNum;
	public int age;
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("전번 : " + phoneNum);
		System.out.println("나이 : " + age);
	}
	
	public void buyliquor() {
		if (age >= 19) {
			System.out.println(name + "이(가) 주류를 구매했습니다.");
		}else {
			System.out.println("미성년자는 주류를 구매할 수 없습니다.");
		}
	}
	
}

