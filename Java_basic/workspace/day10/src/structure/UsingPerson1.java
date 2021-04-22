package structure;

public class UsingPerson1 {
	/*
	 *  객체와 클래스
	 *  
	 *  자바에서 클래스는 객체를 만들기 위한 틀입니다.
	 *  클래스의 변수는 객체의 속성이고, 클래스의 메서드는 객체의 기능입니다.
	 * 
	 *  객체 생성 new
	 *  클래스명 변수명 = new 클래스();
	 */
	
	public static void main(String[] args) {
		Person person1 = new Person();
		// 자료형   변수명 	
		person1.name = "채종훈";
		person1.phoneNum = "010-1234-5678";
		person1.age = 25;
		
		Person person2 = new Person();
		
		person2.name = "닭강정";
		person2.phoneNum = "010-2345-6789";
		person2.age = 7;
		
		person1.show();
		person2.show();
		person1.buyliquor();
		person2.buyliquor();
		
		System.out.println();
		
		person1.age += 1;
		person2.age += 1;
		
		person1.show();
		person2.show();
		
		Cat cat1 = new Cat();
		
		cat1.name ="가필드";
		cat1.race ="들고양이";
		cat1.age = 27;
		
		Cat cat2 = new Cat();
		
		cat2.name ="톰";
		cat2.race ="집고양이";
		cat2.age = 15;
		
		System.out.println();
		
		cat1.show();
		cat2.show();
		
		System.out.println();
		
		Dog dog1 = new Dog();
		dog1.name = "강아지";
		dog1.home = "인천";
		dog1.age = 13;
		dog1.showDogInfo();
		
		
		
		
	}
}
