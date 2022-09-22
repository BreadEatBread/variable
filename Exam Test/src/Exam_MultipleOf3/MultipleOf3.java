package Exam_MultipleOf3;

public class MultipleOf3 {
	public static void main(String[] args) {
		
		String a = args[0];
		int b = Integer.parseInt(a);
		
		for(int i = 1; i <= b; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}

