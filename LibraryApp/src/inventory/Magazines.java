package inventory;

public class Magazines extends Inventory {
	
	final String type = "Magazines";
	
	private int magazineDate;
	
	public Magazines() {
		this(0, null, null);
	}
	
	public Magazines(int IBSN, Genre genre, String AlphabetCategory) {
		super(IBSN, genre, AlphabetCategory);
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

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
