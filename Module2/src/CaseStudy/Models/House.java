package CaseStudy.Models;

public class House extends Services {
    String typeService;
    String servicesRoom;
    int numberFloor;

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getServiceRoom() {
        return servicesRoom;
    }

    public void setServiceRoom(String servicesRoom) {
        this.servicesRoom = servicesRoom;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public House(){

    }

    public House(String typeService, String servicesRoom, int numberFloor) {
        this.typeService = typeService;
        this.servicesRoom = servicesRoom;
        this.numberFloor = numberFloor;
    }

    public House(String serviceName, double serviceArea, int serviceMaxPeople, double servicePrice, String serviceRentType, String id, String typeService, String servicesRoom, int numberFloor) {
        super(serviceName, serviceArea, serviceMaxPeople, servicePrice, serviceRentType, id);
        this.typeService = typeService;
        this.servicesRoom = servicesRoom;
        this.numberFloor = numberFloor;
    }

    @Override
    String showInfo() {
        return ("Ten Dich Vu:\t" + this.serviceName +
                "\nDien Tich su Dung:\t" + this.serviceArea +
                "\nChi Phi Thue:\t" + this.servicePrice +
                "\nSo Luong Nguoi Toi Da:\t" + this.serviceMaxPeople +
                "\nKieu Thue:\t" + this.serviceRentType +
                "\nTieu Chuan Phong:\t" + this.typeService +
                "\nTien Nghi Khac: \t" + this.servicesRoom +
                "\nSo Tang:\t" + this.numberFloor);
    }
}
