package Lab6_1;

public class Graduate extends Student {

	protected String thesisTitle;
	
	public Graduate (int id, String name, double gpa, String thesis) {
		super(id,name,gpa);
		this.thesisTitle = thesis;
	}

	public String getThesisTitle() {
		return thesisTitle;
	}

	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	
	public String toString() {
		return "Graduate Student:\n"
				+ "ID: " +id
				+ "\nName: " +name
				+ "\nGPA: " +gpa
				+ "\nThesis: " +thesisTitle;
	}
}
