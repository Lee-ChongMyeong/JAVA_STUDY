package Inheritance;

public class Magician extends Job {
	
	public void Fireball() {
		System.out.println("당신은 화염구를 날렸습니다.");
// 		System.out.println("당신은" + attack * 3 + "의 데미지를 입혔다.");	 	//Error
		System.out.println("당신은" + getAttack() * 3 + "의 데미지를 입혔다.");
		System.out.println("당신은 마나를 5소모했다.");
		SetMp(-5);
		
	}
	
}
