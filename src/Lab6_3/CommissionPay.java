package Lab6_3;

public class CommissionPay extends Employees {
	protected double grosssale;
	protected double CMR;
	
	public CommissionPay(String f,String l, String ssn, double gr, double CMR) {
		super(f,l,ssn);
		this.grosssale = gr;
		this.CMR = CMR;
	}
	
	public double earnings() {
		return grosssale * CMR;
	}
	
	public String toString() {
		return String.format("%s %s\nsocial security number: %s\ngross sales: $%.2f; commission rate %.2f;"
				,firstName, lastName, securityNumber,grosssale,CMR);
		}

}
