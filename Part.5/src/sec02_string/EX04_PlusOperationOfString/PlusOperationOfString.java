package sec02_string.EX04_PlusOperationOfString;

public class PlusOperationOfString {
	public static void main(String[] args) {
		
		String str1 = "¾È³ç" + "ÇÏ¼¼¿ä" + "!";
		System.out.println(str1);
		
		String str2 = "¹Ý°©";
		str2 += "½À´Ï´Ù";
		str2 += "!";
		System.out.println(str2);
		System.out.println();
		
		
		String str3 = "¾È³ç" + 1;
		String str4 = "¾È³ç" + String.valueOf(1);
		String str5 = "¾È³ç" + "1";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		System.out.println(1 + "¾È³ç");
		System.out.println(1 + "¾È³ç" + 2);
		System.out.println("¾È³ç" + 1 + 2);
		System.out.println(1 + 2 + "¾È³ç");
	}

}
