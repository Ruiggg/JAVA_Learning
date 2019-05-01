import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class UseBigDecimal {
	
	public static void func1() {
		for(int i=100;i<=1000;i+=100) {
			BigDecimal r = new BigDecimal(0);
			for(int j=1;j<=i;j++) {
				BigDecimal d = new BigDecimal(1);
				BigDecimal base = new BigDecimal(factorial((long)j));
				d = d.divide(base, 31, BigDecimal.ROUND_UP);
				r = r.add(d);
			}
			System.out.println(r.toString().substring(0, r.toString().length()-6));
		}
	}
	
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for(int i = 1;i <= n; i++) {
			result = result.multiply(new BigInteger(i+""));
		}
		return result;
	}
	
	public static void main(String[] args) {
		func1();
	}
}