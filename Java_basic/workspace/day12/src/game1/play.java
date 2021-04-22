package game1;

import ClassStudy2.*;
//import ClassStudy2.Dog;
//import ClassStudy2.Cat;

public class play {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("¶¯Ä¥ÀÌ", 12, "‹¯‹¯ÀÌ¿Ê");
		dog1.BowWow();
		dog1.showDogInfo();
		
		Cat cat1; 
		
		Magician m1 = new Magician("¾ÆÄí¾Æ¸Ç");
		
		m1.Attack();
		m1.ShowStat();
		m1.Fireball();
		m1.ShowStat();
		m1.Meditation();
		m1.ShowStat();
		
//		m1.name = "Æ®·³ÇÁ";
//		m1.level = 99;
//		m1.attack = 1000;
//		m1.hp = 30000;
//		m1.mp = 50000;
//		
//		m1.Attack();
//		m1.ShowStat();
//		m1.Fireball();
//		m1.ShowStat();
//		m1.Meditation();
//		m1.ShowStat();
		
	}
}
