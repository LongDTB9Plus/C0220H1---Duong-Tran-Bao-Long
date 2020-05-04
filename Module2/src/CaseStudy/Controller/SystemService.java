package CaseStudy.Controller;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.*;

public class SystemService {
    protected int choiceMain;
    Scanner scanner = new Scanner(System.in);
    String[] record;
    static String filePath = new File("").getAbsolutePath();
    static final File fileVilla = new File(filePath + "/Module2/src/CaseStudy/data/villa.csv");
    static final File fileHouse = new File(filePath + "/Module2/src/CaseStudy/data/house.csv");
    static final File fileRoom = new File(filePath + "/Module2/src/CaseStudy/data/room.csv");
    static final File fileCustomer = new File(filePath + "/Module2/src/CaseStudy/data/customer.csv");
    FileWriter fileWriter = null;
    CSVWriter csvWriter = null;
    Reader fileReader = null;
    CSVReader csvReader = null;

    public SystemService() throws IOException {
    }

    protected void addNewService() throws IOException {
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

    protected boolean addHouse() throws IOException {
        String id;
        String name;
        double serviceArea;
        double servicePrice;
        int maxPeople;
        String rentType;
        String serviceType;
        String serviceRoom;
        int numberFloor;
        House house = new House();
        System.out.println("Nhap ID:");
        id = scanner.nextLine();
        house.setId(id);
        System.out.println("Nhap Ten Dich Vu");
        name = scanner.next();
        house.setServiceName(name);
        System.out.println("Nhap Dien Tich Su Dung");
        serviceArea = scanner.nextDouble();
        house.setServiceArea(serviceArea);
        System.out.println("Gia Thue");
        servicePrice = scanner.nextDouble();
        house.setServicePrice(servicePrice);
        System.out.println("So Nguoi O Toi Da");
        maxPeople = scanner.nextInt();
        house.setServiceMaxPeople(maxPeople);
        System.out.println("Kieu Thue");
        rentType = scanner.next();
        house.setServiceRentType(rentType);
        System.out.println("Tieu Chuan Phong");
        serviceType = scanner.next();
        house.setTypeService(serviceType);
        System.out.println("Tien Nghi Khac");
        serviceRoom = scanner.next();
        house.setServiceRoom(serviceRoom);
        System.out.println("So Tang");
        numberFloor = scanner.nextInt();
        house.setNumberFloor(numberFloor);
        fileWriter = new FileWriter(fileVilla, true);
        csvWriter = new CSVWriter(fileWriter);
        ArrayList<House> listHouse = new ArrayList<House>();
        listHouse.add(house);
        for (int i = 0; i < listHouse.size(); i++) {
            record[i] = String.valueOf(listHouse.get(i));
        }
        csvWriter.writeNext(record);
        listHouse.clear();
        csvWriter.close();
        return true;
    }

    protected boolean addRoom() throws IOException {
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
        csvWriter = new CSVWriter(fileWriter);
        ArrayList<Room> listRoom = new ArrayList<Room>();
        listRoom.add(room);
        for (int i = 0; i < listRoom.size(); i++) {
            record[i] = String.valueOf(listRoom.get(i));
        }
        csvWriter.writeNext(record);
        listRoom.clear();
        csvWriter.close();
        return true;
    }

    protected boolean addVilla() throws IOException {
        String id;
        String name;
        double serviceArea;
        double servicePrice;
        int maxPeople;
        String rentType;
        String serviceType;
        String serviceRoom;
        double poolArea;
        int numberFloor;
        FileWriter fileWriter;
        BufferedWriter writer;
        Villa villa = new Villa();
        System.out.println("Nhap ID");
        id = scanner.nextLine();
        villa.setId(id);
        System.out.println("Nhap Ten Dich Vu");
        name = scanner.next();
        villa.setServiceName(name);
        System.out.println("Nhap Dien Tich Su Dung");
        serviceArea = scanner.nextDouble();
        villa.setServiceArea(serviceArea);
        System.out.println("Gia Thue");
        servicePrice = scanner.nextDouble();
        villa.setServicePrice(servicePrice);
        System.out.println("So Nguoi O Toi Da");
        maxPeople = scanner.nextInt();
        villa.setServiceMaxPeople(maxPeople);
        System.out.println("Kieu Thue");
        rentType = scanner.next();
        villa.setServiceRentType(rentType);
        System.out.println("Tieu Chuan Phong");
        serviceType = scanner.next();
        villa.setTypeService(serviceType);
        System.out.println("Tien Nghi Khac");
        serviceRoom = scanner.next();
        villa.setServicesRoom(serviceRoom);
        System.out.println("Dien Tich Ho Boi");
        poolArea = scanner.nextDouble();
        villa.setAreaPool(poolArea);
        System.out.println("So Tang");
        numberFloor = scanner.nextInt();
        villa.setNumberFloor(numberFloor);
        fileWriter = new FileWriter(fileVilla, true);
        csvWriter = new CSVWriter(fileWriter);
        ArrayList<Villa> listVilla = new ArrayList<>();
        listVilla.add(villa);
        for (int i = 0; i < listVilla.size(); i++) {
            record[i] = String.valueOf(listVilla.get(i));
        }
        csvWriter.writeNext(record);
        listVilla.clear();
        csvWriter.close();
        return true;
    }

    protected void showService() throws IOException, CsvValidationException {
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
                    csvReader = new CSVReader(fileReader);
                    while ((record = csvReader.readNext()) != null){
                        createVillaObjFromArray(record).showInfo();
                    }
                    csvReader.close();
                    break;
                case 2:
                    fileReader = new FileReader(fileHouse);
                    csvReader = new CSVReader(fileReader);
                    while ((record = csvReader.readNext()) != null){
                        createHouseObjFromArray(record).showInfo();
                    }
                    csvReader.close();
                    break;
                case 3:
                    fileReader = new FileReader(fileRoom);
                    csvReader = new CSVReader(fileReader);
                    while ((record = csvReader.readNext()) != null){
                        createRoomObjFromArray(record).showInfo();
                    }
                    csvReader.close();
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

    public void addNewCustomer() throws IOException, CsvValidationException {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        String serviceChoice;

        System.out.println("Nhap Ten Khach Hang:");
        customer.setName(scanner.nextLine());
        System.out.println("Nhap Ngay Sinh:");
        customer.setBirthday(scanner.nextLine());
        System.out.println("Nhap Gioi Tinh");
        customer.setGender(scanner.nextLine());
        System.out.println("Nhap So CMND:");
        customer.setIdNumber(scanner.nextLine());
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
                csvReader = new CSVReader(fileReader);
                ArrayList<Villa> listVilla = new ArrayList<>();
                while ((record = csvReader.readNext()) != null) {
                    Villa temp = createVillaObjFromArray(record);
                    temp.showInfo();
                    listVilla.add(temp);
                }
                System.out.println(listVilla);
                csvReader.close();
                System.out.println("Nhao Loai Villa:");
                customer.setInputService(scanner.nextLine());
                addVillaUser(listVilla, customer);
                break;
            case "2":
                fileReader = new FileReader(fileRoom);
                csvReader = new CSVReader(fileReader);
                ArrayList<Room> listRoom = new ArrayList<Room>();
                while ((record = csvReader.readNext()) != null) {
                    Room temp = createRoomObjFromArray(record);
                    temp.showInfo();
                    listRoom.add(temp);
                }
                System.out.println(listRoom);
                csvReader.close();
                System.out.println("Nhao Loai Room:");
                customer.setInputService(scanner.nextLine());
                addRoomUser(listRoom, customer);
                break;
            case "3":
                fileReader = new FileReader(fileHouse);
                csvReader = new CSVReader(fileReader);
                List<House> listHouse = new ArrayList<House>();
                while ((record = csvReader.readNext()) != null) {
                    House temp = createHouseObjFromArray(record);
                    temp.showInfo();
                    listHouse.add(temp);
                }
                System.out.println(listHouse);
                csvReader.close();
                System.out.println("Nhao Loai Room:");
                customer.setInputService(scanner.nextLine());
                addHouseUser(listHouse, customer);
                break;
        }


        String[] text = {customer.getName(), customer.getBirthday(), customer.getGender(), customer.getIdNumber(), customer.getPhoneNumber(), customer.getIdNumber(), customer.getCustomerType(), customer.getAddress(), String.valueOf(customer.getUseService())};
        csvWriter.writeNext(text);
        csvWriter.close();
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
}
