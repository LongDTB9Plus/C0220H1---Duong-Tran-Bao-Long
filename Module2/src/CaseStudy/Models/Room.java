package CaseStudy.Models;

public class Room extends Services {
    private String servicesFree;

    public Room() {

    }

    @Override
    public void setId(String id){
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
    public String showInfo() {
        return ("ID :\t" + this.id +
                "\nTen Dich Vu:\t" + this.serviceName +
                "\nDien Tich su Dung:\t" + this.serviceArea +
                "\nChi Phi Thue:\t" + this.servicePrice +
                "\nSo Luong Nguoi Toi Da:\t" + this.serviceMaxPeople +
                "\nKieu Thue:\t" + this.serviceRentType +
                "\nDich Vu Mien Phi Kem Theo:\t" + this.servicesFree);
    }

}
