

public class UseOutOfMemoryError {
	public static void main(String[] args) {
		try {
			int[] arr = new int[Integer.MAX_VALUE];
			System.out.println(arr[3]);
		}
		catch(OutOfMemoryError ex) {
			System.out.println("Out of memory");
		}
		finally {
			System.out.println("ending...");
		}
	}
}