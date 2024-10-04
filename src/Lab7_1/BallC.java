package Lab7_1;

public class BallC extends BallA{
	
	public BallC(String tm) {
		super(tm);
	}
	
	public String toString() {
		return(this.treadMark + " is a treadMark of BallC.");
	}
	
	public void inflate(double volume) {
		System.out.println(this.treadMark + "'s ball is inflated " + volume + " cu.ft.");
		
	}
	
	public void roll() {
		System.out.println(this.treadMark + " rolls very smoothly.");
	}

}
