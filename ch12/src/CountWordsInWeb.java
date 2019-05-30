import java.util.*;
import java.net.*;

public class CountWordsInWeb {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a url: ");
		String url = input.nextLine();
		int w = CountWords(url);
		System.out.println("words: " + w);
	}
	
	public static int CountWords(String urlStr) {
		int count = 0;
		try {
			URL url = new URL(urlStr);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()) {
				count++;
				input.next();
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return count;
	}
}