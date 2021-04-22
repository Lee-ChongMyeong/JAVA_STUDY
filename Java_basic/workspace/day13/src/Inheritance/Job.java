package Inheritance;

public class Job {
	private int level;
	private int hp;
	private int mp;
	private int attack;
	
	public Job() {
		level = 1;
		hp = 20;
		mp = 20;
		attack = 3;
	}
	
	public void Attack() {
		System.out.println("�����" + attack + "�� �������� ������!");
	}
	
	public void Medication() {
		System.out.println("����� ����� ���� ������ 20 ȸ���ߴ�.");
		mp += 20;
	}
	
	public void ShowStatus() {
		System.out.println("ü�� : " + hp + ", ���� : " + mp + ", ���� : " + level + ", ���ݷ� : " + attack);
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void SetMp(int mp) {
		this.mp += (mp);
	}
	
	
	
}
