package Lab9_1;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int num[] = {1, 2, 3, 4};
		
		try {
			System.out.println(num[5]);
		}catch (ArrayIndexOutOfBoundsException Arr) {

		}
		
		for(int i : num){
		System.out.println(i);
		}
	}
}
