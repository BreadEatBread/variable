package sec01_operator_1.EX05_LogicalOperator;

public class LogicalOperator {
	public static void main(String[] args) {
		//�� ������
		// @AND(&&)
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true && (5<3));
		System.out.println((5 <= 5) && (7 > 2));
		System.out.println();
		
		// @OR(||)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || (5 < 3));
		System.out.println((5 <= 5) || (7 > 2));
		System.out.println();
		
		// @XOR(^)
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ (5 < 3));
		System.out.println((5 <= 5) ^ (7 > 2));
		System.out.println();
		
		// @NOT(!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5 < 3));
		System.out.println((5 <= 5) || !(7 > 2));
		
		//��Ʈ �����ڷ� �� ���� ����
	}

}
