package structure;

public class UsingPerson1 {
	/*
	 *  ��ü�� Ŭ����
	 *  
	 *  �ڹٿ��� Ŭ������ ��ü�� ����� ���� Ʋ�Դϴ�.
	 *  Ŭ������ ������ ��ü�� �Ӽ��̰�, Ŭ������ �޼���� ��ü�� ����Դϴ�.
	 * 
	 *  ��ü ���� new
	 *  Ŭ������ ������ = new Ŭ����();
	 */
	
	public static void main(String[] args) {
		Person person1 = new Person();
		// �ڷ���   ������ 	
		person1.name = "ä����";
		person1.phoneNum = "010-1234-5678";
		person1.age = 25;
		
		Person person2 = new Person();
		
		person2.name = "�߰���";
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
		
		cat1.name ="���ʵ�";
		cat1.race ="������";
		cat1.age = 27;
		
		Cat cat2 = new Cat();
		
		cat2.name ="��";
		cat2.race ="�������";
		cat2.age = 15;
		
		System.out.println();
		
		cat1.show();
		cat2.show();
		
		System.out.println();
		
		Dog dog1 = new Dog();
		dog1.name = "������";
		dog1.home = "��õ";
		dog1.age = 13;
		dog1.showDogInfo();
		
		
		
		
	}
}
