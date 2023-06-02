public class SkincareProduct extends Product{
private String skinType;
   private String[] targetConcern;
   private boolean fragranaceFree;
    public SkincareProduct(String name, String brand, double price, String type, boolean eco_friendly,String skinType, String[] targetConcern,boolean fragranaceFree ) {
		super(name, brand, price, type, eco_friendly);
		this.skinType=skinType;
		this.targetConcern=targetConcern;
		this.fragranaceFree=fragranaceFree;
	}  
public String getSkinType() {
	return skinType;
}
public void setSkinType(String skinType) {
	this.skinType = skinType;
}
public String[] getTargetConcern() {
	return targetConcern;
}
public void setTargetConcern(String[] targetConcern) {
	this.targetConcern = targetConcern;
}
public boolean isFragranaceFree() {
	return fragranaceFree;
}
public void setFragranaceFree(boolean fragranaceFree) {
	this.fragranaceFree = fragranaceFree;
}
public void print_Info() {
	super.print_Info();
	System.out.println("Skin Type: "+skinType);
	System.out.println("Target Concerns : "+targetConcern);
	System.out.println("Fragranace: "+fragranaceFree);
}
   
}