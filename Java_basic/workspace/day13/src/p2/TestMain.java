package p2;

import p1.PublicTest;

public class TestMain {
	
	public static void main(String[] args) {
		
		PublicTest p1 = new PublicTest();	// PublicTest ��ü, ������ ȣ��(�����ڴ� public �� ����)

// 		Error
//		System.out.println(p1.a);
//		System.out.println(p1.b);
		
//		p1.a = "�ۺ��� �ƹ������� ���� ����";
//		p1.b = 50;
//		System.out.println(p1.a);
//		System.out.println(p1.b);
	
		
		p1.Geta();
		p1.Getb();
		p1.Seta();
		p1.Setb();
		
		p1.Geta();
		p1.Getb();
		
	}
}
