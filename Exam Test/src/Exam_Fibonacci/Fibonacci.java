package Exam_Fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int b = 1;
		
		for(int a = 1; a <= n; a += b) {
			
			int c = a + b;
			System.out.printf("피보나치 : %d" , c);
			System.out.println();
		}
	}

}
