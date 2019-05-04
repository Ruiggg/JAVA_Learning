import java.util.*;

public class UseArrayList {
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
	
	public static void main(String[] args) {
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
}