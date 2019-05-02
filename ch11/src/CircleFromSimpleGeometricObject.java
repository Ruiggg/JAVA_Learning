//(1)the private data field of father class can not be directly visited by the son class 
//and can not be visited even create a father object
//(2)the public things of the father class can be directly visited
//(means no need to create a father object)
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
	private double radius;
	
	public CircleFromSimpleGeometricObject() {};
	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	};
	public CircleFromSimpleGeometricObject(double radius,String color,boolean filled) {
		this.radius = radius;
		setColor(color);	//can't assign it directly
		setFilled(filled);	//the super class seems like a concomitant class
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getDiameter() {
		return 2*radius*Math.PI;
	}
	
	public String toString() {
		return "A circle "+super.toString() + "\nradius is "+radius;
	}
	
	public void printCircle() {
		System.out.println("The circle is created "+getDateCreate()+"and the radius is "+radius);
	}// You can use the public methods in the super class straightly, not needing to create an object
}