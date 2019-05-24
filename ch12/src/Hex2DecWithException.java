import java.util.*;


public class Hex2DecWithException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isContinue = true;
		//prompt the user to enter a string
		do {
			System.out.print("Enter a hex number: ");
			String hex = input.nextLine();
			try {
				int dec = hexToDecimal(hex.toUpperCase());
				System.out.println("The decimal value of " + hex +" is " + dec);
				isContinue = false;
			}
			catch(NumberFormatException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		}while(isContinue);
	}
	
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		try {
			for(int i=0;i<hex.length();i++) {
				char hexChar = hex.charAt(i);
				//check
				if((hexChar>='0'&&hexChar<='9')||(hexChar>='A'&&hexChar<='F'))
					decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
				else
					throw new NumberFormatException("Illegal Number.");
			}
		}
		catch(NumberFormatException ex) {
			throw ex;
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if(ch >= 'A' && ch <= 'Z')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}