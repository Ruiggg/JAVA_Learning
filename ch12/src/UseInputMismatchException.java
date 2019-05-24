import java.util.*;

public class UseInputMismatchException {
	public static int sum() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 integers: ");
		int x=0,y=0;
		try {
			x = input.nextInt();
			y = input.nextInt();
		}
		catch(InputMismatchException ex) {
			input.nextLine();
			throw ex;
		}

		return x+y;
	}
	
	public static void main(String[] args) {
		int sum = 0, flag = 0;
		while(flag==0) {
			try {
				sum = sum();
				System.out.println("sum = " + sum);
				flag = 1;
			}
			catch(InputMismatchException ex) {
				System.out.println("Valid input!");
			}
			//this statement can be executed after catch
		}//while
	}
}