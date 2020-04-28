package CaseStudy.Models;

public class Villa extends Services {
    private String typeService;
    private String servicesRoom;
    private double areaPool;
    private int numberFloor;

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getServicesRoom() {
        return servicesRoom;
    }

    public void setServicesRoom(String servicesRoom) {
        this.servicesRoom = servicesRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public Villa() {
    Services.increaseID();
    }

    public Villa(String typeService, String servicesRoom, double areaPool, int numberFloor) {
        this.typeService = typeService;
        this.servicesRoom = servicesRoom;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
        Services.increaseID();
    }

    public Villa(String serviceName, double serviceArea, int serviceMaxPeople, double servicePrice, String serviceRentType, String id, String typeService, String servicesRoom, double areaPool, int numberFloor) {
        super(serviceName, serviceArea, serviceMaxPeople, servicePrice, serviceRentType);
        this.typeService = typeService;
        this.servicesRoom = servicesRoom;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInfo() {
        return ("ID :\t" + this.id +
                "\nTen Dich Vu:\t" + this.serviceName +
                "\nDien Tich su Dung:\t" + this.serviceArea +
                "\nGia Thue:\t" + this.servicePrice +
                "\nSo Luong Nguoi Toi Da:\t" + this.serviceMaxPeople +
                "\nKieu Thue:\t" + this.serviceRentType +
                "\nTieu Chuan Phong:\t" + this.typeService +
                "\nTien Nghi Khac: \t" + this.servicesRoom +
                "\nDien Tich Ho Boi:\t" + this.areaPool +
                "\nSo Tang:\t" + this.numberFloor);
    }

    public static void main(String[] args) {
        Villa asc = new Villa();
        System.out.println(asc.showInfo());
    }

}
