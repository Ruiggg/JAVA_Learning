import java.util.GregorianCalendar;
public class UseGregorianCalendar {
	public static void main(String[] args) {
		GregorianCalendar g = new GregorianCalendar();
		ShowTime(g);
		g.setTimeInMillis(1234567898765L);
		ShowTime(g);
	}
	
	public static void ShowTime(GregorianCalendar g) {
		System.out.println("Year:  "+g.get(GregorianCalendar.YEAR));
		System.out.println("Month: "+g.get(GregorianCalendar.MONTH));
		System.out.println("Day:   "+g.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println();
	}
}