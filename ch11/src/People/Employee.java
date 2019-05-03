package People;

public class Employee extends Person {
	private String workRoom;
	private double salary;
	private MyDate employDate;
	
	public Employee() {
		employDate = new MyDate();
	}
	public Employee(String workRoom,double salary,MyDate employDate) {
		this.workRoom = workRoom;
		this.salary = salary;
		this.employDate = employDate;
	}
	public Employee(String name,String address,String teleNumber,String email,
			String workRoom,double salary,MyDate employDate) {
		super(name,address,teleNumber,email);
		this.workRoom = workRoom;
		this.salary = salary;
		this.employDate = employDate;
	}
	
	public void setWorkRoom(String workRoom) {
		this.workRoom = workRoom;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setEmployDate(MyDate employDate) {
		this.employDate = employDate;
	}
	
	public String getWorlRoom() {
		return workRoom;
	}
	public double getSalary() {
		return salary;
	}
	public MyDate getEmployDate() {
		return employDate;
	}
	
	public String toString() {
		return "Employee: "+"\n Name: "+this.getName()+
				"\n Address: "+this.getAddress()+"\n Telephone: "+this.getTelephoneNumber()+
				"\n E-mail: "+this.getEmail()+"\n Room: "+this.getWorlRoom()+"\n salay: "+
				this.getSalary()+"\n EmployTime: "+this.getEmployDate().toString();
	}
	//test
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.toString());
	}
}