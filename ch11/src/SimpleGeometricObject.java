import java.util.*;
public class SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	/** Construct a default geometric object */
	public SimpleGeometricObject() {
		dateCreated = new Date();
	}
	//constructor
	public SimpleGeometricObject(String color,boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	//get
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {//the get-method returns boolean should be named isXxxx
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreate() {
		return dateCreated;
	}
	public String toString() {
		return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
	}
}