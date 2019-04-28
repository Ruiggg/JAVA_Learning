import java.util.*;

public class ShowPrimeFactor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an positive integer: ");
		int i = input.nextInt();
		int j = 2;
		StackOfIntegers sk = new StackOfIntegers();
		while(i>=j) {
			if(i%j==0) {
				sk.push(j);
				i = i/j;
			}else
				j++;
		}
		int size = sk.getSize();
		for(int k=0; k<size; k++) {
			System.out.print(sk.pop()+" ");
		}
	}
}