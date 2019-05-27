import java.io.*;
import java.util.*;

public class FormatJavaCode {
	public static void main(String[] args) throws IOException {
		if(args.length != 1) {
			System.out.println("Usage: java FormatJavaCode src/filename");
			System.exit(1);
		}
		
		File file = new File(args[0]);
		StringBuilder sb = new StringBuilder((int)file.length());
		
		
		Scanner input = new Scanner(file);
		int line = 0;
		while(input.hasNext()) {
			String buf = input.nextLine();
			line++;
			int i;
			for(i=0;i<buf.length() && (buf.charAt(i)==' ' || buf.charAt(i)=='\t');i++);
			
			if(buf.charAt(i)!='{') buf = ((line!=1)?"\n":"") + buf;
			else buf = buf.substring(i);
			sb.append(buf);
		}
		PrintWriter output = new PrintWriter(file);
		output.print(sb.toString());
		
		input.close();
		output.close();
	}
}