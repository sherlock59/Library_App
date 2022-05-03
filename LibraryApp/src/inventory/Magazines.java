/*
 * This child overrides and alters parent clasee's function 
 * 
 * Github link: https://github.com/sherlock59/Library_App.git
 * 
 * @author Annaberdi Meredov 
 * @version 2.2
 * @since 2022.04.27
 */
package inventory;

public class Magazines extends Inventory {
	
	final String type = "Magazines";
	
	private int magazineDate;
	
	public Magazines() {
		this(0 , null, null , "B");
	}
	
	public Magazines(int IBSN, Title title, Genre genre, String AlphabetCategory) {
		super(IBSN, title, genre, AlphabetCategory);
		this.magazineDate = 0;
	}
	
	@Override
	public String getType() {
		return this.type;
	}
	
	public int getMagazineDate() {
		return this.magazineDate;
	}
	
	
	public void setMagazineDate(int magazineDate) {
		this.magazineDate = magazineDate;
	}
	
	public void letter() {
		System.out.println(this.type + "belongs in a section ...");
	}

}
