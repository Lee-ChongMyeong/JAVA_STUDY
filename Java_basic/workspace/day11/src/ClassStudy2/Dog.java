package ClassStudy2;

public class Dog {
	
	public String name;
	public int age;
	public String clothes;
	
	public Dog(String dname, int dage, String dclothes) {	// ������
		name = dname;
		age = dage;
		clothes = dclothes;
	};
	
	
	public void showDogInfo() {
		System.out.println("�������� �̸� : " + name);
		System.out.println("�������� ���� : " + age);
		System.out.println("�������� �� : " + clothes);
	}
	
	public void BowWow() {
		System.out.println("�۸�!! �۸�!!");
	}
	
	
}
