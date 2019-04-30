import java.util.Scanner;

public class MyRectangle2D {
	//data:
	private double x,y;
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	//data:
	private double width,height;
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//constructor
	public MyRectangle2D(double x,double y,double width,double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public MyRectangle2D() {
		this(0,0,1,1);
	}
	//other
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2.0*(width+height);
	}
	public boolean contains(double x,double y) {
		return x>this.x-width/2.0 && x<this.x+width/2.0 && y<this.y+height/2.0 && y>this.y-height/2.0;
	}
	public boolean contains(MyRectangle2D r) {
		return contains(r.x-width/2.0,r.y-height/2.0)&&contains(r.x-width/2.0,r.y+height/2.0)&&
				contains(r.x+width/2.0,r.y-height/2.0)&&contains(r.x+width/2.0,r.y+height/2.0);
	}
	public boolean overlaps(MyRectangle2D r) {
		return contains(r.x-width/2.0,r.y-height/2.0)||contains(r.x-width/2.0,r.y+height/2.0)||
				contains(r.x+width/2.0,r.y-height/2.0)||contains(r.x+width/2.0,r.y+height/2.0);
	}
	//static
	public static MyRectangle2D getRectangle(double[][] points) {
		//double[i][0]:x
		//double[i][1]:y
		double max_x = points[0][0];
		double min_x = points[0][0];
		double max_y = points[0][1];
		double min_y = points[0][1];
		//find the max and min of x,y
		for(int i=0;i<points.length;i++) {
			if(points[i][0]>max_x)
				max_x = points[i][0];
			if(points[i][0]<min_x)
				min_x = points[i][0];
			if(points[i][1]>max_y)
				max_y = points[i][1];
			if(points[i][1]<min_y)
				min_y = points[i][1];
		}
		//assign to MyRectangle2D
		MyRectangle2D m = new MyRectangle2D();
		m.setX((max_x+min_x)/2.0);
		m.setY((max_y+min_y)/2.0);
		m.setHeight(max_y-min_y);
		m.setWidth(max_x-min_x);
		return m;
	}
	//test
	public static void main(String[] args) {
	/*	MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println("Area: "+(int)(r1.getArea()*100)/100.0);
		System.out.println("Perimeter: "+r1.getPerimeter());
		System.out.println(r1.contains(3,3));
		System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	*/
		Scanner input = new Scanner(System.in);
		double[][] points = new double[5][2];
		System.out.print("Enter five points: ");
		for(int i=0;i<2*5;i++) {
			points[i/2][i%2] = input.nextDouble();
		}
		MyRectangle2D r = MyRectangle2D.getRectangle(points);
		System.out.println("The bounding rectangle's center ("+(int)(r.getX()*100)/100.0 +","+(int)(r.getY()*100)/100.0
				+"), width "+(int)(r.getWidth())/100.0 +", height "+(int)(r.getHeight()*100)/100.0);
	}
}