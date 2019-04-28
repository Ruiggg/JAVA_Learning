
public class MyInteger {
	private int value;
	//constructor
	public MyInteger(int i) {
		value = i;
	}
	//get
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		if(value%2==0)
			return true;
		else
			return false;
	}
	public boolean isOdd() {
		if(value%2==1)
			return true;
		else
			return false;
	}
	public boolean isPrime() {
		if(value==1)	return false;
		int i;
		for(i=2;i*i<=value;i++) {
			if(value%i==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int v) {
		if(v % 2==0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int v) {
		if(v%2==1)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int v) {
		if(v==1)	return false;
		int i;
		for(i=2;i*i<=v;i++) {
			if(v%i==0)
				return false;
		}
		return true;
	}
	public boolean equals(int n) {
		if(value == n)
			return true;
		else
			return false;
	}
	public boolean equals(MyInteger integer) {
		if(integer.getValue() == value) {
			return true;
		}
		else
			return false;
	}
	//static method
	public static int parseInt(char[] chars) {
		String s = new String(chars);
		return Integer.parseInt(s);
	}
	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}
	//test
	public static void main(String[] args) {
		MyInteger i = new MyInteger(123);
		char[] ch = new char[3];
		ch[0]='1';
		ch[1]='2';
		ch[2]='4';
		MyInteger j = new MyInteger(124);
		System.out.println("Static methods: "+MyInteger.parseInt("123")+" "+MyInteger.parseInt(ch));
		System.out.println("Static methods: "+MyInteger.isEven(5)+" "+MyInteger.isPrime(7));

	}
}