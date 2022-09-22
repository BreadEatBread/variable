package sec01_array.EX04_PrimaryAndReferenceType;

public class PrimaryAndReferenceType {
	public static void main(String[] args) {
		
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println();
		
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1;
		array2[0] = 7;
		System.out.println(array1[0]);
		System.out.println(array2[0]);
	}

}
