package structure;

public class Dog {

	/*����1.
	 * Dog�� �����غ�����.
	 * 
	 * �������� String name, String home(���ּ�)�� �Ӽ����� �����ϴ�.
	 * �̿ܿ� �����е��� �������� �� �������� �Ӽ����� �ʿ��Ѱ��� �ϳ� ������ ���弼��.
	 * 
	 * �׸��� Dog ���ο� showDogInfo()��� Dog ���� ������
	 * �ܼ�â�� ����ϴ� �޼��带 ������ּ���.
	 */
	
	public String name;
	public String home;
	public int age;
	
	public void showDogInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("�� : " + home);
		System.out.println("���� : " + age);
	}
	
	
	
}
