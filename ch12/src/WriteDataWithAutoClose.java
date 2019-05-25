import java.io.*;

public class WriteDataWithAutoClose {
	public static void main(String[] args) throws IOException {
		File file = new File("src/score2.txt");
		
		if(file.exists()) {
			System.out.println("File already exist.");
			System.exit(1);
		}
		try(PrintWriter output = new PrintWriter(file);){
			output.print("John T smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
	}
	
}