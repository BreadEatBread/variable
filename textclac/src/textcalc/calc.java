package textcalc;
import java.util.Scanner;
//클래스 필드 생성자 메소드 오버로딩
//계싼기 객체 계산기 쓸 수 있는 환경
//생성자를 이용한 사칙연산계산기
public class calc {

	// 필드 초기화 : 사용할 변수들
	private int num1, num2;
	private char op;

	public calc() {	} // 디폴트 생성자
	public calc(int a, char b, int c) {
		this.num1 = a;
		this.op = b;
		this.num2 = c;
	}

	public int getA() {
		return num1;
	}
	public char getB() {
		return op;
	}
	public int getC() {
		return num2;
	}

	public int add() {	// 더하기
		System.out.print(getA()+" + "+getC()+" = ");
		return getA()+getC(); 
	}
	public int sub() {	// 빼기
		System.out.print(getA()+" - "+getC()+" = ");
		return getA()-getC(); 
	}
	public int mul() {	// 곱
		System.out.print(getA()+" * "+getC()+" = ");
		return getA()*getC(); 
	}
	public float div() {	// 나눔
		System.out.print(getA()+" / "+getC()+" = ");
		return (float)getA()/getC();
	}

	public static void main(String[] args) {
		int num1, num2;
		char op, str;
		Scanner sc = new Scanner(System.in);
		
        do {
		System.out.println("연산 수식 입력 : ");
		num1 = sc.nextInt();
		op = sc.next().charAt(0);
		num2 = sc.nextInt();
		
		calc ce = new calc(num1, op, num2); // 생성자 객체 생성
		
		switch(ce.getB()) {
		case '+' : 
			System.out.println(ce.add());break;
		case '-' :
			System.out.println(ce.sub());break;
		case '*' :
			System.out.println(ce.mul());break;
		case '/' :
			System.out.println(ce.div());break;
		case 'x':
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);break;
		}
        
        System.out.println();
        System.out.print("Continue?(y/n) : ");
        str = sc.next().charAt(0);
        if(str == 'n' || str == 'N') {
           System.out.println("End");
           break;
        }
		}while(str == 'y' || str == 'Y');
		

		
	}
}