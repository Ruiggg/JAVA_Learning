package People;

public class Student extends Person{
	private final String grade;
	public Student(String grade) {
		super("undef","undef","undef","undef");
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String toString() {
		return "Student: \n"+
				" Name:      "+getName()+"\n"+
				" Adress:    "+this.getAddress()+"\n"+
				" Telephone: "+this.getTelephoneNumber()+"\n"+
				" email:     "+this.getEmail()+"\n"+
				" Grade:     "+this.getGrade()+"\n";
	}
	//test
	public static void main(String[] args) {
		Student student = new Student("1");
		System.out.println(student.toString());
		Person person = new Person();
		System.out.println(person.toString());
	}
}