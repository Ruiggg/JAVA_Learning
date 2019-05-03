package People;
import java.util.GregorianCalendar;

public class MyDate {
	private int year,month,day;
	//constructor
	public MyDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public MyDate() {
		GregorianCalendar d = new GregorianCalendar();
		year = d.get(GregorianCalendar.YEAR);
		month = d.get(GregorianCalendar.MONTH);
		day = d.get(GregorianCalendar.DAY_OF_MONTH);
	}
	public MyDate(long elapseTime) { //ms from 1970.1.1
		GregorianCalendar d = new GregorianCalendar();
		d.setTimeInMillis(elapseTime);
		year = d.get(GregorianCalendar.YEAR);
		month = d.get(GregorianCalendar.MONTH);
		day = d.get(GregorianCalendar.DAY_OF_MONTH);
	}
	//get
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	//set
	public void setDate(long elapsedTime) {
		GregorianCalendar d = new GregorianCalendar();
		d.setTimeInMillis(elapsedTime);
		year = d.get(GregorianCalendar.YEAR);
		month = d.get(GregorianCalendar.MONTH);
		day = d.get(GregorianCalendar.DAY_OF_MONTH);
	}
	//
	public String toString() {
		return year+":"+month+":"+day;
	}
	//test
	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(561555550000L);
		System.out.println("d1: "+d1.getYear()+" "+d1.getMonth()+" "+d1.getDay());
		System.out.println("d2: "+d2.getYear()+" "+d2.getMonth()+" "+d2.getDay());
		d1.setDate(561555550000L);
		System.out.println("d1: "+d1.getYear()+" "+d1.getMonth()+" "+d1.getDay());		
	}
}