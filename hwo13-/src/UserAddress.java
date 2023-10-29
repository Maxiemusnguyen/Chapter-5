public class UserAddress {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    public void setNameAddress(String name, String streetAddress) {
        this.name = name;
        this.streetAddress = streetAddress;
    }
    public void setCityState(String city, String state) {
        this.city = city;
        this.state = state;
    }
    public void printAddress() {
        System.out.println("Name: " + name);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
    public static void main(String[] args) {
        UserAddress user = new UserAddress();
        user.setNameAddress("John Doe", "123 Main St");
        user.setCityState("Anytown", "CA");
        user.printAddress();
    }
}
