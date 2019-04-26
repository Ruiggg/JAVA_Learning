import java.util.Arrays;
import java.util.Scanner;

public class EliminateNums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[10];
		System.out.print("Enter 10 numbers: ");
		for(int i=0;i<list.length;i++) {
			list[i] = input.nextInt();
		}
		
		int[] result = new int[10];
		result = eliminateDuplicates(list);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int []Result = new int[list.length];
		int i = 0;		//index of result to be stored next
		for(int j=0;j<list.length;j++) {	//j is index of list
			if(Arrays.binarySearch(Result, 0, i, list[j])<0) {
				Result[i] = list[j];
				i++;
			}
		}
		int[] Result2 = new int[i];
		Result2 = Arrays.copyOfRange(Result, 0, i);
		return Result2;
	}
}