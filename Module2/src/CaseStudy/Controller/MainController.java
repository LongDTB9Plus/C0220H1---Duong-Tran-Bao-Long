package CaseStudy.Controller;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainController {
    private int choiceMain;
    private String serviceInformation = "";
    Scanner scanner = new Scanner(System.in);

    void displayMainMenu() throws IOException {
        boolean loopMain = true;
        while (loopMain) {
            System.out.println("Main Menu:\n" +
                    "1: Add New Service\n" +
                    "2: Show Services\n" +
                    "3: Add New Customer\n" +
                    "4: Show Information Of Customer\n" +
                    "5: Add New Booking\n" +
                    "6: Show Information Of Employee\n" +
                    "7: Exit");
            this.choiceMain = scanner.nextInt();
            switch (this.choiceMain) {
                case 1:
                    this.addNewService();
                    break;
                case 2:
                    this.showService();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    loopMain = false;
                    break;
                default:
            }
        }
    }

    private void addNewService() throws IOException {
        boolean loopNewService = true;
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter writer = null;
        while (loopNewService) {
            System.out.println("1: Add New Villa\n" +
                    "2: Add New House\n" +
                    "3: Add New Room\n" +
                    "4: Back To Main Menu\n" +
                    "5: Exit ");
            int choice = scanner.nextInt();
            String name;
            double serviceArea;
            double servicePrice;
            int maxPeople;
            String rentType;
            String serviceType;
            String serviceRoom;
            double poolArea;
            int numberFloor;
            String serviceFree;
            switch (choice) {
                case 1:
                    file = addVilla(file);
                    break;
                case 2:
                    file = addRoom(file);
                    break;
                case 3:
                    file = addHouse(file);
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

    private File addHouse(File file) throws IOException {
        String name;
        double serviceArea;
        double servicePrice;
        int maxPeople;
        String rentType;
        String serviceType;
        String serviceRoom;
        int numberFloor;
        FileWriter fileWriter;
        BufferedWriter writer;
        House house = new House();
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
        if (file == null) {
            file = new File("C:\\Users\\Alex\\Downloads\\Codegym\\Module2\\src\\CaseStudy\\data\\house.csv");
        }
        fileWriter = new FileWriter(file, true);
        writer = new BufferedWriter(fileWriter);
        serviceInformation += house.getServiceName() + "," + house.getServiceArea() +
                "," + house.getServicePrice() + "," + house.getServiceMaxPeople() +
                "," + house.getServiceRentType() + "," + house.getTypeService() +
                "," + house.getServiceRoom() + "," + house.getNumberFloor();
        writer.write(serviceInformation);
        writer.newLine();
        writer.close();
        return file;
    }

    private File addRoom(File file) throws IOException {
        String name;
        double serviceArea;
        double servicePrice;
        int maxPeople;
        String rentType;
        String serviceFree;
        FileWriter fileWriter;
        BufferedWriter writer;
        Room room = new Room();
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

        if (file == null) {
            file = new File("C:\\Users\\Alex\\Downloads\\Codegym\\Module2\\src\\CaseStudy\\data\\room.csv");
        }
        fileWriter = new FileWriter(file, true);
        writer = new BufferedWriter(fileWriter);
        serviceInformation += room.getServiceName() + "," + room.getServiceArea() +
                "," + room.getServicePrice() + "," + room.getServiceMaxPeople() +
                "," + room.getServiceRentType() + "," + room.getServicesFree();

        writer.write(serviceInformation);
        writer.close();
        return file;
    }

    private File addVilla(File file) throws IOException {
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
        if (file == null) {
            file = new File("C:\\Users\\Alex\\Downloads\\Codegym\\Module2\\src\\CaseStudy\\data\\villa.csv");
        }
        fileWriter = new FileWriter(file, true);
        writer = new BufferedWriter(fileWriter);
        serviceInformation = villa.getId() + "," + villa.getServiceName() + "," + villa.getServiceArea() +
                "," + villa.getServicePrice() + "," + villa.getServiceMaxPeople() +
                "," + villa.getServiceRentType() + "," + villa.getTypeService() +
                "," + villa.getServicesRoom() + "," + villa.getAreaPool() +
                "," + villa.getNumberFloor();
        writer.write(serviceInformation);
        writer.newLine();
        writer.close();
        return file;
    }

    private void showService() throws IOException {
        boolean loopShowService = true;
        BufferedReader bufferedReader = null;
        String line = null;
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
                    bufferedReader = new BufferedReader(
                            new FileReader("C:/Users/Alex/Downloads/Codegym/Module2/src/CaseStudy/data/villa.csv"));
                    while ((line = bufferedReader.readLine()) != null) {
                        ArrayList<String> listVilla = new ArrayList<String>(Arrays.asList(line.split(",")));
                        createObjVilla(listVilla);
                    }
                    bufferedReader.close();
                    break;
                case 2:
                    bufferedReader = new BufferedReader(
                            new FileReader("C:/Users/Alex/Downloads/Codegym/Module2/src/CaseStudy/data/house.csv"));
                    while ((line = bufferedReader.readLine()) != null) {
                        ArrayList<String> listHouse = new ArrayList<>(Arrays.asList(line.split(",")));
                        createObjHouse(listHouse);
                    }
                    bufferedReader.close();
                    break;
                case 3:
                    bufferedReader = new BufferedReader(
                            new FileReader("C:/Users/Alex/Downloads/Codegym/Module2/src/CaseStudy/data/room.csv"));
                    while ((line = bufferedReader.readLine()) != null) {
                        ArrayList<String> listRoom = new ArrayList<>(Arrays.asList(line.split(",")));
                        createObjRoom(listRoom);
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

    private void createObjRoom(ArrayList<String> listRoom) {
        Room room = new Room();
        room.setId(listRoom.get(0));
        room.setServiceName(listRoom.get(1));
        room.setServiceArea(Double.parseDouble(listRoom.get(2)));
        room.setServicePrice(Double.parseDouble(listRoom.get(3)));
        room.setServiceMaxPeople(Integer.parseInt(listRoom.get(4)));
        room.setServiceRentType(listRoom.get(5));
        room.setServicesFree(listRoom.get(6));
        System.out.println(room.showInfo());
    }

    private void createObjHouse(ArrayList<String> listHouse) {
        House house = new House();
        house.setId(listHouse.get(0));
        house.setServiceName(listHouse.get(1));
        house.setServiceArea(Double.parseDouble(listHouse.get(2)));
        house.setServicePrice(Double.parseDouble(listHouse.get(3)));
        house.setServiceMaxPeople(Integer.parseInt(listHouse.get(4)));
        house.setServiceRentType(listHouse.get(5));
        house.setTypeService(listHouse.get(6));
        house.setServiceRoom(listHouse.get(7));
        house.setNumberFloor(Integer.parseInt(listHouse.get(8)));
        System.out.println(house.showInfo());
    }

    private void createObjVilla(ArrayList<String> listVilla) {
        Villa villa = new Villa();
        villa.setId(listVilla.get(0));
        villa.setServiceName(listVilla.get(1));
        villa.setServiceArea(Double.parseDouble(listVilla.get(2)));
        villa.setServicePrice(Double.parseDouble(listVilla.get(3)));
        villa.setServiceMaxPeople(Integer.parseInt(listVilla.get(4)));
        villa.setServiceRentType(listVilla.get(5));
        villa.setTypeService(listVilla.get(6));
        villa.setServicesRoom(listVilla.get(7));
        villa.setAreaPool(Double.parseDouble(listVilla.get(8)));
        villa.setNumberFloor(Integer.parseInt(listVilla.get(9)));
        System.out.println(villa.showInfo());
    }

    public static void main(String[] args) throws IOException {
        MainController console = new MainController();
        console.displayMainMenu();
    }
}
