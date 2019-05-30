import java.io.*;
import java.util.*;

public class ReplaceTxtInDir {
	public static void main(String[] args) throws IOException {
		if(args.length != 3) {
			System.out.println("Usage: java ReplaceTxtInDir dir oldString newString");
			System.exit(1);
		}
		
		File dir = new File(args[0]);
		System.out.println(dir.listFiles().length);
		File[] files = dir.listFiles();
		
		for(int i=0;i<files.length;i++) {
			File file = files[i];
			
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
}