package game1;

public class Magician {
	/*
	 * 문제1.
	 * 마법사 클래스를 만들어보겠습니다.
	 * 
	 * 마법사는 String name, int level, int hp, int mp,
	 * int attack 속성을 가집니다.
	 * 
	 * 이 속성들은 전부 생성자를 이용해서 초기화 할 수 있습니다.
	 * 
	 * 행동으로는 메서드 Attack(), Fireball(), Meditation()
	 * ShowStat()을 가집니다.
	 * 
	 * Attack()은 일반공격으로 상대방에게 attack 멤버변수만큼 데미지를
	 * 입혔다는 문구를 System.out.println(); 으로 출력합니다.
	 * 
	 * Fireball()은 마나를 5 소모하며 attack*3 만큼의 데미지를 입혔다고
	 * System.out.println()으로 출력합니다.
	 * 
	 * Meditation()은 명상으로 마나를 20충전합니다.
	 * System.out.println()으로 당신은 명상을 통해 마나를 20 회복했다.
	 * 라는 문구가 출력됩니다.
	 * 
	 * ShowStat()은 현재 마법사의 상태를 보여줍니다. name, level, hp, 
	 * mp, attack 속성을 System.out.println() 으로 한 번에 출력해줍니다. 
	 * 
	 */
	
	private String name;
	private int level;
	private int hp;
	private int mp;
	private int attack;
	
	public Magician(String name) {
		this.name = name;
		// 생성자 내부에서 고정된 수치를 줄 수 있다.
		this.level = 1;
		this.hp = 20;
		this.mp = 20;
		this.attack = 3;
	}
	
	public void Attack() {
		System.out.println("당신은 상대방에게" + attack + "데미지를 가했다.");
		System.out.println("================================");
	}
	
	public void ShowStat() {
		System.out.println("당신의 아이디는 " + name + "입니다.");
		System.out.println("레벨은 " + level + "입니다.");
		System.out.println("공격력 : " + attack);
		System.out.println("체력 : " + hp + " 마력 : " + mp);
		System.out.println("================================");
	}
	
	public void Fireball() {
		System.out.println("당신은 파이어볼로 " + attack * 3 + "데미지를 가했다.");
		mp -= 5;
		System.out.println("================================");
	}
	
	public void Meditation() {
		System.out.println("당신은 명상을 통해 mp를 20회복했다");
		mp += 20;
		System.out.println("================================");
	}
	
	
	
	
	
	
	
	
	
}
