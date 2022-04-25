package inventory;

public class Inventory {
	
	private static int counter = 0;
	
	protected int id = 0;

	private int ISBN;

	private Genre Genre;

	private String AlphabetCategory;
	
public Inventory(){
		
		/*
		 * There are no setters for the animal's id because it can only be 
		 * set once in the default constructor, based on the Zoo animal count.
		 */
		Inventory.counter++;
		this.id = Inventory.counter;
	}

public Inventory(int ISBN, Genre genre, String AlphabetCategory ) {
	
	this();
	
	this.setISBN(ISBN);
	this.setGenre(genre);
	this.setAlphabetCategory(AlphabetCategory);
	

}

	private void setAlphabetCategory(String AlphabetCategory) {
		if (AlphabetCategory == toString()) {
			this.AlphabetCategory = AlphabetCategory; 
		}
		else
			this.AlphabetCategory = "Invalid";  
	
}

	private void setISBN(int ISBN) {
		if (ISBN >= 500) {
			this.ISBN = ISBN;	
		}
		else 
			this.ISBN = 300;
	}
	
	private void setGenre(Genre genre) {
		this.Genre = genre;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
