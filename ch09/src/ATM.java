import java.util.*;

public class ATM {
	//test Account.class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		//initialize
		for(int i=0;i<10;i++) {
			accounts[i] = new Account(i,100);
		}
		while(true) {
			int choice=1;
			int id,option;
			//can't tackle id is not an integer
			do {
				System.out.print("Enter an id: ");
				id = input.nextInt();
			}while(id>=10 || id<0);
			while(choice!=4) {
				printMenu();
				System.out.print("Enter a choice: ");
				choice = input.nextInt();
				printOption(accounts[id],choice);
			}
		}
	}
	
	private static void printMenu() {
		System.out.println();
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
	}
	
	private static void printOption(Account a,int choice) {
		if(choice==1)
			System.out.println("The balance is "+a.getBalance());
		else if(choice==2) {
			System.out.print("Enter an amount to withdraw: ");
			Scanner input = new Scanner(System.in);
			int amount = input.nextInt();
			a.setBalance(a.getBalance()-amount);
		}else if(choice==3) {
			System.out.print("Enter an amount to deposit: ");
			Scanner input = new Scanner(System.in);
			int amount = input.nextInt();
			a.setBalance(a.getBalance()+amount);
		}
	}
}