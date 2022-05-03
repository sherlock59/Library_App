package testing; // keeping the library testing logic separate

import java.util.ArrayList;
import java.util.List;

import inventory.Book;
import inventory.Genre;
import inventory.Inventory;
import inventory.Magazines;
import inventory.Title;

/** 
 * The library_testing class consists of many unit testing methods for testing 
 * for parent and child classes. 
 * 
 * Github link: https://github.com/sherlock59/Library_App.git
 * 
 * @author Annaberdi Meredov
 * @version 2.2
 * @since 2022.04.27
 */
public class library_testing {
	
	/**
	 * Stores all classes that derived from Inventory class 
	 */
	private static List<Inventory> Library = new ArrayList<>();
	
	/**
	 * The default constructor currently isn't needed.
	 */
	library_testing(){
	}
	
	/**
	 * Unit test instantiation of an inventory reference variable (object)
	 * using the default constructor
	 */
	private static void unitTest1_Inventory_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();

		//create an inventory instance (object) using default constructor
		Inventory inventory = new Inventory();
		
		displayInfo(inventory);
		
		inventory.setISBN(10632913);
		inventory.setTitle(Title.Forest_Gump);
		inventory.setGenre(Genre.MYSTERY);
		inventory.setAlphabetCategory("N");
		
		Library.add(inventory);
		
		displayInfo(inventory);	

	}
	
	/**
	 * Unit test instantiation of an Inventory reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest2_Inventory_Overload() {	
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create another Inventory instance (object) using overload constructor		
		Inventory inventory = new Inventory(100, Title.Forest_Gump,  Genre.MYSTERY, "N");
		
		Library.add(inventory);
		
		displayInfo(inventory);

	}

	
	private static void unitTest3_Book_Default() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a Book instance (object) using default constructor
		Inventory book = new Book();
		Library.add(book);
	
		displayInfo(book);
		
		book.setISBN(12435);
		book.setTitle(Title.LOST);
		book.setGenre(Genre.HORROR);
		book.setAlphabetCategory("Q");
		
		displayInfo(book);
	}

	/**
	 * This unit test is used to instantiation a Magazines reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest4_Magazines_Overload() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
		//create a magazines instance (object) using overload constructor		
	    Magazines magazines = new Magazines(81237123, Title.How_To_Be_A_Gigalo, Genre.COMEDY, "G");
		Library.add(magazines);

		displayInfo(magazines);
		
	}
	
	/**
	 * This unit test is used to instantiation a Magazines reference variable (object)
	 * using the overload constructor
	 */
	private static void unitTest5_Invalid_Data() {
		
		System.out.println();
		System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println();
		
	    Book book = new Book(10293123, Title.Learn_Python_In_Five_Minutes, Genre.DRAMA, "T");	
	    
		displayInfo(book);
		

	}
		
	/**
	 * Display the Inventory reference variable's ISBN, type, genre, and its AlphabetCategory
	 * 
	 * @param Inventory the reference variable data to be displayed
	 */
	private static void displayInfo(Inventory Inventory) {
	
		System.out.printf("ISBN: %-10d  Title: %-10s Type: %-10s Genre: %-10s AlphabetCategory: %-10s \n",
				Inventory.getISBN(), Inventory.getTitle(), Inventory.getGenre(), Inventory.getAlphabetCategory());
		
	} // end of displayInfo

	/**
	 * Display all library inventories stored in the ArrayList.
	 * It will display the ISBN, type, genre, and AlphabetCategory
	 */
	private static void displayReport() {
		
		System.out.println();
		System.out.println("============== Library REPORT ============");
		System.out.println("ISBN  Title   Type       Genre    AlphabetCategory");
		System.out.println("=== ========== ========== === ========");
		
		for (Inventory Inventory : Library) {
			System.out.printf("%-10d %-10s %-10s %-10s %-10s\n",
					Inventory.getISBN(), Inventory.getTitle(), Inventory.getType(), 
					Inventory.getGenre(), Inventory.getAlphabetCategory());
		}
		
		System.out.println();
		
	} // end of displayReport method
	
	/**
	 * The library testing to regression test that the Animal base and subclasses are
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
