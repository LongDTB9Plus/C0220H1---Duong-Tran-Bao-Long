package CaseStudy.Models;

public class Room extends Services {
    String servicesFree;

    public Room() {
        Services.increaseID();
    }

    public Room(String servicesFree) {
        this.servicesFree = servicesFree;
        Services.increaseID();
    }

    public Room(String serviceName, double serviceArea, int serviceMaxPeople, double servicePrice, String serviceRentType, String id, String servicesFree) {
        super(serviceName, serviceArea, serviceMaxPeople, servicePrice, serviceRentType);
        this.servicesFree = servicesFree;
    }

    public String getServicesFree() {
        return servicesFree;
    }

    public void setServicesFree(String servicesFree) {
        this.servicesFree = servicesFree;
    }

    @Override
    String showInfo() {
        return ("ID :\t" + this.id +
                "\nTen Dich Vu:\t" + this.serviceName +
                "\nDien Tich su Dung:\t" + this.serviceArea +
                "\nChi Phi Thue:\t" + this.servicePrice +
                "\nSo Luong Nguoi Toi Da:\t" + this.serviceMaxPeople +
                "\nKieu Thue:\t" + this.serviceRentType +
                "\nDich Vu Mien Phi Kem Theo:\t" + this.servicesFree);
    }

    public static void main(String[] args) {

    }
}
