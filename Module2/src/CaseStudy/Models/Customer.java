package CaseStudy.Models;

import CaseStudy.Controller.Exception.*;

import java.io.*;

public class Customer {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String birthday;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String customerType;
    private String address;
    public Services useService;
    private String inputService;

    public Customer() {
    }

    public Customer(int id,
                    String name,
                    String birthday,
                    String gender,
                    String idNumber,
                    String phoneNumber,
                    String customerType,
                    String address,
                    Services useService,
                    String inputService) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
        this.address = address;
        this.useService = useService;
        this.inputService = inputService;
    }

    public String getInputService() {
        return inputService;
    }

    public void setInputService(String inputService) {
        this.inputService = inputService;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        try {
            UserException.isValidName(name);
        } catch (NameException e) {
            return false;
        }
        this.name = name;
        return true;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean setBirthday(String birthday) {
        try {
            UserException.isValidBirthDay(birthday);
        } catch (BirthdayException e) {
            return false;
        }
        this.birthday = birthday;
        return true;
    }

    public String getGender() {
        return gender;
    }

    public boolean setGender(String gender) {
        try {
            UserException.isValidGender(gender);
        } catch (GenderException e) {
            return false;
        }
        this.gender = gender;
        return true;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public boolean setIdNumber(String idNumber) {
        try {
            UserException.isValidIdCard(idNumber);

        } catch (IdCardException e) {
            return false;
        }
        this.idNumber = idNumber;
        return true;
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

    public String tostring(){
        return (this.name + "," +
                this.birthday + "," +
                this.gender + "," +
                this.idNumber + "," +
                this.phoneNumber + "," +
                this.customerType + "," +
                this.address
                );

    }
}
