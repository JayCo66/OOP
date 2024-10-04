package Lab7_1;

public abstract class Ball {
	
	protected String treadMark;
	
	public Ball(String treadMark) {
		this.treadMark = treadMark;
	}
	
	public abstract void inflate(double volume);

}
