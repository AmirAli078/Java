class Address {
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;

    public String getStreetAddress(){
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void display() {
		System.out.println("Address: "+streetAddress+" "+city+" "+state+" "+zipCode);
    }
	  	
}