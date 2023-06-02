public class CleaningProduct extends Product {
	private String surfaceType;
	private String scent;
	private boolean bioDegrable;
		public CleaningProduct(String name, String brand, double price, String type, boolean eco_friendly,String surfaceType, String scent,boolean bioDegrable ) {
				super(name, brand, price, type, eco_friendly);
				this.surfaceType=surfaceType;
				this.scent=scent;
				this.bioDegrable=bioDegrable;
	}
	public String getSurfaceType() {
		return surfaceType;
	}
	public void setSurfaceType(String surfaceType) {
		this.surfaceType = surfaceType;
	}
	public String getScent() {
		return scent;
	}
	public void setScent(String scent) {
		this.scent = scent;
	}
	public boolean isBioDegrable() {
		return bioDegrable;
	}
	public void setBioDegrable(boolean bioDegrable) {
		this.bioDegrable = bioDegrable;
	}
	public void print_Info() 
	{
		super.print_Info();
		System.out.println("Surface Type: "+surfaceType);
		System.out.println("Scent : "+scent);
		System.out.println("bioDegrable: "+bioDegrable);
	}
}
