import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
	
	private static boolean AlreadyHave(ArrayList<Integer> list,int answer) {
		for(int i=0;i<list.size();i++) {
			if(answer == list.get(i).intValue())
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+"? ");
		int answer = input.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(number1 + number2 != answer) {
			if(AlreadyHave(list,answer)) {
				System.out.println("You already entered "+answer);
			}
			list.add(new Integer(answer));
			System.out.print("Wrong answer. Try again. What is "+number1+" + "+number2+"? ");
			answer = input.nextInt();
		}
		
		System.out.println("You got it!");
	}
}