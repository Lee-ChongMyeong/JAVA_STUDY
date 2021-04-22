package game1;

public class Magician {
	/*
	 * ����1.
	 * ������ Ŭ������ �����ڽ��ϴ�.
	 * 
	 * ������� String name, int level, int hp, int mp,
	 * int attack �Ӽ��� �����ϴ�.
	 * 
	 * �� �Ӽ����� ���� �����ڸ� �̿��ؼ� �ʱ�ȭ �� �� �ֽ��ϴ�.
	 * 
	 * �ൿ���δ� �޼��� Attack(), Fireball(), Meditation()
	 * ShowStat()�� �����ϴ�.
	 * 
	 * Attack()�� �Ϲݰ������� ���濡�� attack ���������ŭ ��������
	 * �����ٴ� ������ System.out.println(); ���� ����մϴ�.
	 * 
	 * Fireball()�� ������ 5 �Ҹ��ϸ� attack*3 ��ŭ�� �������� �����ٰ�
	 * System.out.println()���� ����մϴ�.
	 * 
	 * Meditation()�� ������� ������ 20�����մϴ�.
	 * System.out.println()���� ����� ����� ���� ������ 20 ȸ���ߴ�.
	 * ��� ������ ��µ˴ϴ�.
	 * 
	 * ShowStat()�� ���� �������� ���¸� �����ݴϴ�. name, level, hp, 
	 * mp, attack �Ӽ��� System.out.println() ���� �� ���� ������ݴϴ�. 
	 * 
	 */
	
	private String name;
	private int level;
	private int hp;
	private int mp;
	private int attack;
	
	public Magician(String name) {
		this.name = name;
		// ������ ���ο��� ������ ��ġ�� �� �� �ִ�.
		this.level = 1;
		this.hp = 20;
		this.mp = 20;
		this.attack = 3;
	}
	
	public void Attack() {
		System.out.println("����� ���濡��" + attack + "�������� ���ߴ�.");
		System.out.println("================================");
	}
	
	public void ShowStat() {
		System.out.println("����� ���̵�� " + name + "�Դϴ�.");
		System.out.println("������ " + level + "�Դϴ�.");
		System.out.println("���ݷ� : " + attack);
		System.out.println("ü�� : " + hp + " ���� : " + mp);
		System.out.println("================================");
	}
	
	public void Fireball() {
		System.out.println("����� ���̾�� " + attack * 3 + "�������� ���ߴ�.");
		mp -= 5;
		System.out.println("================================");
	}
	
	public void Meditation() {
		System.out.println("����� ����� ���� mp�� 20ȸ���ߴ�");
		mp += 20;
		System.out.println("================================");
	}
	
	
	
	
	
	
	
	
	
}
