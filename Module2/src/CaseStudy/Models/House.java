package CaseStudy.Models;

import com.opencsv.bean.CsvBindByPosition;

public class House extends Services {
    @CsvBindByPosition(position = 6)
    private String typeService;
    @CsvBindByPosition(position = 7)
    private String servicesRoom;
    @CsvBindByPosition(position = 8)
    private int numberFloor;

    @Override
    public void setId(String id) {
        matcher = HOUSE_ID.matcher(id).matches();
        while (!matcher) {
            System.out.println("Sai DInh Dang ID: SVHO-YYYY");
            id = scanner.nextLine();
            matcher = HOUSE_ID.matcher(id).matches();
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

    public String getServiceRoom() {
        return servicesRoom;
    }

    public void setServiceRoom(String servicesRoom) {
        matcher = VALID_ROOM_SERVICES.matcher(servicesRoom).matches();
        while (!matcher) {
            System.out.println("Sai Ten Dich Vu:");
            servicesRoom = scanner.nextLine();
            matcher = VALID_ROOM_SERVICES.matcher(servicesRoom).matches();
        }
        this.servicesRoom = servicesRoom;
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

    public House() {

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
                + this.numberFloor);
        return string;
    }

    @Override
    String showInfo() {
        return null;
    }

}

