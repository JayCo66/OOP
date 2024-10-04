package Lab6_2;

public  class Milk extends Product {
	
	public Milk(int p) {
		super(p);
		super.name = "Milk";
		super.unit = "CC";
	}
	
	public void setVolumn(int v) {
		super.total = v;
	}

}
