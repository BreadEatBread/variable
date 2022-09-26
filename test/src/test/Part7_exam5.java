package test;
class A {
	void averagescore(double...values) {
		
		System.out.println(values.length);
		
		for(int k: values.length) {
			System.out.print(k + " ");
		}
	}
	
	
}

public class Part7_exam5 {
	public static void main(String[] args) {
		
		A a = new A();
		
		
		a.averagescore(1);
		a.averagescore(1, 2);
		a.averagescore(1, 2, 3);
		a.averagescore(1, 2, 3, 4);
		
		
		
		
	}

	

}
