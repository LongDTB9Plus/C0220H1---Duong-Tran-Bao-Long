package CaseStudy.Models;

import com.opencsv.bean.CsvBindByPosition;

public class Room extends Services {
    @CsvBindByPosition(position = 6)
    private String servicesFree;

    public Room() {

    }

    @Override
    public void setId(String id) {
        matcher = ROOM_ID.matcher(id).matches();
        while (!matcher) {
            System.out.println("Sai DInh Dang ID: SVRO-YYYY");
            id = scanner.nextLine();
            matcher = ROOM_ID.matcher(id).matches();
        }
        this.id = id;
    }

    public String getServicesFree() {
        return servicesFree;
    }

    public void setServicesFree(String servicesFree) {
        this.servicesFree = servicesFree;
    }

    @Override
    public String tostring() {
            String string = new String(this.id + ","
                    + this.serviceName + ","
                    + this.serviceArea + ","
                    + this.servicePrice + ","
                    + this.serviceMaxPeople + ","
                    + this.serviceRentType + ","
                    + this.servicesFree);
            return string;
        }

    @Override
    String showInfo() {
        return null;
    }
}


