import java.io.*;
import java.util.*;


public class IsStringSorted {
	public static void main(String[] args) throws IOException {
		File file = new File("src/test.txt");
	
		try(Scanner input = new Scanner(file);){
			String current = null,next;
			if(input.hasNext()) current = input.next();
			while(input.hasNext()) {
				next = input.next();
				if(current.compareTo(next)>0) {
					System.out.println(current +"\n"+next);
					System.exit(0);
				}
				current = next;
			}
			System.out.println("Sorted!");
		}
		catch(Exception ex) {
			System.out.println("File not found");
		}
	}
}