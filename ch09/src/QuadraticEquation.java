
public class QuadraticEquation {
	private double a,b,c;
	//constructor
	public QuadraticEquation(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		if(getDiscriminant()>=0)
			return (Math.pow(b*b-4*a*c, 0.5)-b)/(2*a);
		else
			return 0;
	}
	public double getRoot2() {
		double delta = getDiscriminant();
		if(delta>=0)
			return -(Math.pow(b*b-4*a*c, 0.5)+b)/(2*a);
		else
			return 0;
	}
	//test
	public static void main(String[] args) {
		QuadraticEquation q = new QuadraticEquation(1,2,1);
		double d = q.getDiscriminant();
		if(d>0) {
			System.out.println("r1: "+q.getRoot1());
			System.out.println("r2: "+q.getRoot2());
		}else if(d==0)
			System.out.println("r: "+q.getRoot1());
		else
			System.out.println("The equation has no roots.");	
	}
}