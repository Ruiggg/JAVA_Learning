public class RandomPoint{
	public static void main(String[] args) {
		int r = 40;
		//the 2 angels
		double radian1 = Math.random()*2*Math.PI;
		double radian2 = Math.random()*2*Math.PI;
		double radian3 = Math.random()*2*Math.PI;		
		//the coordinates
		double x1 = r*Math.cos(radian1);
		double y1 = r*Math.sin(radian1);
		double x2 = r*Math.cos(radian2);
		double y2 = r*Math.sin(radian2);
		double x3 = r*Math.cos(radian3);
		double y3 = r*Math.sin(radian3);
		//calculate the length of sides
		double a = Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1),0.5);
		double b = Math.pow((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1),0.5);
		double c = Math.pow((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3),0.5);
		//calculate the angels
		double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
		double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
		double C = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*b*a)));
		//print
		System.out.println("A = " + Math.round(A*100)/100.0 + 
						   ", B = "+ Math.round(B*100)/100.0 + 
						   ", C = "+ Math.round(C*100)/100.0);
	}
}