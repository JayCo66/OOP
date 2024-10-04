package Lab6_3;

public class HourlySalary extends Employees {
	
	protected double hourlypay;
	protected double hourswork;
	
	public HourlySalary(String f, String l, String ssn, double hp, double hw) {
		super(f,l,ssn);
		this.hourlypay = hp;
		this.hourswork = hw;
	}
	
	public double earnings() {
		return hourlypay * hourswork;
	}
	
	public String toString() {
		return String.format("%s %s\nsocial security number: %s\nhour pay: $%.2f ; hour work %.2f ;"
									,firstName, lastName, securityNumber,hourlypay,hourswork);
		}

}
