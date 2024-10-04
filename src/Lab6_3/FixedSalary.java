package Lab6_3;
import Lab8_1.*;

public class FixedSalary extends Employees {
	
	protected double Msalary;
	private SavingsAccount.DebitCard Card;
	
	
	public FixedSalary(String f, String l, String ssn, double sa) {
		super(f,l,ssn);
		this.Msalary = sa;
		
	}
	
	public double earnings() {
		return Msalary;
	}
	
	public String toString() {
		return String.format("%s %s\nsocial security number: %s\nmonthly salary $%.2f", 
								firstName, lastName, securityNumber, Msalary);
		}
	
	public SavingsAccount.DebitCard getCard() {
		return Card;
	}
	
	public void setCard(SavingsAccount.DebitCard card) {
		this.Card = card;
	}
	
}
