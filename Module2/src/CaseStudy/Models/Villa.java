package CaseStudy.Models;

public class Villa extends Services {
    String typeService;
    String servicesRoom;
    double areaPool;
    int numberFloor;

    public Villa(){

    }

    public Villa(String typeService, String servicesRoom, double areaPool, int numberFloor) {
        this.typeService = typeService;
        this.servicesRoom = servicesRoom;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(String serviceName, double serviceArea, int serviceMaxPeople,double servicePrice, String serviceRentType, String id, String typeService, String servicesRoom, double areaPool, int numberFloor) {
        super(serviceName, serviceArea, serviceMaxPeople,servicePrice, serviceRentType, id);
        this.typeService = typeService;
        this.servicesRoom = servicesRoom;
        this.areaPool = areaPool;
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
                "\nDien Tich Ho Boi:\t" + this.areaPool +
                "\nSo Tang:\t" + this.numberFloor);
    }

    public static void main(String[] args) {
        Villa asc = new Villa();
        System.out.println(asc.showInfo());
    }
}
