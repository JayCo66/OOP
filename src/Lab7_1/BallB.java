package Lab7_1;

public class BallB extends BallA{
	
	public BallB(String tm) {
		super(tm);
	}
	
	public String toString() {
		return(this.treadMark + " is a treadMark of BallB.");
	}
	
	public void inflate(double volume) {
		System.out.println(this.treadMark + "'s ball is inflated " + volume + " cu.ft.");
	}
	
	public void roll() {
		System.out.println(this.treadMark + " rolls smoothly.");
	}

}
