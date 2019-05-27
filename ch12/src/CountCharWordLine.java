import java.io.*;
import java.util.*;

public class CountCharWordLine {
	//don't count \n \r
	public static void main(String[] args) throws IOException {
		if(args.length != 1) {
			System.out.println("Usage: java CountCharWordLine filename");
			System.exit(1);
		}
		
		int line = 0,words = 0,chars = 0;
		File file = new File(args[0]);
		try(Scanner input = new Scanner(file)){
			while(input.hasNext()) {
				String buf = input.nextLine();
				line++;
				Scanner inputStr = new Scanner(buf);
				chars += buf.length();
				while(inputStr.hasNext()) {
					String token = inputStr.next();
					words ++;
				}
			}
		}
		System.out.println("Line:  " + line);
		System.out.println("Words: " + words);
		System.out.println("Chars: " + chars);
	}
}