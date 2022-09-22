package Exam_Factorial;

public class Factorial {
	public static void main(String[] args) {
		
		String a = args[0];
		int b = Integer.parseInt(a);
		int f = 1;
		
		for(int i = 1; i <= b; i++) {
			f *= i;
			System.out.printf("°öÇÑ¼ö : %d", f);
			System.out.println();
		}
		
		
	}

}
