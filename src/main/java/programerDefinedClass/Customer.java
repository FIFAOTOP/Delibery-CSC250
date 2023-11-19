public class Customer {
    private String name,address,phone,type;

    public Customer(String name, String address, String phone, String type) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.type = type;
    }
    public void trackingParcelStatus(){
    System.out.println("trackingParcelStatus");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
