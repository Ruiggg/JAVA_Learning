
public class MyPoint {
	private double x;
	private double y;
	//constructor
	public MyPoint() {
		this(0,0);
	}
	public MyPoint(double x,double y) {
		this.x = x;
		this.y = y;
	}
	//visit
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public boolean inLine(MyPoint p1,MyPoint p2) {
		return (x<p1.getX()&&x>p2.getX())||(x<p2.getX()&&x>p1.getX());
	}
	//method
	public double distance(MyPoint point) {
		double x = point.getX();
		double y = point.getY();
		double tem = Math.pow((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y), 0.5);
		return (int)(tem*100)/100.0;
	}
	public double distance(double x,double y) {
		double tem = Math.pow((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y), 0.5);	
		return (int)(tem*100)/100.0;
	}
	//test
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10,30.5);
		System.out.println("The distance is "+p1.distance(p2)+" repeat: "+p1.distance(p2.getX(), p2.getY()));
	}
}