import java.util.Scanner;
public class HexDigit2Dec
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex digit: ");
		String str = input.nextLine();
		str = str.toUpperCase();
		if(str.length() != 1)
		{
			System.out.println("You must enter exactly one character");
			System.exit(0);
		}
		else if(str.charAt(0) >= 'A' && str.charAt(0) <= 'F')
			System.out.println("The decimal value for hex digit "
			+ str.charAt(0) + " is " + (str.charAt(0) - 'A' + 10));
		else if(str.charAt(0)>='0' && str.charAt(0)<='9')
			System.out.println("The decimal value for hex digit "
			+ str.charAt(0)	+ " is " + str.charAt(0));
		else
			System.out.println(str.charAt(0) + " is an invalid input");
	}
}