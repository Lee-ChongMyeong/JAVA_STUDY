package day8;

public class Break1 {
	public static void main(String[] args) {
		
		String arr[] = {"������", "������", "�ɱ��", "���纸����"};
		
		for(int i =0; i < arr.length; i++) {
			if(i == 2) {
				break;
			}
			System.out.println(arr[i]);
		}
	}
}
