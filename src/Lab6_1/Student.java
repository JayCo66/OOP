package Lab6_1;

public class Student {
	
	protected String name;
	protected int id;
	protected double gpa;
	
	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public Student(int id, double gpa) {
		this.id = id;
		this.name = "";
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public double getGPA() {
		return gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Student:\n"
				+ "ID: " +id
				+ "\nName: " +name
				+ "\nGPA: " +gpa;
	}
	
}
