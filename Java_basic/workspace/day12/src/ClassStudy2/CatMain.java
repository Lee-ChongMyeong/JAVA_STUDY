package ClassStudy2;

public class CatMain {
	public static void main(String[] args) {
		
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.name ="�߿���";
//		cat1.age = 23;
//		cat1.catFood = "����";
//		
//		cat2.name = "����";
//		cat2.age = 13;
//		cat2.catFood = "����";
//		
//		cat1.ShowCatInfo();
//		cat1.EatFood();
//		cat1.CatMeow();
//		System.out.println();
//		cat2.ShowCatInfo();
//		cat2.EatFood();
//		cat2.CatMeow();
		
		
		Dog dog1 = new Dog("��ĥ��", 12, "�����̿�");
		//Dog dog1 = new Dog(); //Error
		
		dog1.showDogInfo();
		dog1.BowWow();
		

		System.out.println();
		
		Cat cat1 = new Cat("�����", 13, "����");
		
		cat1.ShowCatInfo();
		cat1.EatFood();
		cat1.CatMeow();
		
		
	}
	
}
