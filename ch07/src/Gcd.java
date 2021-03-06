public class Gcd {
	public static void main(String[] args) {
		int gcd = Mulgcd(12,18,24,30);
		System.out.println(gcd);
	}
	
	public static int Mulgcd(int...numbers) {
		int temGcd = 1;
		for(int i = 1; i<maxNum(numbers); i++) {
			int sign = 0;
			for(int j=0;j<numbers.length;j++) {
				if(numbers[j]%i != 0) {
					sign = 1;
					break;
				}
			}
			if(sign==0 && i>temGcd)
				temGcd = i;
		}
		return temGcd;
	}
	
	public static int maxNum(int[] numbers) {
		int max = numbers[0];
		for(int k=0;k<numbers.length;k++) {
			if(numbers[k]>max)
				max = numbers[k];
		}
		return max;
	}
}