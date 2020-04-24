package CaseStudy.Controller;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.io.*;
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
                    fileWriter = new FileWriter(file,true);
                    writer = new BufferedWriter(fileWriter);
                    serviceInformation = villa.getId() +","+ villa.getServiceName() + "," + villa.getServiceArea() +
                            "," + villa.getServicePrice() + "," + villa.getServiceMaxPeople() +
                            "," + villa.getServiceRentType() + "," + villa.getTypeService() +
                            "," + villa.getServicesRoom() + "," + villa.getAreaPool() +
                            "," + villa.getNumberFloor();
                    writer.write(serviceInformation);
                    writer.newLine();
                    writer.close();
                    break;
                case 2:
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
                    fileWriter = new FileWriter(file,true);
                    writer = new BufferedWriter(fileWriter);
                    serviceInformation += room.getServiceName() + "," + room.getServiceArea() +
                            "," + room.getServicePrice() + "," + room.getServiceMaxPeople() +
                            "," + room.getServiceRentType() + "," + room.getServicesFree();

                    writer.write(serviceInformation);
                    writer.close();
                    break;
                case 3:
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
                    fileWriter = new FileWriter(file,true);
                    writer = new BufferedWriter(fileWriter);
                    serviceInformation += house.getServiceName() + "," + house.getServiceArea() +
                            "," + house.getServicePrice() + "," + house.getServiceMaxPeople() +
                            "," + house.getServiceRentType() + "," + house.getTypeService() +
                            "," + house.getServiceRoom() + "," + house.getNumberFloor();
                    writer.write(serviceInformation);
                    writer.newLine();
                    writer.close();
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

    private void showService() throws IOException {
        boolean loopShowService = true;
        BufferedReader bufferedReader = null;
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
                    String line = null;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                    bufferedReader.close();
                    break;
                case 2:
                    break;
                case 3:
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

    public static void main(String[] args) throws IOException {
        MainController console = new MainController();
        console.displayMainMenu();
    }
}
