import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
	public static int FindSmallest(int m) {
		int n;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(n=2;n<=m;) {
			if(m%n==0) {
				list.add(new Integer(n));
				m = m/n;
			}else
				n++;
		}
		

				
		int s = 1,pre=list.get(0),num=0;
		for(int i=0;i<=list.size();i++) {
			if(i==list.size() || pre!=list.get(i).intValue()) {
				if(num%2==1)
					s *= pre;
				num = 0;
			}
			if(i<list.size()) {
				pre = list.get(i).intValue();
				num++;
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int m = input.nextInt();
		System.out.println(m + " * " + FindSmallest(m) + " is a perfect square number.");
		System.out.println("m *n is " + m*FindSmallest(m));
	}
}