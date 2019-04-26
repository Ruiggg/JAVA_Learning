//import java.util.*;
public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	//constructor
	public RegularPolygon() {}
	public RegularPolygon(int n,double side) {
		this.n = n;
		this.side = side;
	}
	public RegularPolygon(int n,double side,double x,double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	//visit
	public int getN() {
		return n;
	}
	public double getSide() {
		return side;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	//set
	public void setN(int n) {
		this.n = n;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	//methods
	public double getPerimeter() {
		return n*side;
	}
	public double getArea() {
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
	//test
	public static void main(String[] args) {
		RegularPolygon r1 = new RegularPolygon(6,4);
		RegularPolygon r2 = new RegularPolygon(10,4,5.6,7.8);
		RegularPolygon r3 = new RegularPolygon();
		
		System.out.println("r1: "+(int)(r1.getPerimeter()*100)/100.0+" "+(int)(r1.getArea()*100)/100.0);
		System.out.println("r2: "+(int)(r2.getPerimeter()*100)/100.0+" "+(int)(r2.getArea()*100)/100.0);
		System.out.println("r3: "+(int)(r3.getPerimeter()*100)/100.0+"  "+(int)(r3.getArea()*100)/100.0);

	}
}