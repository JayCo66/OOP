package exammid;

public class Library {
	private String name;
	private int shelfLimit;
	private Shelf shelfsInLib[];
	private int count;
	
	public Library(String name, int shelfLimit) {
		this.name = name;
		this.shelfLimit = shelfLimit;
		this.shelfsInLib = new Shelf[shelfLimit];
		this.count = 0;
	}
	
	public Books getBook(Books b) {
		for(int i=0; i<shelfLimit; i++) {
			Books book[][] = shelfsInLib[i].getAllBook();
			for(Books[] olo : book) {
				for(Books j : olo) {
					if(j.getName().equals(b.getName())) {
						j.setStatus("Borrow");
						return b;
					}
				}
			}
			
		}
	}
	
	public void addShelf(Shelf s) {
		if(count < shelfLimit) {
			shelfsInLib[count] = s;
			count++;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShelfLimit() {
		return shelfLimit;
	}

	public void setShelfLimit(int shelfLimit) {
		this.shelfLimit = shelfLimit;
	}
	
	
	
	

}
