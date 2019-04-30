import java.util.Scanner;

public class IntersectPoint {
	//1st line
	private MyPoint p1;
	private MyPoint p2;
	//2nd line
	private MyPoint q1;
	private MyPoint q2;
	//intersectPoint
	private MyPoint p;
	//constructor
	public IntersectPoint(MyPoint p1,MyPoint p2,MyPoint q1,MyPoint q2) {
		this.p1 = p1;
		this.p2 = p2;
		this.q1 = q1;
		this.q2 = q2;
	}
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public void setQ1(MyPoint q1) {
		this.q1 = q1;
	}
	public void setQ2(MyPoint q2) {
		this.q2 = q2;
	}
	public MyPoint getP1() {
		return p1;
	}
	public MyPoint getP() {
		return p;
	}
	public MyPoint getP2() {
		return p2;
	}
	public MyPoint getQ1() {
		return q1;
	}
	public MyPoint getQ2() {
		return q2;
	}
	public void setP() {
		double x1,y1,x2,y2,x3,y3,x4,y4;
		x1 = p1.getX();
		y1 = p1.getY();
		x2 = p2.getX();
		y2 = p2.getY();
		x3 = q1.getX();
		y3 = q1.getY();
		x4 = q2.getX();
		y4 = q2.getY();
		LinearEquation l = new LinearEquation(y1-y2,x2-x1,y3-y4,x4-x3,
				(y1-y2)*x1-(x1-x2)*y1,(y3-y4)*x3-(x3-x4)*y3);
		if(l.isSolvable()) {
			p = new MyPoint(l.getX(),l.getY());
		}else
			System.out.println("Warning:no solution!");
	}
	
	public static void main(String[] args) {
		/*double x1,y1,x2,y2,x3,y3,x4,y4;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1,y1,x2,y2,x3,y3.x4,y4: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		LinearEquation l = new LinearEquation(y1-y2,x2-x1,y3-y4,x4-x3,
				(y1-y2)*x1-(x1-x2)*y1,(y3-y4)*x3-(x3-x4)*y3);
		if(l.isSolvable()) {
			System.out.println("The intersecting point is at ("+(int)(l.getX()*100000)/100000.0+
					","+(int)(l.getY()*100000)/100000.0+")");
		}else
			System.out.println("The two lines are parallel.");*/
		MyPoint p1 = new MyPoint(1,1);
		MyPoint p2 = new MyPoint(3,3);
		MyPoint q1 = new MyPoint(-1,1);
		MyPoint q2 = new MyPoint(2,-2);
		IntersectPoint p = new IntersectPoint(p1, p2, q1, q2);
		p.setP();
		System.out.println("p: "+p.getP().getX()+","+p.getP().getY());
		System.out.println(p.getP().inLine(p1, p2));
	}
}
