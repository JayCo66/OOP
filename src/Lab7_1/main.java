package Lab7_1;

public class main {
	
	public static void TestBall(Ball b,double volume) {
		System.out.println(b);
		b.inflate(volume);
		((BallA) b).roll();
	}

	public static void main(String[] args) {
		BallA B1 = new BallA("Zentia");
		BallB B2 = new BallB("Zapphire");
		BallC B3 = new BallC("Zenith");
		
		TestBall(B1,1.0);
		TestBall(B2,1.1);
		TestBall(B3,1.2);
	}

}
