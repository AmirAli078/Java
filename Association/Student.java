 class Student{
	private String name;
	private String contact;
	private int age;
	private Address address;
	
	public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
		public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
		public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
	public void setData(String name, String contact, int age){
		this.name=name;
		this.contact=contact;
		this.age=age;
	}
	public void getData(){
		System.out.println("Name: "+name);
		System.out.println("Contact: "+contact);
		System.out.println("Age: "+age);
	}

   public static void main(String args[]){
	   Address ad = new Address();
	   ad.setStreetAddress("101a");
	   ad.setCity("jamshoro");
	   ad.setState("sindh");
	   ad.setZipCode("123");
	  Student obj=new Student();
    obj.setName("Amir");
    obj.setContact("13454t43");
	obj.setAddress(ad);
    obj.setAge(20);
    obj.getData();
	obj.getAddress().display();
	//obj.getAddress().getStreetAddress();
	//obj.getAddress().getCity();
	//obj.getAddress().getState();
	//obj.getAddress().getZipCode();
  
	  
   }
}