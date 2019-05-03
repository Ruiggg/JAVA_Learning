import java.util.Scanner;

public class TriangleFromSimpleGeometricObject extends SimpleGeometricObject{
	private double side1,side2,side3;
	//constructor
	public TriangleFromSimpleGeometricObject(double side1,double side2,double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public TriangleFromSimpleGeometricObject() {
		this(1,1,1);
	}
	//get-methods
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	//Area
	public double getArea() {
		double s = (side1+side2+side3)/2.0;
		return Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
	}
	//getPerimeter
	public double getPerimeter() {
		return side1+side2+side3;
	}
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	//test
	public static void main(String[] args) {
		System.out.print("Enter three sides, color, and isfilled(boolean): ");
		Scanner input = new Scanner(System.in);
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		TriangleFromSimpleGeometricObject t = new TriangleFromSimpleGeometricObject(s1,s2,s3);
		t.setColor(input.next());
		t.setFilled(input.hasNextBoolean());
		System.out.println(t.toString()+"\ncolor: " + t.getColor() + "\nIsfilled: " + t.isFilled());
	}
}