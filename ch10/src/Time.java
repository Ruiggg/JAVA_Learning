import java.util.*;;

public class Time {
	private long hour;
	private long minute;
	private long second;
	//constructor
	public Time() {
		this(System.currentTimeMillis());
	}
	public Time(long elapsedTime) {
		long total = elapsedTime;
		long totalSeconds = total/1000;
		long currentSecond = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentMinite = totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currentHour = totalHours%24;
		second = currentSecond;
		minute = currentMinite;
		hour   = currentHour;
	}
	public Time(long h,long m,long s) {
		hour = h;
		minute = m;
		second = s;
	}
	public long getHour() {
		return hour;
	}
	public long getMinute() {
		return minute;
	}
	public long getSecond() {
		return second;
	}
	public void setTime(long elapseTime) {
		long total = elapseTime;
		long totalSeconds = total/1000;
		long currentSecond = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentMinite = totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currentHour = totalHours%24;
		second = currentSecond;
		minute = currentMinite;
		hour   = currentHour;
	}
	//test
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		System.out.println("t1: "+t1.getHour()+" "+t1.getMinute()+" "+t1.getSecond());
		System.out.println("t2: "+t2.getHour()+" "+t2.getMinute()+" "+t2.getSecond());
	}
}