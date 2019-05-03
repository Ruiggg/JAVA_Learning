package People;

public class Staff extends Employee{
	private String title;
	
	public Staff() {}
	public Staff(String name,String address,String teleNumber,String email,
			String workRoom,double salary,MyDate employDate,String title) {
		super(name,address,teleNumber,email,workRoom,salary,employDate);
		this.title = title;
	}
	public String toString() {
		return "Staff:"+
				"\n Name:       "+this.getName()+
				"\n Address:    "+this.getAddress()+
				"\n Telephone:  "+this.getTelephoneNumber()+
				"\n E-mail:     "+this.getEmail()+
				"\n Room:       "+this.getWorlRoom()+
				"\n salay:      "+this.getSalary()+
				"\n EmployTime: "+this.getEmployDate().toString()+
				"\n title:      "+this.title;
	}
	//test
	public static void main(String[] args) {
		Staff staff = new Staff();
		System.out.println(staff.toString());
	}
}

//我遇见谁会有怎样的对白

//我等的人他在多远的未来

//我听见风来自地铁和人海

//我排著队拿著爱的号码牌

//go to sleep !