import java.io.*;
import java.util.*;

public class IOnumber {
	public static void main(String[] args) throws IOException{
		File file = new File("src/Exercise12_15.txt");
		
		if(file.exists()) {
			System.out.println("File "+file.toString()+" has already existed.");
			System.exit(1);
		}
		
		try(PrintWriter output = new PrintWriter(file);){
			for(int i=0;i<100;i++) {
				int num = (int) (Math.random()*100);
				output.print(num + " ");
			}
		}
		
		int[] a = new int[100];
		try(Scanner input = new Scanner(file);){
			for(int i=0;i<a.length;i++) {
				int num = input.nextInt();
				a[i] = num;
			}
		}
		
		Arrays.sort(a);
		for(int i=0;i<100;i++)
			System.out.print(a[i]+",");
		
		file.delete();
	}
}