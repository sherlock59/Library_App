/*
 * 
 */

package inventory;

public class Inventory {
	
	private static final String String = null; // experiement 

	private static int counter = 0;
	
	/**
	 * Default Inventory type is Inventory, but this should always get changes
	 * in the subclasses (child class / derived class).  It's final so it 
	 * can't be internally changed.
	 */
	final public String type = "Inventory"; 
	
	protected int id = 0;

	protected int IBSN = 0;

	protected Genre Genre = null;

	protected String AlphabetCategory = null;
	
public Inventory(){
		
		/*
		 * There are no setters for the animal's id because it can only be 
		 * set once in the default constructor, based on the Zoo animal count.
		 */
		Inventory.counter++;
		this.id = Inventory.counter;
	}

public Inventory(int IBSN, Genre genre, String AlphabetCategory ) {
	
	this();
	
	this.setIBSN(IBSN);
	this.setGenre(Genre);
	this.setAlphabetCategory(AlphabetCategory);
}

public int getIBSN() {
	return this.IBSN;
}

public String getAlphabetCategory() {
	return this.AlphabetCategory;
}

	public void setAlphabetCategory(String AlphabetCategory) {
		if (AlphabetCategory == toString()) 
			this.AlphabetCategory = AlphabetCategory; 
		else
			this.AlphabetCategory = String;  
    }
	
	//public String getAlphabetCategory() {
	//	return this.AlphabetCategory;
	//}

	public void setIBSN(int IBSN) {
		if (IBSN >= 500) {
			this.IBSN = IBSN;	
		}
		else 
			this.IBSN = 300;
	}
	
	public Genre getGenre() {
		return this.Genre;
	}
	
	public void setGenre(Genre genre) {
		this.Genre = genre;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public java.lang.String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
