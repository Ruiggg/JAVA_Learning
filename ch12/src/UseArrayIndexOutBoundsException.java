import java.util.*;

public class UseArrayIndexOutBoundsException {
	public static void main(String[] args) {
		int[] rands = new int[100];
		Random r = new Random();
		for(int i=0;i<100;i++) rands[i] = r.nextInt();
		Scanner input = new Scanner(System.in);
		boolean isContinue = true;
		while(isContinue) {
			System.out.print("Enter an integer: ");
			try {
				int index = input.nextInt();
				if(index<0 || index>=100) {
					throw new ArrayIndexOutOfBoundsException("index out of bounds");
				}
				System.out.printf("rands[%d] = %d\n",index,rands[index]);
				isContinue = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Valid input.");
				//input.nextLine();
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Error: " + ex.getMessage());
				//input.nextLine();
			}
			finally {
				input.nextLine();
			}
		}
	}
}