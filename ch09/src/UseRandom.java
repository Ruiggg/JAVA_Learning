import java.util.Random;

public class UseRandom {
	public static void main(String[] args) {
		long seed = 1000;
		Random r = new Random(seed);
		for(int i=1;i<=50;i++) {
			if(i%10==0)
				System.out.println(r.nextInt(100));
			else
				System.out.print(r.nextInt(100)+" ");
		}
	}
}