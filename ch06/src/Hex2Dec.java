import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		
		System.out.println("The decimal value for hex number is "+hexToDecimal(hex));
	}
	
	public static int hexToDecimal(String s) {
		int value = 0;
		for(int i=0;i<s.length();i++) {
			value = value*16 + hexCharToDecimal(s.charAt(i));
		}	
		return value;
	}
	
	public static int hexCharToDecimal(char hexChar) {
		if(hexChar >= 'A' && hexChar <= 'F')
			return hexChar - 'A' + 10;
		else if(hexChar >= 'a' && hexChar <= 'f')
			return hexChar - 'a' + 10;
		else
			return hexChar - '0';
	}
}