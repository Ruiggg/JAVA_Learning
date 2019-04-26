import java.util.*;
public class StopWatch {
	private long startTime;
	private long endTime;
	//constructor
	public StopWatch() {
		Date d = new Date();
		startTime = d.getTime();
	}
	
	public void start() {
		Date d = new Date();
		startTime = d.getTime();
		System.out.println(startTime);
	}
	
	public void stop() {
		Date d = new Date();
		endTime = d.getTime();
		System.out.println(endTime);
	}
	
	public long getElapsedTime() {
		System.out.println(endTime+" "+startTime);
		return endTime-startTime;
	}
	
	public static void main(String[] args) {
		int[] A = {3,4,-2,6,1,5,6,7,8,5,4,3,2,21,23,1,100};
		int n = A.length;
		StopWatch sw = new StopWatch();
		sw.start();
		selectSort(A,n);
		sw.stop();
		long t = sw.getElapsedTime();
		for(int k=0;k<A.length;k++)
			System.out.print(A[k]+" ");
		System.out.println();
		System.out.println("The time used: "+t);
		
	}
	 
	private static void selectSort(int[] A,int n) {
		//sorting A[0] --- A[n-1]
		for(int i=0;i<n-1;i++) {
			for(int j=n-2;j>=i;j--) {
				if(A[j]>A[j+1]) {
					int tem = A[j];
					A[j] = A[j+1];
					A[j+1] = tem;
				}
			}
		}
	}
}