import java.util.Date;
public class UseDate {
	public static void main(String[] args) {
		Date t = new Date();
		long startTime = 10000;
		for(int i=1;i<=8;i++) {
			t.setTime(startTime);
			System.out.println("The millonseconds: "+startTime+"; The time: "+t.toString());
			startTime *= 10;
		}
	}
}