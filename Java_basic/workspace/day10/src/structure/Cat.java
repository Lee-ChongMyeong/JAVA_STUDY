package structure;

public class Cat {
	
	/*
	 * Cat ����ü�� �����ڽ��ϴ�.
	 * 
	 * Cat ����ü�� ���� ������
	 * ������� �̸�(public String name)
	 * ������� ǰ��(public String race)
	 * ������� ����(public int age)
	 * �� ������ ������ּ���.
	 * 
	 * �׸��� ������ UsingPerson1.java�� ���� �޼��� ���ο���
	 * ����̸� �� ���� �����غ�����.
	 * �� ������ ������� ������, �̸�, ǰ��, ���̴� �����Ӱ� �������ּ���.
	 * 
	 */
	
	public String name;
	public String race;
	public int age;
	
	public void show() {
		System.out.println("�̸� : " + name);
		System.out.println("ǰ�� : " + race);
		System.out.println("���� : " + age);
	}
	
}
