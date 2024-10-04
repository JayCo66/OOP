package Lab6_2;

public class Coffee extends Product{
	
	public Coffee(int p) {
		super(p);
		super.name = "Coffee";
		super.unit = "Gram";
	}
		
	public void setWeight(int w) {
		super.total = w;
	}

}
