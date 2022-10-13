package example_java;
	class A {			
	    int arraySum(int[] array) {
	        int sum = 0;	        
	        for(int i : array) {
	            sum += i;
	        }
	        return sum;	        
	    }
	    float averageScore(int...values) {
	    	int arraysumScore = arraySum(values);
	    	float average = 0;
	    	average = (float)arraysumScore / values.length;
	    	
	    	return average;
	    }
}
public class arraysum {
	public static void main(String[] args) {
		 A a = new A();
		 System.out.println(a.averageScore(1) == 1.0);
	     System.out.println(a.averageScore(1, 2) == 1.5);
	     System.out.println(a.averageScore(1, 2, 3) == 2.0);
	     System.out.println(a.averageScore(1, 2, 3, 4) == 2.5);
	     System.out.println();
	     System.out.println(a.averageScore(1));
	     System.out.println(a.averageScore(1, 2));
	     System.out.println(a.averageScore(1, 2, 3));
	     System.out.println(a.averageScore(1, 2, 3, 4));	        
	} 
}