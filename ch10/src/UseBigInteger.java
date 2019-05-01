import java.math.BigInteger;

public class UseBigInteger {
	public static void func1() {//10.16
		BigInteger a = new BigInteger("1");
		final BigInteger one = new BigInteger("1");
		final BigInteger two = new BigInteger("2");
		final BigInteger three = new BigInteger("3");
		int i=0;
		while(i<10) {
			if(a.mod(two).intValue()==0 || a.mod(three).intValue()==0) {
				String base  = "0";
				for(int j=0;j<50;j++) {
					base = base + "0";
				}
				String end = base.substring(0, base.length()-a.toString().length())+a.toString();
				System.out.println(end);
				i++;
			}
			a = a.add(one);
		}
	}
	public static void func2() {//10.17
		final BigInteger one = new BigInteger("1");
		Integer b = new Integer((int)Math.pow(Long.MAX_VALUE,0.5)+1);
		BigInteger a = new BigInteger(b.toString());
		for(int i=0;i<10;i++) {
			System.out.println(a.multiply(a));
			a = a.add(one);
		}
	}
	public static void func3() {//10.18
		String num = Long.MAX_VALUE +"";	//骚操作
		BigInteger end = new BigInteger(num+"0");
		BigInteger p = new BigInteger(num);
		BigInteger one = new BigInteger("1");
		//BigInteger zero = new BigInteger("0");
		for(int i=0;i<5 && p.compareTo(end)<=0;) {
			if(p.isProbablePrime(40)) {
				System.out.println(p.toString());
				i++;
			}
			p=p.add(one);
		}
	}
	private static boolean IsBigPrime(BigInteger p){
		BigInteger one = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		for(BigInteger i = new BigInteger("2");i.multiply(i).compareTo(p)<=0;i=i.add(one)) {
			//System.out.println(i);
			if(p.mod(i).equals(zero)) return false;	
		}
		return true;
	}
	
	public static void func4() {//10.20
		int p = 2;
		while(p<=100) {
			BigInteger MersenneNumber = new BigInteger("2");
			MersenneNumber = MersenneNumber.pow(p).subtract(new BigInteger("1"));
			if(MersenneNumber.isProbablePrime(60))
				System.out.println(MersenneNumber);
			p++;
		}
	}
	public static void func5() {//10.21
		BigInteger n = new BigInteger(Long.MAX_VALUE+"");
		BigInteger one = new BigInteger("1");
		BigInteger five = new BigInteger("5");
		BigInteger six = new BigInteger("6");
		BigInteger zero = new BigInteger("0");

		n = n.add(one);
		for(int i=0;i<10;) {
			if(n.mod(five).compareTo(zero)==0 || n.mod(six).compareTo(zero)==0) {
				System.out.println(n);
				i++;
			}
			n = n.add(one);
		}
	}
	public static void main(String[] args) {
		//func1();
		//func2();
		//func3();
		//func4();
		func5();
	}
}