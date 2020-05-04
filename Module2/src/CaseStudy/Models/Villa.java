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

    @Override
    public void setId(String id){
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

}
