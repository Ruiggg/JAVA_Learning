import java.io.*;
import java.util.*;

public class DeleteTextInFile {
	public static void main(String[] args) throws IOException{
		if(args.length != 2) {
			System.out.println("Usage: java DeleteTextInFile John filename");
			System.exit(1);
		}
		
		File file = new File(args[1]);
		long capacity = file.length();
		StringBuilder sb = new StringBuilder((int)capacity);
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			String tem = input.nextLine();
			tem = tem.replaceAll(args[0], "");
			sb.append(tem+"\n");
		}
		
		PrintWriter output = new PrintWriter(file);
		output.print(sb.toString());
		input.close();
		output.close();
	}
}