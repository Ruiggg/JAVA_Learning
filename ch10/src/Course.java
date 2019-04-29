

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	public static final int DEFAULT_CAPACITY = 100;
	public static final int INCREMENT= 10;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if(numberOfStudents>=100) {
			String[] tem = new String[students.length + INCREMENT];
			System.arraycopy(student, 0, tem, 0, student.length());
			students = tem;
		}
		students[numberOfStudents++] = student;
	}
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		for(int i=0;i<numberOfStudents;i++) {
			if(student.equals(students[i])) {
				for(int j=i+1;j<numberOfStudents;j++) {
					students[j-1] = students[j];
				}
				numberOfStudents--;
				break;
			}//if
		}//for
	}
	public void clear() {
		this.students = null;
		numberOfStudents = 0;
	}
	//test
	public static void main(String[] args) {
		Course math = new Course("math");
		math.addStudent("ZZY");
		math.addStudent("Sam");
		math.addStudent("Tom");
		String[] s = math.getStudents();
		for(int i=0;i<math.getNumberOfStudents();i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println("---");
		math.dropStudent("Sam");
		s = math.getStudents();
		for(int i=0;i<math.getNumberOfStudents();i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println("---");
		math.clear();
		s = math.getStudents();
		for(int i=0;i<math.getNumberOfStudents();i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println("---");
	}
}