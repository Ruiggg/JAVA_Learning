import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ChangeTxt {
	public static void main(String[] args) throws IOException{
		if(args.length != 3) {
			System.out.println("Usage: java ChangeTxt filename oldString newString");
			System.exit(1);
		}
		
		File file = new File(args[0]);
		
		long capacity = file.length();
		
		StringBuilder sb = new StringBuilder((int)capacity);
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) {
			String tem = input.nextLine();
			tem = tem.replaceAll(args[1], args[2]);
			sb.append(tem+"\n");
		}
		
		PrintWriter output = new PrintWriter(file);
		output.print(sb.toString());
		input.close();
		output.close(); 
	}
}