package TypeStudy;

public class StringTest1 {

	public static void main(String[] args) {
		
		// ���ÿ��� �޾ƿü� �ִ� �� : �ȳ��� 
		// �������ڿ��� ���� ����
		
		String str1 = "Hello";
		String str2 = "Hello";
		//String str2 = str1;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);	// ���ڸ� ���ϴ°��� �ƴ϶�, �ȳ���(100����)�� ���ϴ� ����.
		
		String str3 = new String("Hello");	// ��ü ����, new�� ������� �츮�� ���� ����. �ȳ���(300����)
		String str4 = new String("Hello");  // �ȳ���(400����)
		
		System.out.println(str3);			
		System.out.println(str4);
		System.out.println(str3 == str4);	// �ȳ��� ���� ����

		
		System.out.println("============================");
		System.out.println("equals() ���");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));	// �ȳ����� �ٸ�. 
		System.out.println(str1.equals(str4));	
		System.out.println(str3.equals(str4));
		
	}

}
