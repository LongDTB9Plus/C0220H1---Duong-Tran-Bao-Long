package CaseStudy.Models;

import com.opencsv.bean.CsvBindByPosition;

public class Villa extends Services {
    @CsvBindByPosition(position = 6)
    private String typeService;
    @CsvBindByPosition(position = 7)
    private String servicesRoom;
    @CsvBindByPosition(position = 8)
    private double areaPool;
    @CsvBindByPosition(position = 9)
    private int numberFloor;

    public Villa(String id, String serviceName, double serviceArea, double servicePrice, int serviceMaxPeople, String serviceRentType, String typeService, String servicesRoom, double areaPool, int numberFloor) {
        super(id, serviceName, serviceArea, servicePrice, serviceMaxPeople, serviceRentType);
        this.typeService = typeService;
        this.servicesRoom = servicesRoom;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(String typeService, String servicesRoom, double areaPool, int numberFloor) {
        this.typeService = typeService;
        this.servicesRoom = servicesRoom;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    @Override
    public void setId(String id) {
        matcher = VILLA_ID.matcher(id).matches();
        while (!matcher) {
            System.out.println("Sai DInh Dang ID: SVVL-YYYY");
            id = scanner.nextLine();
            matcher = VILLA_ID.matcher(id).matches();
        }
        this.id = id;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        matcher = VALID_STRING.matcher(typeService).matches();
        while (!matcher) {
            System.out.println("Phai Viet Hoa Chu Cai Dau Tien:");
            typeService = scanner.nextLine();
            matcher = VALID_STRING.matcher(typeService).matches();
        }
        this.typeService = typeService;
    }

    public String getServicesRoom() {
        return servicesRoom;
    }

    public void setServicesRoom(String servicesRoom) {
        matcher = VALID_ROOM_SERVICES.matcher(servicesRoom).matches();
        while (!matcher) {
            System.out.println("Sai Ten Dich Vu:");
            servicesRoom = scanner.nextLine();
            matcher = VALID_ROOM_SERVICES.matcher(servicesRoom).matches();
        }
        this.servicesRoom = servicesRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        matcher = VALID_AREA.matcher(String.valueOf(areaPool)).matches();
        while (!matcher) {
            System.out.println("Dien Tich Khong Hop Le:");
            areaPool = scanner.nextDouble();
            matcher = VALID_AREA.matcher(String.valueOf(areaPool)).matches();
        }
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        matcher = VALID_NUMBER.matcher(String.valueOf(numberFloor)).matches();
        while (!matcher) {
            System.out.println("Khong Phai La So Nguyen Duong:");
            numberFloor = scanner.nextInt();
            matcher = VALID_NUMBER.matcher(String.valueOf(numberFloor)).matches();
        }
        this.numberFloor = numberFloor;
    }

    public Villa() {
    }

    @Override
    public String tostring() {
        String string = new String(this.id + ","
                + this.serviceName + ","
                + this.serviceArea + ","
                + this.servicePrice + ","
                + this.serviceMaxPeople + ","
                + this.serviceRentType + ","
                + this.typeService + ","
                + this.servicesRoom + ","
                + this.areaPool + ","
                + this.numberFloor);
        return string;
    }

    @Override
    public void showInfo() {
        System.out.printf("ID:\t%s\n" +
                        "Name Service:\t%s\n" +
                        "Service Area:\t%f\n" +
                        "Price Service:\t%f\n" +
                        "Max People:\t%d\n" +
                        "Rent Type:\t%s\n" +
                        "Type Service:\t%s\n" +
                        "Room Service:\t%s\n" +
                        "Pool Area:\t%f\n" +
                        "Number Floow:\t%d\n", this.id, this.serviceName, this.serviceArea,
                this.servicePrice, this.serviceMaxPeople, this.serviceRentType,
                this.typeService, this.servicesRoom, this.areaPool, this.numberFloor);
    }

}
