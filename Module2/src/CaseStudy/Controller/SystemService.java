package CaseStudy.Controller;

import CaseStudy.Controller.Comparator.NameComparator;
import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import CaseStudy.Models.Employee;

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
    static final File fileBooking = new File(filePath + "/src/CaseStudy/data/booking.csv");
    static final File fileEmployee = new File(filePath + "/src/CaseStudy/data/employee.csv");
    static public final String LINE_SEPARATOR = "------------------------------------------------------------";
    FileWriter fileWriter = null;
    BufferedReader bufferedReader = null;
    Reader fileReader = null;
    BufferedWriter bufferedWriter = null;

    public SystemService() {
    }

    //Task 2:
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
        fileWriter = new FileWriter(fileHouse, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(house.tostring());
        bufferedWriter.close();
        return true;
    }

    public boolean addRoom() throws IOException {
        scanner = new Scanner(System.in);
        Room room = new Room();
        System.out.println("Nhap ID:");
        room.setId(scanner.nextLine());
        System.out.println("Nhap Ten Dich Vu");
        room.setServiceName(scanner.next());
        System.out.println("Nhap Dien Tich Su Dung");
        room.setServiceArea(scanner.nextDouble());
        System.out.println("Gia Thue");
        room.setServicePrice(scanner.nextDouble());
        System.out.println("So Nguoi O Toi Da");
        room.setServiceMaxPeople(scanner.nextInt());
        System.out.println("Kieu Thue");
        room.setServiceRentType(scanner.next());
        System.out.println("Tieu Chuan Phong");
        room.setServicesFree(scanner.next());
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

    //Task 3:
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
                    "8: Exit\n" + LINE_SEPARATOR);
            int showChoice = scanner.nextInt();
            switch (showChoice) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    treeSetVilla();
                    break;
                case 5:
                    treeSetHouse();
                    break;
                case 6:
                    treeSetRoom();
                    break;
                case 8:
                    this.choiceMain = 7;
                case 7:
                    loopShowService = false;
                    break;
                default:
                    System.out.println("Failed!");
            }
        }
    }

    private void showAllRoom() throws IOException {
        fileReader = new FileReader(fileRoom);
        bufferedReader = new BufferedReader(fileReader);
        while ((record = bufferedReader.readLine()) != null) {
            createRoomObjFromArray(SystemService.toStringArray(record)).showInfo();
            System.out.println(LINE_SEPARATOR);
        }
        bufferedReader.close();
    }

    private void showAllHouse() throws IOException {
        fileReader = new FileReader(fileHouse);
        bufferedReader = new BufferedReader(fileReader);
        while ((record = bufferedReader.readLine()) != null) {
            createHouseObjFromArray(SystemService.toStringArray(record)).showInfo();
            System.out.println(LINE_SEPARATOR);
        }
        bufferedReader.close();
    }

    private void showAllVilla() throws IOException {
        fileReader = new FileReader(fileVilla);
        bufferedReader = new BufferedReader(fileReader);
        while ((record = bufferedReader.readLine()) != null) {
            createVillaObjFromArray(SystemService.toStringArray(record)).showInfo();
            System.out.println(LINE_SEPARATOR);
        }
        bufferedReader.close();
    }

    //Task 8:
    private void treeSetVilla() throws IOException {
        fileReader = new FileReader(fileVilla);
        bufferedReader = new BufferedReader(fileReader);
        TreeSet<String> treeSetNameVilla = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        while ((record = bufferedReader.readLine()) != null) {
            Villa temp = createVillaObjFromArray(toStringArray(record));
            treeSetNameVilla.add(temp.getServiceName());
        }
        System.out.println(treeSetNameVilla);
    }

    private void treeSetHouse() throws IOException {
        fileReader = new FileReader(fileHouse);
        bufferedReader = new BufferedReader(fileReader);
        TreeSet<String> treeSetNameHouse = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        while ((record = bufferedReader.readLine()) != null) {
            House temp = createHouseObjFromArray(toStringArray(record));
            treeSetNameHouse.add(temp.getServiceName());
        }
        System.out.println(treeSetNameHouse);
    }

    private void treeSetRoom() throws IOException {
        fileReader = new FileReader(fileRoom);
        bufferedReader = new BufferedReader(fileReader);
        TreeSet<String> treeSetNameRoom = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        while ((record = bufferedReader.readLine()) != null) {
            Room temp = createRoomObjFromArray(toStringArray(record));
            treeSetNameRoom.add(temp.getServiceName());
        }
        System.out.println(treeSetNameRoom);
    }

    //Task 5:
    public void addNewCustomer() throws Exception, IOException {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        String input;
        fileWriter = new FileWriter(fileCustomer, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        System.out.println("Nhap Ten Khach Hang:");
        input = scanner.nextLine();
        while (!customer.setName(input)) {
            input = scanner.nextLine();
            continue;
        }
        System.out.println("Nhap Ngay Sinh:");
        input = scanner.nextLine();
        while (!customer.setBirthday(input)) {
            input = scanner.nextLine();
            continue;
        }
        System.out.println("Nhap Gioi Tinh");
        input = scanner.nextLine();
        while (!customer.setGender(input)) {
            input = scanner.nextLine();
            continue;
        }
        System.out.println("Nhap So CMND:");
        while (!customer.setIdNumber(scanner.nextLine())) {
            continue;
        }
        System.out.println("Nhap So Dien Thoai:");
        customer.setPhoneNumber(scanner.nextLine());
        System.out.println("Nhap Loai Khach Hang:");
        customer.setCustomerType(scanner.nextLine());
        System.out.println("Nhap Dia Chi:");
        customer.setAddress(scanner.nextLine());
        String text = customer.tostring();
        bufferedWriter.append(text);
        bufferedWriter.close();
    }

    //Task 6:
    public void showInformationCustomer() throws IOException {
        scanner = new Scanner(System.in);
        fileReader = new FileReader(fileCustomer);
        bufferedReader = new BufferedReader(fileReader);
        ArrayList<Customer> list = new ArrayList<Customer>();
        int count = 0;
        while ((record = bufferedReader.readLine()) != null) {
            String[] array = record.split(",");
            count++;
            Customer temp = createCustomerObjFromArray(array, count);
            list.add(temp);
        }
        Collections.sort(list,new NameComparator());
        for (Customer e : list){
            e.showInfo();
            System.out.println(LINE_SEPARATOR);
        }

    }

    //Task 7:
    public void addNewBooking() throws IOException {
        scanner = new Scanner(System.in);
        fileReader = new FileReader(fileCustomer);
        bufferedReader = new BufferedReader(fileReader);
        ArrayList<Customer> list = new ArrayList<Customer>();
        int count = 0;
        while ((record = bufferedReader.readLine()) != null) {
            String[] array = record.split(",");
            count++;
            Customer temp = createCustomerObjFromArray(array, count);
            list.add(temp);
            System.out.printf("STT : %d\tName: %s\n", count, temp.getName());
            System.out.println(LINE_SEPARATOR);
        }
        System.out.println("Xin Nhap Ten Khach Hang :");
        String inputNameChoose = scanner.next();
        Customer customer = new Customer();
        for (Customer choose : list) {
            if (choose.getName().equals(inputNameChoose)) {
                customer = choose;
            }
        }
        fileReader.close();
        bufferedReader.close();
        String serviceChoice;
        boolean loopServiceChoice = true;
        scanner = new Scanner(System.in);
        while (loopServiceChoice) {
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
                    for (Villa search : listVilla) {
                        System.out.println(search.getId());
                    }
                    bufferedReader.close();
                    System.out.println("Nhap ID Loai Villa:");
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
                    for (Room search : listRoom) {
                        System.out.println(search.getId());
                    }
                    bufferedReader.close();
                    System.out.println("Nhap ID Loai Room:");
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
                    for (House search : listHouse) {
                        System.out.println(search.getId());
                    }
                    bufferedReader.close();
                    System.out.println("Nhap ID Loai Room:");
                    customer.setInputService(scanner.nextLine());
                    addHouseUser(listHouse, customer);
                    break;
                case "5":
                    this.choiceMain = 7;
                case "4":
                    loopServiceChoice = false;
                    break;
                default:
                    System.out.println("Failed!");
                    break;


            }

        }
    }

    //Task 9:
    public void showInformationEmployee() throws IOException {
        fileReader = new FileReader(fileEmployee);
        bufferedReader = new BufferedReader(fileReader);
        HashMap<Integer, Employee> mapEmployee = new HashMap<>();
        int i = 0;
        while ((record = bufferedReader.readLine()) != null) {
            i++;
            Employee temp = createEmpObjFromArray(toStringArray(record));
            mapEmployee.put(i, temp);
        }
//        Show Map
        for (Map.Entry<Integer, Employee> entry : mapEmployee.entrySet()) {
            System.out.println(entry.getKey() + "\n" + LINE_SEPARATOR + "\n" + entry.getValue().toString()
                    + "\n" + LINE_SEPARATOR + "\n");

        }
    }

    //    Function Ho Tro:
    private Customer createCustomerObjFromArray(String[] array, int id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(array[0]);
        customer.setBirthday(array[1]);
        customer.setGender(array[2]);
        customer.setIdNumber(array[3]);
        customer.setPhoneNumber(array[4]);
        customer.setCustomerType(array[5]);
        customer.setAddress(array[6]);
        return customer;
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

    private void addVillaUser(List<Villa> list, Customer customer) throws IOException {
        fileWriter = new FileWriter(fileBooking);
        bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(customer.getInputService())) {
                customer.setUseService(list.get(i));
                System.out.println("Them Thanh Cong!");
                record = customer.tostring();
                bufferedWriter.append(record);
                record = customer.useService.tostring();
                bufferedWriter.append(",");
                bufferedWriter.append(record);
                bufferedWriter.append("\n");
                break;
            }
            if (i == list.size() - 1) {
                System.out.println("Ban Nhap Sai Id");
                break;
            }
        }
        bufferedWriter.close();
        fileWriter.close();
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

    private void addRoomUser(List<Room> listRoom, Customer customer) throws IOException {
        fileWriter = new FileWriter(fileBooking);
        bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < listRoom.size(); i++) {
            if (listRoom.get(i).getId() == customer.getInputService()) {
                customer.setUseService(listRoom.get(i));
                System.out.println("Them Thanh Cong!");
                record = customer.tostring();
                bufferedWriter.append(record);
                record = customer.useService.tostring();
                bufferedWriter.append(",");
                bufferedWriter.append(record);
                bufferedWriter.append("\n");
                break;
            }
            if (i == listRoom.size() - 1) {
                System.out.println("Ban Nhap Sai Id");
                break;
            }
        }
        bufferedWriter.close();
        fileWriter.close();
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

    private void addHouseUser(List<House> listHouse, Customer customer) throws IOException {
        fileWriter = new FileWriter(fileBooking);
        bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < listHouse.size(); i++) {
            if (listHouse.get(i).getId() == customer.getInputService()) {
                customer.setUseService(listHouse.get(i));
                System.out.println("Them Thanh Cong!");
                record = customer.tostring();
                bufferedWriter.append(record);
                record = customer.useService.tostring();
                bufferedWriter.append(",");
                bufferedWriter.append(record);
                bufferedWriter.append("\n");
                break;
            }
            if (i == listHouse.size() - 1) {
                System.out.println("Ban Nhap Sai Id");
                break;
            }
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    private Employee createEmpObjFromArray(String[] record) {
        Employee employee = new Employee();
        employee.setName(record[0]);
        employee.setAge(record[1]);
        employee.setAddress(record[2]);
        return employee;
    }

    public static String[] toStringArray(String in) {
        String[] string = in.split(",");
        return string;
    }
//
}

