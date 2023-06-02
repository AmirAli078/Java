public class PlantProduct extends Product{
	private String potType;
	private String sunlightNeed;
	private String typeOfPlant;
	public String getPotType() {
		return potType;
	}
		public PlantProduct(String name, String brand, double price, String type, boolean eco_friendly,String potType,String,String sunlightNeds,String typeOfPlant,String getTypeOfPlant){
		super(name, brand, price, type, eco_friendly);
	}
	public void setPotType(String potType) {
		this.potType = potType;
	}
	public String getSunlightNeed() {
		return sunlightNeed;
	}
	public void setSunlightNeed(String sunlightNeds) {
		this.sunlightNeed = sunlightNeds;
	}
	public String getTypeOfPlant() {
		return typeOfPlant;
	}
	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}
	public void print_Info() {
		super.print_Info();
		System.out.println("Pot Type: "+potType);
		System.out.println("Sun Light Need: "+sunlightNeed);
		System.out.println("Type Of Plant: "+typeOfPlant);
	}
}