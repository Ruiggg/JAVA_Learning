import java.util.*;

public class NewMyStack {
	private ArrayList<Object> stack = new ArrayList<>();
	
	//constructor
	public NewMyStack() {};
	
	public void push(Object obj) {
		stack.add(obj);
	}
	public Object pop() {
		Object tem = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return tem;
	}
	public Object getTop() {
		return stack.get(stack.size()-1);
	}
	
	//test
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NewMyStack stack = new NewMyStack();
		System.out.println("Enter five strings: ");
		for(int i=0;i<5;i++) {
			String s = input.nextLine();
			stack.push(s);
		}
		System.out.println("The strings are: ");
		for(int i=0;i<5;i++) {
			Object tem = stack.pop();
			if(tem instanceof String)
				System.out.println((String)tem);
		}
	}
}