package day8;

public class Continue1 {
	public static void main(String[] args) {
		
		
		String arr[] = {"Ŭ����Ÿ��", "�������� ������", "����"};
		
		for(String movie : arr) {
			if (movie == "�������� ������") {
				continue;
			}
			System.out.println(movie);
		}
		
	}
}
