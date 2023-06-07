import java.util.ArrayList;
import java.util.List;

public class ProductInventory {
 private List<Product> products;
 public ProductInventory() {
	 products=new ArrayList<>();
 }
   public void addProduc(Product product) {
	   products.add(product);
   }
   public void removeProduct(Product product) {
	   if(products.contains(product)) {
		   products.remove(product);
		   System.out.println("Product: "+product.getName()+" is removed from the inventary");
	   }
	   else {
		   System.out.println("Product not found");
	   }
   }
   public void searchProduct(String searchTerm) {
       boolean found = false;
       for (Product product : products) {
           if (product.getName().equalsIgnoreCase(searchTerm)) {
               System.out.println(product.toString());
               found = true;
           }
       }

       if (!found) {
           System.out.println("Product not found in inventory.");
       }
	      public void testEcofriendlyInfo(String type) {
	   for(int i=0; i<products.size(); i++) {
		   if(products.get(i).getType().equals(type) && products.get(i).getEco_friendly()==true) {
			   products.get(i).print_Info();
		   }
	   }
   }
   }
   public static void main(String args[]) {
	   ProductInventory inventary=new ProductInventory();
	   Product product6=new Product("Ecofriendly","organic",25.5,"clothing",true);
	   Product product1 = new Product("Eco T-Shirt", "OrganicWear", 25.99, "Clothing", true);
       Product product2 = new Product("Eco Jeans", "Levi's", 89.99, "Clothing", true);
       Product product3 = new Product("Shampoo", "Pantene", 8.99, "Skincare", false);
       Product product4 = new Product("Moisturizer", "Olay", 12.49, "Skincare", false);
       Product product5 = new Product("All-Purpose Cleaner", "Clorox", 4.99, "Cleaning", true);
	   String[] targetConcer= {"none"};
       Product product7=new SkincareProduct("Moisturize", "Olay",12.49,"Skincare No	Skin Type: Sensitive", false, "none",targetConcer, false);
       Product product8=new CleaningProduct("Laundry Detergent", "Tide", 12.5, "Cleaning", true,"Clothing", "Fresh", false);
       Product product9=new ElectronicProduct("Smart Thermostat","Nest",249.99,"Electronic",true," Energy Efficient: Yes, Smart", true, true);
       inventary.addProduc(product1);
       inventary.addProduc(product1);
       product1.print_Info();
       inventary.addProduc(product2);
       product2.print_Info();
       inventary.addProduc(product3);
       product3.print_Info();
       inventary.addProduc(product4);
       product4.print_Info();
       inventary.addProduc(product5);
       product5.print_Info();
       inventary.addProduc(product6);
       product6.print_Info();
	    inventary.addProduc(product7);
       product6.print_Info();
       inventary.addProduc(product8);
       product8.print_Info();
       inventary.addProduc(product9);
       product9.print_Info();
	  inventary.searchProduct("Shampoo");
      inventary.removeProduct(product1);
	  
   }
}
