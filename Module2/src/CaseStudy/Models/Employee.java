package CaseStudy.Models;

public class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;
    private String age;
    private String address;

    public Employee() {
    }

    public Employee(String id,String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return ("ID:\t" + this.id + "\n" +
                "Name:\t" + this.name + "\n" +
                "Age:\t" + this.age + "\n" +
                "Adress:\t" + this.address + "\n");
    }
}
