import java.util.Scanner;

public class Triangle2D {
	private MyPoint p1,p2,p3;
	//constructor
	public Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public Triangle2D() {
		this(new MyPoint(0,0),new MyPoint(1,1),new MyPoint(2,5));
	}
	//get
	public MyPoint getP1() {
		return p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	//set
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
	//others
	public double getArea() {
		return 0.5*(p1.getX()*p2.getY()-p2.getX()*p1.getY()+p2.getX()*p3.getY()-p3.getX()*p2.getY()
				+p3.getX()*p1.getY()-p1.getX()*p3.getY());
	}
	public double getPerimeter() {
		return p1.distance(p2)+p2.distance(p3)+p3.distance(p1);
	}
	public boolean contains(MyPoint p) {
		IntersectPoint intersect = new IntersectPoint(p, p1, p2, p3);
		intersect.setP();
		MyPoint in = intersect.getP();
		if(in.inLine(p2, p3)) return false;
		
		intersect = new IntersectPoint(p, p2, p1, p3);
		intersect.setP();
		in = intersect.getP();
		if(in.inLine(p1, p3)) return false;
		
		intersect = new IntersectPoint(p, p3, p1, p2);
		intersect.setP();
		in = intersect.getP();
		if(in.inLine(p1, p2)) return false;
		
		return true;
	}
	public boolean contains(Triangle2D t) {
		return ( contains(t.getP1())  &&  contains(t.getP2())  &&  contains(t.getP3())  );
	}
	public boolean overlaps(Triangle2D t) {
		//I can't do it
		return true;
	}
	//test
	public static void main(String[] args) {
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5));
		System.out.println("Area: "+t1.getArea());
		System.out.println("Perimeter: "+t1.getPerimeter());
		System.out.println(t1.contains(new MyPoint(3,3)));
		System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9,2), new MyPoint(4,1), new MyPoint(2,5.5))));
		System.out.println(t1.overlaps(new Triangle2D(new MyPoint(), new MyPoint(), new MyPoint())));
	}
}