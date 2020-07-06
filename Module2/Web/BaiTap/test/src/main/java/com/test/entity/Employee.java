package com.test.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "employee")
public class Employee implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "This field are not alow to Empty")
    private String typeEmployee;
    @NotEmpty(message = "This field are not alow to Empty")
    private String name;
    @NotEmpty(message = "This field are not alow to Empty")
    private String birthDay;
    @NotEmpty(message = "This field are not alow to Empty")
    private String gender;
    @NotEmpty(message = "This field are not alow to Empty")
    private String phoneNumber;
    @NotEmpty(message = "This field are not alow to Empty")
    private String idNumber;
    @NotEmpty(message = "This field are not alow to Empty")
    private String email;
    @NotEmpty(message = "This field are not alow to Empty")
    private String address;

    public Employee() {
    }

    public Employee(@NotNull String typeEmployee, @NotNull String name, String birthDay, String gender,
                    String phoneNumber, String idNumber, String email, String address) {
        this.typeEmployee = typeEmployee;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.idNumber = idNumber;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        if (!(employee.email.matches("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$"))) {
            errors.rejectValue("email", "Employee.email");
        }
        if (!(employee.idNumber.matches("^\\d{10}$"))) {
            errors.rejectValue("idNumber", "Employee.idNumber");
        }
//        Tinh tuoi tu ngay sinh
        LocalDate today = LocalDate.now();                          //Today's date
        String[] birthDayArray = employee.birthDay.split("-");
        LocalDate birthday = LocalDate.of(Integer.parseInt(birthDayArray[0]), Integer.parseInt(birthDayArray[1]),
                Integer.parseInt(birthDayArray[2]));
        Period period = Period.between(birthday, today);
        if (period.getYears() < 18){
            errors.rejectValue("birthDay","Employee.age");
        }

    }
}
