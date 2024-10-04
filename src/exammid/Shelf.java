package exammid;

public class Shelf {
	private String id;
	private int row;
	private int col;
	private Books[][] inShelf;
	
	public Shelf(String id, int row, int col) {
		this.id = id;
		this.row = row;
		this.col = col;
		this.inShelf = new Books[row][col];
	}
	
	public void addBook(Books b) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(inShelf[i][j] == null) {
					inShelf[i][j] = b;
					inShelf[i][j].setStatus("At Shelf");
				}	
			}
		}
	}

	public Books[][] getAllBook() {
		return inShelf;
	}

	public void setAllBook(Books[][] inShelf) {
		this.inShelf = inShelf;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Books[][] getInShelf() {
		return inShelf;
	}

	public void setInShelf(Books[][] inShelf) {
		this.inShelf = inShelf;
	}
	
	
	
	

}
