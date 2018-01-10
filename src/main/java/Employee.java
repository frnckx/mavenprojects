import java.util.ArrayList;

public class Employee {
    private Integer id;
    private String name;
    private boolean permanent;
    private Address address;
    private ArrayList<Integer> phonenumber;
    private String role;
    private ArrayList<String> cities;
    private Property properties;

    public Employee() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Integer> getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(ArrayList<Integer> phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    public Property getProperties() {
        return properties;
    }

    public void setProperties(Property properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", address=" + address +
                ", phonenumber=" + phonenumber +
                ", role='" + role + '\'' +
                ", cities=" + cities +
                ", properties=" + properties +
                '}';
    }
}
