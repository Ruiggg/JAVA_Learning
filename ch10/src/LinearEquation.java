import java.util.Scanner;

public class LinearEquation {
	private double a,b,c,d,e,f;
	//constructor
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;		
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public double getD() {
		return this.d;
	}
	public double getE() {
		return this.e;
	}
	public double getF() {
		return this.f;
	}
	//set
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	public void setD(double d) {
		this.d = d;
	}
	public void setE(double e) {
		this.e = e;
	}
	public void setF(double f) {
		this.f = f;
	}
	//methods
	public boolean isSolvable() {
		if(a*d-b*c!=0.0)
			return true;
		else	
			return false;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
	//test
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a b c d e f: ");
		LinearEquation l = new LinearEquation(input.nextDouble(),input.nextDouble(),
				input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		if(l.isSolvable()) {
			System.out.println("X = "+l.getX());
			System.out.println("Y = "+l.getY());
		}else
			System.out.println("The equation has no solution.");
	}
}