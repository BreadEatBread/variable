package sec_operator_1.EX02_BitwiseOperator;

public class BitwiseOperator {
	public static void main(String[] args) {
		//�ڹ� �޼���� ���� ��ȯ
		int data = 13;
		System.out.println(Integer.toBinaryString(data));//10���� ���� 2������ ǥ��
		System.out.println(Integer.toOctalString(data));//10���� ���� 8������ ǥ��
		System.out.println(Integer.toHexString(data));//10���� ���� 16������ ǥ��
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));//2���� ���� Int��(������) 10������ ǥ��
		System.out.println(Integer.parseInt("15", 8));//8���� ���� Int��(������) 10������ ǥ��
		System.out.println(Integer.parseInt("0D", 16));//16���� ���� Int��(������) 10������ ǥ��
		System.out.println();
		
		//�پ��� ���� ǥ��
		System.out.println(13);
		System.out.println(0b1101);
		System.out.println(015);
		System.out.println(0x0D);
		System.out.println();
		
		//��Ʈ ������
		//@AND ��Ʈ ������
		System.out.println(3 & 10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0a);
		System.out.println();
		
		//@OR ��Ʈ ������
		System.out.println(3 | 10);
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x03 | 0x0A);
		System.out.println();
		
		//@XOR ��Ʈ ������
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		System.out.println();
		
		//@NOT ��Ʈ ������
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		
	}

}
