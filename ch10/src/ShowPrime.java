public class ShowPrime {
	public static void main(String[] args) {
		StackOfIntegers sk = new StackOfIntegers();
		for(int i=2;i<=120;i++) {
			MyInteger j = new MyInteger(i);
			if(j.isPrime())
				sk.push(i);				
		}
		int size = sk.getSize();
		for(int k=0; k<size; k++) {
			System.out.print(sk.pop()+" ");
		}		
	}
}