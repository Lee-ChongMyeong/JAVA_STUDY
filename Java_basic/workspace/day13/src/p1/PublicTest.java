package p1;

import java.util.Scanner;

public class PublicTest {
//	public String a;
//	public int b;
	
	private String a;	// �ֹ� ���ο� �ִ� �ڿ�
	private int b;
	
	
	public PublicTest() {	// ������ : Ȧ 
		a = "�ۺ� ���� ������.";
		b = 10;
	}
	
	public void Geta() {	// Getter : �ܺο��� Private ���� ��ȸ ����. Getter ���� ��û�ؼ� ������ ���� ��
		System.out.println(a);
	}
	
	public void Getb() {
		System.out.println(b);
	}
	
	public void Seta() {	// Setter : ���� Private ������ ���� ����. ���� ���� ������������ ������ �ɾ ���� �� ����.
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();
	}
	
	public void Setb() {
		Scanner scan2 = new Scanner(System.in);
		int c;
		c = scan2.nextInt();
		if (c > 100 ) {
			System.out.println("100���� ū ���� ���� �� �����ϴ�.");
			return;	// void �� �� ����, �߰��� ���Ḧ ��Ŵ == break��ó�� �Ǵ� ����
		}
		b = c;
		scan2.close();
	 
	}
}
