import java.io.*;
import java.util.*;
import java.net.*;

public class ReadFractionInWeb {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String urlString = input.nextLine();
		ArrayList<Object> sum = sumFraction(urlString);
		System.out.println("Sum = " + sum.get(0).toString());
		System.out.println("Average = ");
	}
	
	public static ArrayList<Object> sumFraction(String urlString) throws IOException {
		int count = 0;
		double sum = 0.0;
		URL url = new URL(urlString);
		
		try(Scanner input = new Scanner(url.openStream());){
			while(input.hasNext()) {
				String s = input.nextLine();
				System.out.println(s + "\n");
				//String fraction = input.next();
				//int index = fraction.indexOf('/');
				//int son = Integer.parseInt(fraction.substring(0, index));
				//int mom = Integer.parseInt(fraction.substring(index+1,fraction.length()));
				//sum += (float)son/mom;
				//count ++;
			}
		}
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new Double(sum));
		list.add(new Integer(count));
		return list;
	}
}