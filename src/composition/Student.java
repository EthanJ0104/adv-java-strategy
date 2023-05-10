package composition;

public class Student implements AddressInterface {

    private String name;
    private int age;
    private String streetAddress;
    private int zipCode;
    private String state;
    private String phone;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.state = state;
        this.phone = phone;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String streetAddress() {
        return null;
    }

    @Override
    public int zipCode() {
        return 0;
    }

    @Override
    public String state() {
        return null;
    }

    @Override
    public String phone() {
        return null;
    }
}
