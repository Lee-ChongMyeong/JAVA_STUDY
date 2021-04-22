package ClassStudy2;

public class Dog {
	
	public String name;
	public int age;
	public String clothes;
	
	public Dog(String dname, int dage, String dclothes) {	// 생성자
		name = dname;
		age = dage;
		clothes = dclothes;
	};
	
	
	public void showDogInfo() {
		System.out.println("강아지의 이름 : " + name);
		System.out.println("강아지의 나이 : " + age);
		System.out.println("강아지의 옷 : " + clothes);
	}
	
	public void BowWow() {
		System.out.println("멍멍!! 멍멍!!");
	}
	
	
}
