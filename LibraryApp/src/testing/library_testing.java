package testing; // keeping the testbench logic separate

import java.util.ArrayList;
import java.util.List;

//import inventory.*; // the wildcard * will import all classes & interfaces
import inventory.Book;
import inventory.Genre;
import inventory.Inventory;
import inventory.Magazines;

/** 
 * The TestBench class contains multiple unit testing methods for testing
 * the Animal base (super or parent) and derived (sub or child) classes.
 * 
 * Since there should only be one TestBench running, all helper methods
 * are static.  We do not need to create a TestBench object to run the 
 * individual unit testing methods (helper methods).  
 * 
 * No other class needs to access the helper methods so all the unit testing
 * methods are defined as private. 
 * 
 * @author Annaberdi Meredov
 * @version 2.0
 * @since 2022.04.27
 */
public class library_testing {
	
	/**
	 * Stores all types of zoo animals as long as it's a derived from the Animal class.
	 */
	private static List<Inventory> Library = new ArrayList<>();
	
	/**
	 * The default constructor currently isn't needed.
	 */
	library_testing(){
	}
	
	/**
	 * Unit test instantiation of an Animal reference variable (object)
	 * using the default constructor
	 */
	private static void unitTest1_Inventory_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

		//create an Animal instance (object) using default constructor
		Inventory inventory = new Inventory();
		
		displayInfo(inventory);
		
		inventory.setIBSN(10632913);
		inventory.setGenre(Genre.MYSTERY);
		inventory.setAlphabetCategory("N");
		
		Library.add(inventory);
		
		displayInfo(inventory);	

	}
	
	/**
	 * Unit test instantiation of an Animal reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest2_Inventory_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create another Animal instance (object) using overload constructor		
		Inventory inventory = new Inventory(100, Genre.MYSTERY, "N");
		
		Library.add(inventory);
		
		displayInfo(inventory);

	}

	/**
	 * Unit test instantiation of an Bird reference variable (object)
	 * using the default constructor
	 */
	private static void unitTest3_Book_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a Bird instance (object) using default constructor
		Inventory book = new Book();
		Library.add(book);
	
		displayInfo(book);
		
		book.setIBSN(12435);
		book.setGenre(Genre.HORROR);
		book.setAlphabetCategory("Q");
		
		displayInfo(book);
		////// was 
	}

	/**
	 * This unit test is used to instantiation an Fish reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest4_Magazines_Overload() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a Fish instance (object) using overload constructor		
	    Magazines magazines = new Magazines(81237123, Genre.COMEDY, "G");
		Library.add(magazines);

		displayInfo(magazines);
		/////// was 
	}
	
	/**
	 * This unit test is used to instantiation an Fish reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest5_Invalid_Data() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
	    Book book = new Book(10293123, Genre.DRAMA, "T");	
	    
		displayInfo(book);

	}
		
	/**
	 * Display the Animal reference variable's id, type, gender, age, and weight
	 * 
	 * @param animal the reference variable data to be displayed
	 */
	private static void displayInfo(Inventory Inventory) {
	
		System.out.printf("IBSN: %-10d  Type: %-10s Genre: %-10s AlphabetCategory: %-10s \n",
				Inventory.getIBSN(), Inventory.getType(), Inventory.getGenre(), Inventory.getAlphabetCategory());
		
	} // end of displayInfo

	/**
	 * Display all Zoo Animals stored in the ArrayList.
	 * It will display the id, type, gender, age, and weight
	 */
	private static void displayReport() {
		
		System.out.println();
		System.out.println("============== Library REPORT ============");
		System.out.println("IBSN  Type       Genre    AlphabetCategory");
		System.out.println("=== ========== ========== === ========");
		
		for (Inventory Inventory : Library) {
			System.out.printf("%-10d %-10s %-10s %-10s\n",
					Inventory.getIBSN(), Inventory.getType(), Inventory.getGenre(), Inventory.getAlphabetCategory());
		}
		
		System.out.println();
		
	} // end of displayReport method
	
	/**
	 * The testbench to regression test that the Animal base and subclasses are
	 * working correctly.
	 * 
	 * @param args this program doesn't use command line input arguments
	 */
	public static void main(String[] args) {
		
		library_testing.unitTest1_Inventory_Default();
		library_testing.unitTest2_Inventory_Overload();
		library_testing.unitTest3_Book_Default();
		library_testing.unitTest4_Magazines_Overload();
		library_testing.unitTest5_Invalid_Data();
		
		library_testing.displayReport();
		
	}  // end of main method

} // end of Main class
