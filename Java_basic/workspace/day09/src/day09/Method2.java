package day09;

	

public class Method2 {
	
	public static void exchangeTHB(double won) {
		System.out.println("��ȭ �ݾ� : " + won + "��");
		System.out.println("��Ʈȭ ȯ�� : " + won/35.65 + "��Ʈ");
	}
	
	public static void exchangeEUR(double won) {
		System.out.println("��ȭ �ݾ� : " + won + "��");
		System.out.println("����ȭ ȯ�� : " + won/1280.47 + "����");
	}
	
	
	
	public static void main(String[] args) {
		exchangeTHB(400000);
		exchangeEUR(6000000);
		
	}
}
