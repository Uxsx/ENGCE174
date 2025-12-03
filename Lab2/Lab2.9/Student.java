public class Student {
    private String name ;
    private Address address ;

    public Student(String name, Address address) {
        this.name = name ;
        this.address = address ;
    }

    public void displayProfile() {
        System.out.println("Name: " + this.name) ;
        String fullAddress = this.address.getFullAddress() ;
        System.out.println("Address: " + fullAddress) ;
    }
}
