/*
 * This subclass overrides string and declares ISBN, Genre, and AlphabetCategory for Book class
 * 
 * @author Annaberdi Meredov 
 * @version 2.2
 * @since 2022.04.27
 */
package inventory;

public class Book extends Inventory {
	
	final String type = "Book";
	
	private int IBSN_Number;
	
    public Book() {
    	this(0 ,null , null);
    }
    
    public Book(int IBSN, Genre genre, String AlphabetCategory) {
		super(IBSN, genre, AlphabetCategory);
		this.IBSN_Number = 0;
	}
    
    /*
     * This function overrides below to link Type with ISBN number.
     */
    @Override
    public String getType() {
    	return this.type;
    }
    
    public int getISBN_Number() {
    	return this.IBSN_Number;
    }
    
    public void setISBN_Number(int ISBN_Number) {
    	if(ISBN_Number >= 0)
    		this.IBSN_Number =+ ISBN_Number;
    	else
    		this.IBSN_Number = 0;
    }
    
    public void booked() {
    	System.out.println(this.type + "IBSN number booked most..");
    }
}

