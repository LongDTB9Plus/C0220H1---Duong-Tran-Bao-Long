package CaseStudy.Models;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import jdk.jfr.events.FileReadEvent;

import java.io.*;
import java.util.*;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String customerType;
    private String address;
    private Services useService;
    private String inputService;

    public String getInputService() {
        return inputService;
    }

    public void setInputService(String inputService) {
        this.inputService = inputService;
    }

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




    public static void main(String[] args) throws IOException {
        Customer john = new Customer();
    }
}
