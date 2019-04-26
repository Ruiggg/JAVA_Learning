import java.util.Scanner;

public class CountNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int num;
		int positive = 0;
		int negtive = 0;
		int count = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		do {
			num = input.nextInt();
			sum += num;
			if(num > 0) {
				count++;
				positive++;
			}
			else if(num <0) {
				count++;
				negtive++;
			}
		}while(num!=0);
		if(count == 0) 
			System.out.println("No numbers are entered except 0");
		else {
			System.out.println("The number of positives is "+positive);
			System.out.println("The number of negatives is "+negtive);
			System.out.println("The total is "+(double)sum);
			System.out.println("The average is "+(double)sum / count);
		}
	}
}