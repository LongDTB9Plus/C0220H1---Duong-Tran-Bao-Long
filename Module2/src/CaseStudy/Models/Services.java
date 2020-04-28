package CaseStudy.Models;

public abstract class Services {
    String serviceName;
    double serviceArea;
    int serviceMaxPeople;
    double servicePrice;
    String serviceRentType;
    static int count = 0;
    String id = String.valueOf(count);

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(double serviceArea) {
        this.serviceArea = serviceArea;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getServiceRentType() {
        return serviceRentType;
    }

    public void setServiceRentType(String serviceRentType) {
        this.serviceRentType = serviceRentType;
    }

    public Services() {
        increaseID();
    }

    public Services(String serviceName, double serviceArea, int serviceMaxPeople,double servicePrice, String serviceRentType) {
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceMaxPeople = serviceMaxPeople;
        this.servicePrice = servicePrice;
        this.serviceRentType = serviceRentType;
        Services.increaseID();
    }
    static protected void increaseID(){
        count ++;
    }

    abstract String showInfo();

    ;
}
