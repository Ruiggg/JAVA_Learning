public class MyString1 {
	private char[] string;
	
	public MyString1(char[] s) {
		string = new char[s.length];
		int i = 0;
		for(char e:s) {
			string[i] = e;
			i++;
		}
	}
	
	public char charAt(int index) {
		return string[index];
	}
	
	public int length() {
		return string.length;
	}
	
	public MyString1 substring(int begin,int end) {
		char [] s = new char[end-begin];
		for(int i=begin;i<end;i++) {
			s[i-begin] = string[i];
		}
		return new MyString1(s);
	}
	
	public MyString1 tolowerCase() {
		char[] s = new char[length()];
		for(int i=0;i<s.length;i++) {
			if(string[i]<='Z'&&string[i]>='A') {
				char ch = string[i];
				ch = (char)((int)ch - (int)'A');
				s[i] = ch;
			}else
				s[i] = string[i];
		}
		return new MyString1(s);
	}
	
	public boolean equals(MyString1 s) {
		if(s.length()!=string.length) return false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=string[i])
				return false;
		}
		return true;
	}
	
	public static MyString1 valueOf(int i) {
		if(i==0) {
			char[] m = {'0'};
			return new MyString1(m);
		}
		int tem = i;
		if(i<0) i = -i;
		char[] s = new char[20];
		int j = 0;
		while(i>0) {
			s[j] = (char)(i%10 + (int)'0');
			j++;
			i = i/10;
		}

		for(int right = j-1,left = 0;left<right;left++,right--) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
		}
		if(tem < 0) {
			for(int p=j-1;p>=0;p--) {
				s[p+1]=s[p];
			}
			s[0] = '-';
		}
		char[] ret = new char[tem < 0? j+1:j];
		for(int b=0;b<ret.length;b++) {
			ret[b] = s[b];
		}
		return new MyString1(ret);
	}
	//test
	public static void main(String[] args) {
		MyString1 s = MyString1.valueOf(-231123);
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
		char[] s1 = {'H','e','l','l','o'};
		MyString1 s2 = new MyString1(s1);
		for(int i=0;i<s2.length();i++) {
			System.out.print(s2.charAt(i));
		}
		char[] s3 = {'H','e','l','l','o'};
		System.out.println(s2.equals(new MyString1(s3)));
	}
	
	
}