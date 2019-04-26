
public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	//visit
	public int getSpeed() {
		return speed;
	}
	public boolean getOn() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getString() {
		return color;
	}
	//set
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//constructor
	public Fan() {}
	public String toString() {
		String s;
		if(on) 
			s = speed+" "+color+" "+radius;
		else
			s = "fan is off";
		return s;
	}
	//test
	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.setSpeed(3);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);
		f2.setSpeed(2);
		f2.setRadius(5);
		f2.setOn(true);
		f2.setColor("Blue");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}
}