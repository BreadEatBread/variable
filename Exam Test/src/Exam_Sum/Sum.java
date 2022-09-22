package Exam_Sum;

public class Sum {
	public static void main(String[] args) {
		
		int sum = 0;
		String b = args[0];
		
		int c = Integer.parseInt(b);
		
		for(int i = 0; i <= c; i++) {
			sum += i;
			System.out.printf("i: %d, sum: %d", i, sum);
			System.out.println();
	}
		System.out.printf("Á¤´ä : %d ", sum);
}
}
