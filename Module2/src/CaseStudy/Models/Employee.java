package CaseStudy.Models;

public class Employee {
    private String name;
    private String age;
    private String address;

    public Employee() {
    }

    public Employee(String name, String age, String address) {
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
        return ("Name:\t" + this.name + "\n" +
                "Age:\t" + this.age + "\n" +
                "Adress:\t" + this.address + "\n");
    }
}
