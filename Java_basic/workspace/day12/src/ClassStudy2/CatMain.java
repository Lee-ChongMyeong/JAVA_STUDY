package ClassStudy2;

public class CatMain {
	public static void main(String[] args) {
		
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.name ="야옹이";
//		cat1.age = 23;
//		cat1.catFood = "생선";
//		
//		cat2.name = "제리";
//		cat2.age = 13;
//		cat2.catFood = "우유";
//		
//		cat1.ShowCatInfo();
//		cat1.EatFood();
//		cat1.CatMeow();
//		System.out.println();
//		cat2.ShowCatInfo();
//		cat2.EatFood();
//		cat2.CatMeow();
		
		
		Dog dog1 = new Dog("땡칠이", 12, "점박이옷");
		//Dog dog1 = new Dog(); //Error
		
		dog1.showDogInfo();
		dog1.BowWow();
		

		System.out.println();
		
		Cat cat1 = new Cat("고양이", 13, "생선");
		
		cat1.ShowCatInfo();
		cat1.EatFood();
		cat1.CatMeow();
		
		
	}
	
}
