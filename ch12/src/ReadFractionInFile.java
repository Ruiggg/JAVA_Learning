import java.io.*;
import java.util.*;

public class ReadFractionInFile {
	public static void main(String[] args) throws IOException {
		if(args.length != 1) {
			System.out.println("Uasge: java ReadFractionInFile filename");
			System.exit(1);
		}
		
		float sum = 0;
		File file = new File(args[0]);
		try(Scanner input = new Scanner(file);){
			while(input.hasNext()) {
				String fraction = input.next();
				int index = fraction.indexOf('/');
				int son = Integer.parseInt(fraction.substring(0, index));
				int mom = Integer.parseInt(fraction.substring(index+1,fraction.length()));
				sum += (float)son/mom;
			}
		}
		
		System.out.println("sum = " + (int)(sum*100.0)/100.0);
	}
}