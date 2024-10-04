package Lab6_2;

public class Sugar extends Product {

	public Sugar(int p) {
		super(p);
		super.name = "Sugar";
		super.unit = "Gram";
	}
	
	public void setWeight(int w) {
		super.total = w;
	}
}
