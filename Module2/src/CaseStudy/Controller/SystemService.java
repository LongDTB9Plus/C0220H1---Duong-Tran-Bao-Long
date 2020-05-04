package CaseStudy.Controller;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.util.List;
import java.io.*;
import java.util.*;

public class SystemService {
    protected int choiceMain;
    Scanner scanner = new Scanner(System.in);
    String record;
    static String filePath = new File("").getAbsolutePath();
    static final File fileVilla = new File(filePath + "/src/CaseStudy/data/villa.csv");
    static final File fileHouse = new File(filePath + "/src/CaseStudy/data/house.csv");
    static final File fileRoom = new File(filePath + "/src/CaseStudy/data/room.csv");
    static final File fileCustomer = new File(filePath + "/src/CaseStudy/data/customer.csv");
    FileWriter fileWriter = null;
    BufferedReader bufferedReader = null;
    Reader fileReader = null;
    BufferedWriter bufferedWriter = null;

    public SystemService() {
    }



    public void addNewService() throws IOException {
        boolean loopNewService = true;
        while (loopNewService) {
            System.out.println("1: Add New Villa\n" +
                    "2: Add New House\n" +
                    "3: Add New Room\n" +
                    "4: Back To Main Menu\n" +
                    "5: Exit ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addVilla();
                    break;
                case 2:
                    addHouse();
                    break;
                case 3:
                    addRoom();
                    break;
                case 5:
                    this.choiceMain = 7;
                case 4:
                    loopNewService = false;
                    break;
                default:
            }
        }
    }

    public boolean addHouse() throws IOException {
        scanner = new Scanner(System.in);
        House house = new House();
        System.out.println("Nhap ID:");
        house.setId(scanner.next());
        System.out.println("Nhap Ten Dich Vu");
        house.setServiceName(scanner.next());
        System.out.println("Nhap Dien Tich Su Dung");
        house.setServiceArea(scanner.nextDouble());
        System.out.println("Gia Thue");
        house.setServicePrice(scanner.nextDouble());
        System.out.println("So Nguoi O Toi Da");
        house.setServiceMaxPeople(scanner.nextInt());
        System.out.println("Kieu Thue");
        house.setServiceRentType(scanner.next());
        System.out.println("Tieu Chuan Phong");
        house.setTypeService(scanner.next());
        System.out.println("Tien Nghi Khac");
        house.setServiceRoom(scanner.next());
        System.out.println("So Tang");
        house.setNumberFloor(scanner.nextInt());
        bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter = new FileWriter(fileHouse, true);
        bufferedWriter.write(house.tostring());
        bufferedWriter.close();
        return true;
    }

    public boolean addRoom() throws IOException {
        String id;
        String name;
        double serviceArea;
        double servicePrice;
        int maxPeople;
        String rentType;
        String serviceFree;
        FileWriter fileWriter;
        BufferedWriter writer;
        Room room = new Room();
        System.out.println("Nhap ID:");
        id = scanner.nextLine();
        room.setId(id);
        System.out.println("Nhap Ten Dich Vu");
        name = scanner.next();
        room.setServiceName(name);
        System.out.println("Nhap Dien Tich Su Dung");
        serviceArea = scanner.nextDouble();
        room.setServiceArea(serviceArea);
        System.out.println("Gia Thue");
        servicePrice = scanner.nextDouble();
        room.setServicePrice(servicePrice);
        System.out.println("So Nguoi O Toi Da");
        maxPeople = scanner.nextInt();
        room.setServiceMaxPeople(maxPeople);
        System.out.println("Kieu Thue");
        rentType = scanner.next();
        room.setServiceRentType(rentType);
        System.out.println("Tieu Chuan Phong");
        serviceFree = scanner.next();
        room.setServicesFree(serviceFree);
        fileWriter = new FileWriter(fileRoom, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(room.tostring());
        bufferedWriter.close();
        return true;
    }

    public boolean addVilla() throws IOException {
        Villa villa = new Villa();
        System.out.println("Nhap ID");
        villa.setId(scanner.next());
        System.out.println("Nhap Ten Dich Vu");
        villa.setServiceName(scanner.next());
        System.out.println("Nhap Dien Tich Su Dung");
        villa.setServiceArea(scanner.nextDouble());
        System.out.println("Gia Thue");
        villa.setServicePrice(scanner.nextDouble());
        System.out.println("So Nguoi O Toi Da");
        villa.setServiceMaxPeople(scanner.nextInt());
        System.out.println("Kieu Thue");
        villa.setServiceRentType(scanner.next());
        System.out.println("Tieu Chuan Phong");
        villa.setTypeService(scanner.next());
        System.out.println("Tien Nghi Khac");
        villa.setServicesRoom(scanner.next());
        System.out.println("Dien Tich Ho Boi");
        villa.setAreaPool(scanner.nextDouble());
        System.out.println("So Tang");
        villa.setNumberFloor(scanner.nextInt());
        fileWriter = new FileWriter(fileVilla, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(villa.tostring());
        bufferedWriter.close();
        return true;
    }

    public void showService() throws IOException {
        boolean loopShowService = true;
        while (loopShowService) {
            System.out.println("1: Show All Villa\n" +
                    "2: Show All House\n" +
                    "3: Show All Room\n" +
                    "4: Show All Villa Not Duplicate\n" +
                    "5: Show All House Not Duplicate\n" +
                    "6: Show All Room Not Duplicate\n" +
                    "7: Back To Main Menu\n" +
                    "8: Exit");
            int showChoice = scanner.nextInt();
            switch (showChoice) {
                case 1:
                    fileReader = new FileReader(fileVilla);
                    bufferedReader = new BufferedReader(fileReader);
                    while ((record = bufferedReader.readLine()) != null) {
                        createVillaObjFromArray(SystemService.toStringArray(record));
                    }
                    bufferedReader.close();
                    break;
                case 2:
                    fileReader = new FileReader(fileHouse);
                    bufferedReader = new BufferedReader(fileReader);
                    while ((record = bufferedReader.readLine()) != null) {
                        createHouseObjFromArray(SystemService.toStringArray(record));
                    }
                    bufferedReader.close();
                    break;
                case 3:
                    fileReader = new FileReader(fileRoom);
                    bufferedReader = new BufferedReader(fileReader);
                    while ((record = bufferedReader.readLine()) != null) {
                        createRoomObjFromArray(SystemService.toStringArray(record));
                    }
                    bufferedReader.close();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 8:
                    this.choiceMain = 7;
                case 7:
                    loopShowService = false;
                    break;
                default:
            }
        }
    }

    public void addNewCustomer() throws Exception,IOException {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        String serviceChoice;
        String input;

        System.out.println("Nhap Ten Khach Hang:");
        input = scanner.nextLine();
        while (!customer.setName(input)){
            input = scanner.nextLine();
            continue;
        }
        System.out.println("Nhap Ngay Sinh:");
        while (customer.setBirthday(scanner.nextLine())){
            continue;
        }
        System.out.println("Nhap Gioi Tinh");
        while (!customer.setGender(scanner.nextLine())){
            continue;
        }
        System.out.println("Nhap So CMND:");
        while (!customer.setIdNumber(scanner.nextLine())){
            continue;
        }
        System.out.println("Nhap So Dien Thoai:");
        customer.setPhoneNumber(scanner.nextLine());
        System.out.println("Nhap Loai Khach Hang:");
        customer.setCustomerType(scanner.nextLine());
        System.out.println("Nhap Dia Chi:");
        customer.setAddress(scanner.nextLine());
        System.out.println("Xin Chon Kieu Dich Vu Su Dung:\n1:\tVilla\n2:\tRoom\n3:\tHouse");
        serviceChoice = scanner.nextLine();
        switch (serviceChoice) {
            case "1":
                fileReader = new FileReader(fileVilla);
                bufferedReader = new BufferedReader(fileReader);
                ArrayList<Villa> listVilla = new ArrayList<>();
                while ((record = bufferedReader.readLine()) != null) {
                    Villa temp = createVillaObjFromArray(SystemService.toStringArray(record));
                    listVilla.add(temp);
                }
                System.out.println(listVilla);
                bufferedReader.close();
                System.out.println("Nhao Loai Villa:");
                customer.setInputService(scanner.nextLine());
                addVillaUser(listVilla, customer);
                break;
            case "2":
                fileReader = new FileReader(fileRoom);
                bufferedReader = new BufferedReader(fileReader);
                ArrayList<Room> listRoom = new ArrayList<Room>();
                while ((record = bufferedReader.readLine()) != null) {
                    Room temp = createRoomObjFromArray(SystemService.toStringArray(record));
                    listRoom.add(temp);
                }
                System.out.println(listRoom);
                bufferedReader.close();
                System.out.println("Nhao Loai Room:");
                customer.setInputService(scanner.nextLine());
                addRoomUser(listRoom, customer);
                break;
            case "3":
                fileReader = new FileReader(fileHouse);
                bufferedReader = new BufferedReader(fileReader);
                List<House> listHouse = new ArrayList<House>();
                while ((record = bufferedReader.readLine()) != null) {
                    House temp = createHouseObjFromArray(SystemService.toStringArray(record));
                    listHouse.add(temp);
                }
                System.out.println(listHouse);
                bufferedReader.close();
                System.out.println("Nhao Loai Room:");
                customer.setInputService(scanner.nextLine());
                addHouseUser(listHouse, customer);
                break;
        }


        String text = (customer.getName() + customer.getBirthday() + customer.getGender() + customer.getIdNumber() + customer.getPhoneNumber() + customer.getCustomerType() + customer.getAddress() + customer.getUseService());
        bufferedWriter.write(text);
        bufferedWriter.close();
    }

    public void showInformationCustomer() throws IOException{
        fileReader = new FileReader(fileCustomer);
        bufferedReader = new BufferedReader(fileReader);
        ArrayList<Customer> list = new ArrayList<Customer>();
        int count = 0;
        while ((record = bufferedReader.readLine()) != null){
            String[] array = record.split(",");
        }

    }

    public void addNewBooking() throws IOException{
        fileReader = new FileReader(fileCustomer);
        bufferedReader = new BufferedReader(fileReader);
        ArrayList<Customer> list = new ArrayList<Customer>();
        int count = 0;
        while ((record = bufferedReader.readLine()) != null){
            String[] array = record.split(",");
            count++;
            Customer temp = createCustomerObjFromArray(array,count);
            temp.setUseService(array[7]);




        }

    }
private Customer createCustomerObjFromArray(String[] array,int id){
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(array[0]);
        customer.setBirthday(array[1]);
        customer.setGender(array[2]);
        customer.setIdNumber(array[3]);
        customer.setPhoneNumber(array[4]);
        customer.setCustomerType(array[5]);
        customer.setAddress(array[6]);

}
    private Room createRoomObjFromArray(String[] record) {
        Room room = new Room();
        room.setId(record[0]);
        room.setServiceName(record[1]);
        room.setServiceArea(Double.parseDouble(record[2]));
        room.setServicePrice(Double.parseDouble(record[3]));
        room.setServiceMaxPeople(Integer.parseInt(record[4]));
        room.setServiceRentType(record[5]);
        room.setServicesFree(record[6]);
        return room;
    }

    private void addVillaUser(List<Villa> list, Customer customer) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == customer.getInputService()) {
                customer.setUseService(list.get(i));
                System.out.println("Them Thanh Cong!");
                break;
            }
            if (i == list.size() - 1) {
                System.out.println("Ban Nhap Sai Id");
                break;
            }
        }
    }

    private Villa createVillaObjFromArray(String[] record) {
        Villa villa = new Villa();
        villa.setId(record[0]);
        villa.setServiceName(record[1]);
        villa.setServiceArea(Double.parseDouble(record[2]));
        villa.setServicePrice(Double.parseDouble(record[3]));
        villa.setServiceMaxPeople(Integer.parseInt(record[4]));
        villa.setServiceRentType(record[5]);
        villa.setTypeService(record[6]);
        villa.setServicesRoom(record[7]);
        villa.setAreaPool(Double.parseDouble(record[8]));
        villa.setNumberFloor(Integer.parseInt(record[9]));
        return villa;
    }

    private void addRoomUser(List<Room> listRoom, Customer customer) {
        for (int i = 0; i < listRoom.size(); i++) {
            if (listRoom.get(i).getId() == customer.getInputService()) {
                customer.setUseService(listRoom.get(i));
                System.out.println("Them Thanh Cong!");
                break;
            }
            if (i == listRoom.size() - 1) {
                System.out.println("Ban Nhap Sai Id");
                break;
            }
        }
    }

    private House createHouseObjFromArray(String[] record) {
        House house = new House();
        house.setId(record[0]);
        house.setServiceName(record[1]);
        house.setServiceArea(Double.parseDouble(record[2]));
        house.setServicePrice(Double.parseDouble(record[3]));
        house.setServiceMaxPeople(Integer.parseInt(record[4]));
        house.setServiceRentType(record[5]);
        house.setTypeService(record[6]);
        house.setServiceRoom(record[7]);
        house.setNumberFloor(Integer.parseInt(record[8]));
        return house;
    }

    private void addHouseUser(List<House> listHouse, Customer customer) {
        for (int i = 0; i < listHouse.size(); i++) {
            if (listHouse.get(i).getId() == customer.getInputService()) {
                customer.setUseService(listHouse.get(i));
                System.out.println("Them Thanh Cong!");
                break;
            }
            if (i == listHouse.size() - 1) {
                System.out.println("Ban Nhap Sai Id");
                break;
            }
        }
    }

    public static String[] toStringArray(String e){
        String[] string = e.split(",");
        return string;
    }
}
