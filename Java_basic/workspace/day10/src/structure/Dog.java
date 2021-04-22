package structure;

public class Dog {

	/*문제1.
	 * Dog를 생성해보세요.
	 * 
	 * 강아지는 String name, String home(집주소)를 속성으로 가집니다.
	 * 이외에 여러분들이 생각했을 떄 강아지의 속성으로 필요한것을 하나 변수로 만드세요.
	 * 
	 * 그리고 Dog 내부에 showDogInfo()라는 Dog 관련 정보를
	 * 콘솔창에 출력하는 메서드를 만들어주세요.
	 */
	
	public String name;
	public String home;
	public int age;
	
	public void showDogInfo() {
		System.out.println("이름 : " + name);
		System.out.println("집 : " + home);
		System.out.println("나이 : " + age);
	}
	
	
	
}
