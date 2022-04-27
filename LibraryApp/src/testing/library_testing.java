package testing; // keeping the testbench logic separate

import java.util.ArrayList;
import java.util.List;

import Inventory.*; // the wildcard * will import all classes & interfaces

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
public class TestBench {
	
	/**
	 * Stores all types of zoo animals as long as it's a derived from the Animal class.
	 */
	private static List<Inventory> Library = new ArrayList<>();
	
	/**
	 * The default constructor currently isn't needed.
	 */
	TestBench(){
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
		Inventory inventory = new library();

		libraryInventory.add(Inventory);
		
		displayInfo(Inventory);
		
		Inventory.setIBSN(10632913);
		Inventory.setGenre(Genre.MYTHS);
		animal.setAlphabetCategory(A-Z);
		
		displayInfo(Inventory);	

	}
	
	/**
	 * Unit test instantiation of an Animal reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest2_Animal_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create another Animal instance (object) using overload constructor		
		Inventory inventory = new Inventory(100, Genre.MYTHS, A);
		
		libraryInventory.add(Inventory);
		
		displayInfo(inventory);

	}

	/**
	 * Unit test instantiation of an Bird reference variable (object)
	 * using the default constructor
	 */
	private static void unitTest3_Bird_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a Bird instance (object) using default constructor
		Inventory book = new Book();
		libraryInventory.add(book);
	
		displayInfo(book);
		
		book.setISBN(12435135);
		book.setGenre(Genre.HORROR);
		book.setAlphabetCategory(0.5);
		
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
		String Magazines = new Magazines(81237123, Genre.COMEDY, G);
		libraryInventory.add(Magazines);

		displayInfo(Magazines);
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
		
	    String Book = new Book(10293123, Genre.DRAMA, T);	
		TestBench.displayInfo(Book);
		
		//bird.setWingspan(-1);
		//System.out.println("The bird's wingspan is " + bird.getWingspan());

		//System.out.println();
		
		//Fish fish = new Fish(-2, Gender.FEMALE, -10.5);	
		//TestBench.displayInfo(fish);
		//fish.setWaterType(Water.SALT);
		//System.out.println("The fish is a " + fish.getWaterType() + " water fish");

	}
		
	/**
	 * Display the Animal reference variable's id, type, gender, age, and weight
	 * 
	 * @param animal the reference variable data to be displayed
	 */
	private static void displayInfo(Inventory Inventory) {
		
		System.out.printf("ID: %-3d  Type: %-10s Gender: %-10s Age: %3d   Weight: %8.2f\n",
				Inventory.getId(), Inventory.getType(), Inventory.getGenre(), Inventory.getISBN(), Inventory.getAlphabetCategory());
		
	} // end of displayInfo

	/**
	 * Display all Zoo Animals stored in the ArrayList.
	 * It will display the id, type, gender, age, and weight
	 */
	private static void displayReport() {
		
		System.out.println();
		System.out.println("============== Library REPORT ============");
		System.out.println("ID  Type       Genre     ISBN   AlphabetCategory");
		System.out.println("=== ========== ========== === ========");
		
		for Inventory Inventory : libraryInventory) {
			System.out.printf("%-3d %-10s %-10s %3d %8.2f\n",
					Inventory.getId(), Inventory.getType(), Inventory.getGenre(), Inventory.get.ISBN(), Inventory.getAlphabetCategory());
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
		
		TestBench.unitTest1_Inventory_Default();
		TestBench.unitTest2_Inventory_Overload();
		TestBench.unitTest3_Book_Default();
		TestBench.unitTest4_Magazines_Overload();
		TestBench.unitTest5_Invalid_Data();
		
		TestBench.displayReport();
		
	}  // end of main method

} // end of Main class
