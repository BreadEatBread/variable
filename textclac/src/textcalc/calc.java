package textcalc;
import java.util.Scanner;
//Ŭ���� �ʵ� ������ �޼ҵ� �����ε�
//��ѱ� ��ü ���� �� �� �ִ� ȯ��
//�����ڸ� �̿��� ��Ģ�������
public class calc {

	// �ʵ� �ʱ�ȭ : ����� ������
	private int num1, num2;
	private char op;

	public calc() {	} // ����Ʈ ������
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

	public int add() {	// ���ϱ�
		System.out.print(getA()+" + "+getC()+" = ");
		return getA()+getC(); 
	}
	public int sub() {	// ����
		System.out.print(getA()+" - "+getC()+" = ");
		return getA()-getC(); 
	}
	public int mul() {	// ��
		System.out.print(getA()+" * "+getC()+" = ");
		return getA()*getC(); 
	}
	public float div() {	// ����
		System.out.print(getA()+" / "+getC()+" = ");
		return (float)getA()/getC();
	}

	public static void main(String[] args) {
		int num1, num2;
		char op, str;
		Scanner sc = new Scanner(System.in);
		
        do {
		System.out.println("���� ���� �Է� : ");
		num1 = sc.nextInt();
		op = sc.next().charAt(0);
		num2 = sc.nextInt();
		
		calc ce = new calc(num1, op, num2); // ������ ��ü ����
		
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
			System.out.println("���α׷��� �����մϴ�.");
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