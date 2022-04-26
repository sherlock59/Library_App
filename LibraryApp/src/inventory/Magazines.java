package inventory;

public class Magazines extends Inventory {
	
	final String type = "Magazines";
	
	private Magazine magazineDate;
	
	public Magazines() {
		this(0, null, null);
	}
	
	public Magazines(int ISBN, Genre genre, String AlphabetCategory) {
		super(ISBN, genre, AlphabetCategory);
		this.magazineDate = null;
	}
	
	@Override
	public String getType() {
		return this.type;
	}
	
	public Magazine getMagazineDate() {
		return this.magazineDate;
	}
	
	public void setMagazineDate(Magazine magazineDate) {
		this.magazineDate = magazineDate;
	}
	
	public void letter() {
		System.out.println(this.type + "belongs in a section ...");
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
