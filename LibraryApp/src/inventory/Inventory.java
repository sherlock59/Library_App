/** 
 * The Inventory parent class does presents the library details and stock
 * details. For example, if the library member checks out a magazine or book, the 
 * associate can get more information by scanning the magazine and using this app.
 * 
 * Github link: https://github.com/sherlock59/Library_App.git
 * 
 * @author Annaberdi Meredov
 * @version 2.2
 * @since 2022.04.27
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

	protected int ISBN = 0;
	
	protected Title Title = null;

	protected Genre Genre = null;

	protected String AlphabetCategory = null;
	
public Inventory(){
		
		/*
		 * There are no setters for the inventory id
		 */
		Inventory.counter++;
		this.id = Inventory.counter;
	}

public Inventory(int ISBN, Title title, Genre genre, String AlphabetCategory ) {
	
	this();
	
	this.setISBN(ISBN);
	this.setTitle(Title);
	this.setGenre(Genre);
	this.setAlphabetCategory(AlphabetCategory);
}

public int getISBN() {
	return this.ISBN;
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

	public void setISBN(int ISBN) {
		if (ISBN >= 500) {
			this.ISBN = ISBN;	
		}
		else 
			this.ISBN = 9123;
	}
	
	public Title getTitle() {
		return this.Title;
	}
	
	public void setTitle(Title title) {
		this.Title = title;
	}
	
	public Genre getGenre() {
		return this.Genre;
	}
	
	public void setGenre(Genre genre) {
		this.Genre = genre;
	}

	public java.lang.String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
