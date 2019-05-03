package People;

public class Faculty extends Employee {
	private int workTime;
	private String grade;
	
	public Faculty() {}
	public Faculty(int workTime,String grade) {
		this.workTime = workTime;
		this.grade = grade;
	}
	public Faculty(String name,String address,String teleNumber,String email,String workRoom,
			double salary,MyDate employDate,int workTime,String grade) {
		super(name,address,teleNumber,email,workRoom,salary,employDate);
		this.workTime = workTime;
		this.grade = grade;
	}
	
	public String toString() {
		return "Faculty: "+"\n Name: "+this.getName()+
				"\n Address: "+this.getAddress()+"\n Telephone: "+this.getTelephoneNumber()+
				"\n E-mail: "+this.getEmail()+"\n Room: "+this.getWorlRoom()+"\n salay: "+
				this.getSalary()+"\n EmployTime: "+this.getEmployDate().toString()+
				"\n workTime: "+workTime+" days\n "+"garde: "+grade;
	}
	
	//test
	public static void main(String[] args) {
		Faculty faculty = new Faculty();
		System.out.println(faculty.toString());
	}
	
}