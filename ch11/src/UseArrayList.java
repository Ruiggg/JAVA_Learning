import java.util.*;
import java.lang.*;

public class UseArrayList {
	
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<list1.size();i++)
			list.add(list1.get(i));
		for(int i=0;i<list2.size();i++)
			list.add(list2.get(i));
		removeDuplicate(list);
		
		return list;
	}
	
	public static ArrayList<Integer> LargestRow(int[][] m){
		int row = 0;
		int maxNumOfRow = 0;
		int numOfRow = 0;
		
		for(int i=0;i<m.length;i++) {
			numOfRow = 0;
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]!=0)
					numOfRow++;
			}
			if(numOfRow > maxNumOfRow) {
				row = i;
				maxNumOfRow = numOfRow;
			}
		}
		
		int col = 0,maxNumOfCol=0,numOfCol=0;
		int colnum = m[0].length;
		for(int j=0;j<colnum;j++) {
			numOfCol = 0;
			for(int i=0;i<m.length;i++) {
				if(m[i][j]!=0)
					numOfCol++;
			}
			if(numOfCol > maxNumOfCol) {
				col = j;
				maxNumOfCol = numOfCol;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(row));
		list.add(new Integer(col));
		return list;
	}
	
	public static void sort(ArrayList<Integer> list) {
		for(int i=1;i<list.size();i++) {
			for(int j=list.size()-1;j>=i;j--) {
				if(list.get(j).compareTo(list.get(j-1)) < 0) {
					Integer tem = new Integer(list.get(j).intValue());
					list.set(j, list.get(j-1));
					list.set(j-1, tem);
				}
			}
		}
	}
	
	public static double sum(ArrayList<Double> list) {
		if(list==null) return 0.0;
		double sum = 0;
		for(int i=0;i<list.size();i++)
			sum += list.get(i).doubleValue();
		return sum;
	}
	
	private static void func1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		int n = input.nextInt();
		int[][] m = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m[i][j] = (int)(Math.random()*2);
			}
		}
		System.out.println("The random array is");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		System.out.println("The largest row index :    "+LargestRow(m).get(0));
		System.out.println("The largest column index : "+LargestRow(m).get(1));
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j).compareTo(list.get(i))==0) {
					list.remove(j);
				}
			}
		}
	}
	
	private static void func2() {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter 5 integers: ");
		for(int i=0;i<5;i++) {
			Integer num = input.nextInt();
			list.add(num);
		}
		sort(list);
		for(int i=0;i<5;i++) {
			System.out.print(list.get(i)+", ");
		}
	}
	
	private static void func3() {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		for(int i=0;i<5;i++) {
			Double num = input.nextDouble();
			list.add(num);
		}
		System.out.println("sum = "+sum(list));
	}
	
	private static void func4() {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter 5 integers: ");
		for(int i=0;i<5;i++) {
			Integer num = input.nextInt();
			list.add(num);
		}
		removeDuplicate(list);
		System.out.print("The distinct integers are ");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+", ");
		}
	}
	
	private static void func5() {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.print("Enter 5 integers: ");
		for(int i=0;i<5;i++) {
			Integer num = input.nextInt();
			list1.add(num);
		}
		System.out.print("Enter 5 integers: ");
		for(int i=0;i<5;i++) {
			Integer num = input.nextInt();
			list2.add(num);
		}
		ArrayList<Integer> list = union(list1, list2);
		System.out.print("The union is ");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+", ");
		}
	}
	
	
	public static void main(String[] args) {
		//func1();
		//func2();
		func5();
	}
}