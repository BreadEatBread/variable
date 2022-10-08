package sec01_operator_1.EX05_LogicalOperator;

public class LogicalOperator {
	public static void main(String[] args) {
		//논리 연산자
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
		
		// @XOR(^) 값이 달라야 true로 처리
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ (5 < 3));
		System.out.println(5 < 3);
		System.out.println((5 <= 5) ^ (7 > 2));
		System.out.println();
		
		// @NOT(!) 값을 반대로 변환 false를 true / true를 false로
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		//false or ((not(false))=true) = true	
		System.out.println(false || !(5 < 3));
		//(true) or (not(true)=false) = true
		System.out.println((5 <= 5) || !(7 > 2));
		System.out.println();
		
		
		//비트 연산자로 논리 연산 수행
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true | (5 < 3));
		System.out.println((5 <= 5) | (7 > 2));
		System.out.println();
		
		// @쇼트 서킷 사용 여부(논리 연산자는 0, 비트 연산자 X)
		int value1 = 3;
		System.out.println(false && ++value1 > 6);
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6);
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);
		
		System.out.println((5 <= 5) | (7 > 2));
		
		
		System.out.println(false && true);
		System.out.println((4 <= 4) || (6 < 3));
		System.out.println(false ^ (3 >=4));
		System.out.println(!(3 <= 3));
	}

}
