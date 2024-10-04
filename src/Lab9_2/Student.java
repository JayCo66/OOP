package Lab9_2;

public class Student {
	private String name;
	private String gpa;
	
	public Student (String name,String gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public class IncompleteException extends Exception {
		public IncompleteException() {
			super("IncompleteException: (grade I is incomplete) can not display.");
		}
	}
	
	public class DigitException extends Exception {
		public DigitException() {
			super("DigitException: (digit is not allowed in name) can not display.");
		}
	}
	
	public class SpaceException extends Exception {
		public SpaceException() {
			super("SpaceException: (space is not allowed in name) can not display.");
		}
	}
	
	public class GradeException extends Exception {
		public GradeException() {
			super("GradeException: (grade must be A B C D E F) can not display");
		}
	}
	
	public void calGPA() throws IncompleteException, DigitException, SpaceException, GradeException{
		if(gpa.contains("I")) throw new IncompleteException();
		if(name.matches(".*\\d.*")) throw new DigitException();
		if(name.contains(" "))  throw new SpaceException();
		if(!gpa.matches("[ABCDEF]*")) throw new GradeException();
		int total = 0;
		float grade = 0;
		for(char c : gpa.toCharArray()) {
			if(c == 'A') grade += 4;
			else if(c == 'B') grade += 3;
			else if(c == 'C') grade += 2;
			else if(c == 'D') grade += 1;
			else if(c == 'F') grade += 0;
			total++;
		}
		System.out.println(this.name + " Registered " + total + " Subjects and got GPA " + grade/total);
	}
	
	public void show() {
		try {
			calGPA();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
