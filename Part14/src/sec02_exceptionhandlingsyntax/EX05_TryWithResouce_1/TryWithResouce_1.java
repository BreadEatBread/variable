package sec02_exceptionhandlingsyntax.EX05_TryWithResouce_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResouce_1 {
	public static void main(String[] args) {
		
		System.out.println("���ڸ� �Է��ϼ���!");
		
		try (InputStreamReader isr1 = new InputStreamReader(System.in); ) {
			char input = (char)isr1.read();
			System.out.println("�Է±��� = " + input);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		InputStreamReader isr2 = null;
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();
			System.out.println("�Է� ���� = " + input);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(isr2!=null) {
				try {
					isr2.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}