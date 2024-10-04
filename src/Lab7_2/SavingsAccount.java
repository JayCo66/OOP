package Lab7_2;
import Lab6_3.*;


public class SavingsAccount extends BaseAccount{
	
	private DebitCard card;
	
	public SavingsAccount(FixedSalary A) {
		super(0);
		this.card = new DebitCard(A.getssn());		
		A.setCard(card);
	}
	
	public boolean deposit(double i) {
		if(i > 0) {
			balance += i;
			return true;
		}else
			return false;
	}
	
	public boolean withdraw(double o) {
		if(balance >= o) {
			balance -= o;
			return true;
		}else
			return false;
	}

}
