public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	public static Location locateLargest(double[][] a) {
		Location loc = new Location();
		double max = a[0][0];
		int row,col;
		row = col = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max = a[i][j];
					row = i;
					col = j;
				}//if
			}//for j
		}//for i
		loc.row = row;
		loc.column = col;
		loc.maxValue = max;
		return loc;
	}
	
	public static void main(String[] args) {
		double[][] a = {{1.0,-2.3,2.3,2.6},{1,2,2}};
		Location l = locateLargest(a);
		System.out.println("row:"+l.row);
		System.out.println("col:"+l.column);
		System.out.println("max:"+l.maxValue);
	}
}