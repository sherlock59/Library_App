package inventory;

public class Book extends Inventory {
	
	final String type = "Book";
	
	private int ISBN_Number;
	
    public Book() {
	this(0,null,null);
    }
    
    public Book(int IBSN, Genre genre, String AlphabetCategory) {
		super(ISBN, genre, AlphabetCategory);
		this.ISBN_Number = 0;
	}
    
    @Override
    public String getType() {
    	return this.type;
    }
    
    public int getISBN_Number() {
    	return this.ISBN_Number;
    }
    
    public void setISBN_Number(int ISBN_Number) {
    	if(ISBN_Number >= 0)
    		this.ISBN_Number =+ ISBN_Number;
    	else
    		this.ISBN_Number = 0;
    }
    
    public void booked() {
    	System.out.println(this.type + "IBSN number booked most..");
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
