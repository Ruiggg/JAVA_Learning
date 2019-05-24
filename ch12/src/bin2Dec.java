import java.util.*;

public class bin2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isContinue = true;
		String bin;
		do {
			int binValue = 0;
			System.out.print("Enter a binary number: ");
			bin = input.nextLine();
			try {
				for(int i=0;i<bin.length();i++) {
					char binChar = bin.charAt(i);
					if(binChar != '0' && binChar != '1')
						throw new BinaryFormatException("Wrong number at "+i,bin);
					else
						binValue = binValue*2 + (binChar - '0');
				}
				System.out.println("The binary value of " + bin + " is " + binValue);
				isContinue = false;
			}
			catch(BinaryFormatException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		}while(isContinue);
	}
}

class BinaryFormatException extends NumberFormatException {
	private String bin;
	public BinaryFormatException(String s,String bin) {
		super(s);
		this.bin = bin;
	}
	public String getBin() {
		return bin;
	}
}