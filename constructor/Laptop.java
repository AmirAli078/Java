public class Laptop {
	String model;
	int systemId;
	String core;
	int generation;
	String systemType;
	public Laptop(String model,int systemId,String core,int generation,String systemType) {
		this. model=model;
		this. systemId=systemId;
		this.core=core;
		this. generation=generation;
		this. systemType=systemType;
		
	}

	public static void main(String[] args) {
	Laptop Dell=new Laptop("Precision 5510",00325-95858-33755,"i7",6,"64 bit operating System");
	System.out.println(Dell.model);
	System.out.println(Dell.systemId);
	System.out.println(Dell.core);
	System.out.println(Dell.generation);
	System.out.println(Dell.systemType);

	}

}
