package ClassStudy2;

public class Cat {
	/*
	 * �� �� ��üȭ�� ����̸� �����ڽ��ϴ�.
	 * 
	 * ���� Cat�� ������ �ϴ� �Ӽ�(����)
	 * String name, int age, String catFood
	 * 
	 * Cat�� �ൿ(�޼���)
	 * name�� age�� ���� ������ �ܼ�â�� ����ּ���(ShowCatInfo)
	 * 
	 * System.out.println(catFood + "�� �Խ��ϴ�."); �� ����ϴ�
	 * EatFood()�� �ۼ����ּ���.
	 * 
	 * System.out.println("�߿� �߿�"); �� ����ϴ�
	 * CatMeow()�� �ۼ����ּ���.
	 * 
	 */
	
	public String name;
	public int age;
	public String catFood;
	
	public Cat(String cname, int cage, String ccatFood) {
		
		name = cname;
		age = cage;
		catFood = ccatFood;
		
	}
	
	public void ShowCatInfo() {
		System.out.println("������� �̸��� : " + name + ", ���̴� : " + age);
	}
	
	public void EatFood() {
		System.out.println(catFood + "�� �Խ��ϴ�.");
	}
	
	public void CatMeow() {
		System.out.println("�߿˾߿�");
	}
	
}
