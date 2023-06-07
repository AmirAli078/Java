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
}
