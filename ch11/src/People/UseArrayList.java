package People;
import java.util.*;

public class UseArrayList {
	public static void suffle(ArrayList<Object> list) {
		if(list==null) return;
		for(int i=0;i<list.size();i++) {
			int j = (int)(Math.random()*list.size());
			Object tem = list.get(i);
			list.set(i, list.get(j));
			list.set(j, tem);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		Student student = new Student("1");
		Staff staff = new Staff();
		Faculty faculty = new Faculty();
		list.add(student);
		list.add(faculty);
		list.add(staff);
		suffle(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString()+"\n");
		}
	}
}