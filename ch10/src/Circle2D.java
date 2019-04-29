public class Circle2D {
	private double x;
	private double y;
	private double radius;
	//constructor
	public Circle2D(double x,double y,double r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}
	public Circle2D() {
		this(0,0,1);
	}
	//get
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*(x+y);
	}
	public boolean contains(double x,double y) {
		return ((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y) < radius*radius);
	}
	public boolean contains(Circle2D c) {
		return ((c.x-this.x)*(c.x-this.x)+(c.y-this.y)*(c.y-this.y) < (c.radius-radius)*(c.radius-radius)); 
	}
	public boolean overlaps(Circle2D c) {
		return ((c.x-this.x)*(c.x-this.x)+(c.y-this.y)*(c.y-this.y) < (c.radius+radius)*(c.radius+radius)); 
	}
	//test
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2,2,5.5);
		System.out.println("Area:      "+(int)(c1.getArea()*100)/100.0);
		System.out.println("Perimeter: "+c1.getPerimeter());
		System.out.print(c1.contains(3,3)+" "+c1.contains(new Circle2D(4,5,10.5))+" "+
						 c1.overlaps(new Circle2D(3,5,2.3)));
	}
}