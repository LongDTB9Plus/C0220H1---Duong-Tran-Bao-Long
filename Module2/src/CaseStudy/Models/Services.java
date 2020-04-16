package CaseStudy.Models;

public abstract class Services {
    String serviceName;
    double serviceArea;
    int serviceMaxPeople;
    double servicePrice;
    String serviceRentType;
    String id;

    public Services() {
    }

    public Services(String serviceName, double serviceArea, int serviceMaxPeople,double servicePrice, String serviceRentType, String id) {
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceMaxPeople = serviceMaxPeople;
        this.servicePrice = servicePrice;
        this.serviceRentType = serviceRentType;
        this.id = id;
    }

    abstract String showInfo();

    ;
}
