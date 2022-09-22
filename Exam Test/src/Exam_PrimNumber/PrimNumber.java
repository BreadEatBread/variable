package Exam_PrimNumber;

public class PrimNumber {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		for(int i = 1; i <= n; i++) {
			if(n % 1 == 0) {
				
				System.out.println(i);
			}
			
		}
		
	}
	

}
