package People;

public class Person {
	private String name;
	private String address;
	private String telephoneNumber;
	private String email;
	
	public Person() {}
	public Person(String name,String address,String telephoneNumber,String email) {
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "Person: \n"+
				" Name:      "+getName()+"\n"+
				" Adress:    "+this.getAddress()+"\n"+
				" Telephone: "+this.getTelephoneNumber()+"\n"+
				" email:     "+this.getEmail()+"\n";
	}
}