
public class Rectangle {
	private double weight=1;
	private double width=1;
	//constructors
	public Rectangle() {}
	public Rectangle(double weight,double width) {
		this.weight = weight;
		this.width = width;
	}
	//methods
	public double getArea() {
		return (weight*width);
	}
	public double getPerimeter() {
		return 2*(weight+width);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(1.1,1.2);
		System.out.println("Area: "+r.getArea()+" Perimeter: "+r.getPerimeter());
	}
	
}