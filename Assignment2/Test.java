
public class Test {

	public static void main(String[] args) {
	ProductInventory t=new ProductInventory();
	 Product product6=new Product("Ecofriendly","organic",25.5,"clothing",true);
	 Product product1 = new Product("Eco T-Shirt", "OrganicWear", 25.99, "Clothing", true);
     Product product2 = new Product("Eco Jeans", "Levi's", 89.99, "Clothing", true);
     Product product3 = new Product("Shampoo", "Pantene", 8.99, "Skincare", false);
     Product product4 = new Product("Moisturizer", "Olay", 12.49, "Skincare", false);
     Product product5 = new ClothingProduct("All-Purpose Cleaner", "Clorox", 4.99, "Cleaning", true, "Medium", "Organic Cotton", "grren", "Causal");
     String[] targetConcer= {"none"};
     Product product7=new SkincareProduct("Moisturize", "Olay",12.49,"Skincare No	Skin Type: Sensitive", false, "none",targetConcer, false);
     Product product8=new CleaningProduct("Laundry Detergent", "Tide", 12.5, "Cleaning", true,"Clothing", "Fresh", false);
     Product product9=new ElectronicProduct("Smart Thermostat","Nest",249.99,"Electronic",true," Energy Efficient: Yes, Smart", true, true);
     Product product10=new PlantProduct("Snake Plant", "Plant for us", 24.99f, "Plant", true, "pl1","cl1", "new");
     //taste case 1
     t.addProduc(product1);
     product1.print_Info();
     t.addProduc(product2);
     //taste case 5
     product2.print_Info();
     t.addProduc(product3);
     product3.print_Info();
     //taste case 6
      t.addProduc(product4);
     product4.print_Info();
     //taste case 7
     t.addProduc(product5);
     product5.print_Info();
     t.addProduc(product6);
     product6.print_Info();
     t.addProduc(product7);
     product6.print_Info();
     t.addProduc(product8);
     product8.print_Info();
     //taste case 8
     t.addProduc(product9);
     product9.print_Info();
     //taste case 2
    t.searchProduct("Shampoo");
    //taste case 3
    t.removeProduct(product3);
    //taste case 4
    t.searchProduct("Pen");
    //taste case 9
    t.addProduc(product10);
    product10.print_Info();
    //taste case 10
    t.testEcofriendlyInfo("clothing");
    
       
	}

}
