package TypeStudy;

import java.util.Scanner;

public class LoginMain {

	/*
	 * ����
	 * 
	 * �α����� �����غ����� �ϰڽ��ϴ�.
	 * 
	 * ���� Scanner�� ����ؼ� String id���� ���̵�,
	 * String pw���� ��й�ȣ�� �Է¹޽��ϴ�.
	 * 
	 * if-else���� ���ǽ��� Ȱ���ؼ� �Է¹��� id�� pw��
	 * .equals("���̵� Ȥ�� ��й�ȣ")�� �����ֽð�
	 * �񱳰���� �� �� true �� ����
	 * "�α��ο� �����Ͽ����ϴ�."
	 * �� �� �ϳ��� false���
	 * "�α��ο� �����߽��ϴ�." ��� ������ �ܼ�â�� ����ּ���.
	 * ���ӿ� ���̵�� kgitbank ��й�ȣ�� password�� ���ּ���.
	 * 
	 */
	
	public static void main(String[] args) {
		
		String id;
		String pw;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���̵� �Է����ּ���");
		id = sc.nextLine();
		System.out.println("���� ��й�ȣ�� �Է����ּ���");
		pw = sc.nextLine();
		
		if (id.equals("kgitbank") && pw.equals("password")) {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		}else {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		}
		
		sc.close();
		
		
	}

}
