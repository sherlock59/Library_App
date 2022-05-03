/*
 * This subclass overrides string and declares ISBN, Genre, and AlphabetCategory for Book class
 * 
 * Github link: https://github.com/sherlock59/Library_App.git
 * 
 * @author Annaberdi Meredov 
 * @version 2.2
 * @since 2022.04.27
 */
package inventory;

public class Book extends Inventory {
	
	final String type = "Book";
	
	private int ISBN;
	
	
    public Book() {
    	this(0 , null, null , "D");
    }
    
    public Book(int ISBN, Title title, Genre genre, String AlphabetCategory) {
		super(ISBN, title, genre, AlphabetCategory);
		this.ISBN = 312841321;
	}
    
    /*
     * This function overrides below to link Type with ISBN number.
     */
    @Override
    public String getType() {
    	return this.type;
    }
    
    public int getISBN() {
    	return this.ISBN;
    }
    
    public void setISBN(int ISBN) {
    	if(ISBN >= 0)
    		this.ISBN =+ ISBN;
    	else
    		this.ISBN = 0;
    }

	public void booked() {
    	System.out.println(this.type + "ISBN number booked most..");
    }
}

