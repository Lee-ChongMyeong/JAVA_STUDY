package ClassStudy1;

public class LocalMember {
	// ������� : Ŭ���� �ȿ� ����� �����̴�. �ʱ�ȭ�� ���� �ʾƵ� �ڵ����� �� ������ Ÿ���� �⺻������ �ڵ� �ʱ�ȭ �˴ϴ�.
	// ex) int a;  -> 0���� �ʱⰪ�� ������
	
	// �������� : �޼��� �ȿ� ����� �����̴�. ���������� �޼��� ��� �ۿ����� ����� �� �����ϴ�. ����ϱ� ���� �ݵ�� �ʱ�ȭ�� �ؾ��մϴ�.
	
	public String Member;	// �������
	
	public void showLocalMember() {
		String Local;		// ��������
		Local = "�������� �Դϴ�.";
		System.out.println(Member);
		System.out.println(Local);
	}
}
