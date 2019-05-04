import java.util.*;

public class MaxOfArrayList {
	public static Integer max(ArrayList<Integer> list) {
		if(list==null || list.size()==0) return null;
		Integer max = new Integer(list.get(0).intValue());
		for(int i=1;i<list.size();i++) {
			if(list.get(i).compareTo(max)>0)
				max = new Integer(list.get(i).intValue());
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter a list of integers: ");
		int num;
		do {
			num = input.nextInt();
			if(num!=0)
				list.add(new Integer(num));
		}while(num!=0);
		System.out.println("Max is " + max(list));
	}
}