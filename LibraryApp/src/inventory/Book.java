package inventory;

import animal.Gender;

public class Book extends Inventory {
	
	final String type = "Book";
	
    public Book() {
	this(0,null,null)
    }
    
    public Book(int IBSN, String , double weight) {
		super(age, gender, weight);
		this.waterType = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
