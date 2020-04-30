package CaseStudy.Models;

import com.opencsv.CSVWriter;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String customerType;
    private String address;
    private Services useService;
    String filePath = new File("").getAbsolutePath();
    File file = new File("C:\\Users\\Alex\\Downloads\\CodeGym\\C0220H1---Duong-Tran-Bao-Long\\Module2\\src\\CaseStudy\\data");
     final String[] FILE_HEADER = {"id", "code", "name"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUseService() {
        return useService;
    }

    public void setUseService(Services useService) {
        this.useService = useService;
    }

    public void addNewCustomer() throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter(file);
        CSVWriter csvWriter = new CSVWriter(fileWriter, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
        System.out.println("Nhap Ten Khach Hang:");
        this.setName(scanner.nextLine());
        System.out.println("Nhap Ngay Sinh:");
        this.setBirthday(scanner.nextLine());
        System.out.println("Nhap Gioi Tinh");
        this.setGender(scanner.nextLine());
        System.out.println("Nhap So CMND:");
        this.setIdNumber(scanner.nextLine());
        System.out.println("Nhap So Dien Thoai:");
        this.setPhoneNumber(scanner.nextLine());
        System.out.println("Nhap Loai Khach Hang:");
        this.setCustomerType(scanner.nextLine());
        System.out.println("Nhap Dia Chi:");
        this.setAddress(scanner.nextLine());
        System.out.println("Nhap Loai Dich Vu:");
        String abc = scanner.nextLine();
        String[] text = {this.getName() , this.getBirthday() , this.getGender() , this.getIdNumber() , this.getPhoneNumber() , this.getIdNumber() , this.getCustomerType() , this.getAddress() , String.valueOf(this.getUseService())};
        csvWriter.writeNext(text);
        csvWriter.close();
    }


    public static void main(String[] args) throws IOException {
        Customer john = new Customer();
        john.addNewCustomer();
    }
}
