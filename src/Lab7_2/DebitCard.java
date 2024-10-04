package Lab7_2;

public class DebitCard extends Card {
	
	private double discount;
	
	public DebitCard(String ssn) {
		super(ssn);
		this.type = "visa";
		this.discount = 2.5;
		
	}
	
	public String type() {
		return (this.type);
	}
	
	public double getDiscount() {
		return this.discount;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

}
