import java.util.Scanner;

public class IntersectPoint {
	public static void main(String[] args) {
		double x1,y1,x2,y2,x3,y3,x4,y4;
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
			System.out.println("The two lines are parallel.");
	}
}
