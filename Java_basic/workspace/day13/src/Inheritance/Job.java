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
		System.out.println("당신은" + attack + "의 데미지를 입혔다!");
	}
	
	public void Medication() {
		System.out.println("당신은 명상을 통해 마나를 20 회복했다.");
		mp += 20;
	}
	
	public void ShowStatus() {
		System.out.println("체력 : " + hp + ", 마력 : " + mp + ", 레벨 : " + level + ", 공격력 : " + attack);
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void SetMp(int mp) {
		this.mp += (mp);
	}
	
	
	
}
