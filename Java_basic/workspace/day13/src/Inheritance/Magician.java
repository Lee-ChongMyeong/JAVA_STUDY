package Inheritance;

public class Magician extends Job {
	
	public void Fireball() {
		System.out.println("����� ȭ������ ���Ƚ��ϴ�.");
// 		System.out.println("�����" + attack * 3 + "�� �������� ������.");	 	//Error
		System.out.println("�����" + getAttack() * 3 + "�� �������� ������.");
		System.out.println("����� ������ 5�Ҹ��ߴ�.");
		SetMp(-5);
		
	}
	
}
