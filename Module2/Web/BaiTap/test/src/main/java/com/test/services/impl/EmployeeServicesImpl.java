package com.test.services.impl;

import com.test.entity.Employee;
import com.test.repository.EmployeeRepository;
import com.test.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeServicesImpl implements EmployeeServices {
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> searchByKey(String keyword) {
        Integer idToSearch = Integer.parseInt(keyword);
        return employeeRepository.findAllByIdEqualsOrBirthDayContainingOrIdNumberContaining(idToSearch,keyword,keyword);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<String> getListType() {
        List<String> listTypeEmployee = new ArrayList<>();
        listTypeEmployee.add("Quản Trị Hệ Thống");
        listTypeEmployee.add("Quản Trị Nhân Sự");
        listTypeEmployee.add("Quản Lý Phòng");
        listTypeEmployee.add("Quản Trị Dịch Vụ");
        return listTypeEmployee;
    }
}
//Email
//    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$",
//            message = "Email không được bắt đầu bằng số và không chứa kí tự đặc biệt.")

//    Custom Validate
//    if (!(khachHang.phoneNumber.matches("((^|, )(090|091|\\(84\\)\\+|\\(84\\)\\+))+[0-9]{7}$"))) {
//        errors.rejectValue("phoneNumber", "KhachHang.phoneNumber");
//    }
//        if(!(khachHang.cmnd.matches("^((\\d{9})|(\\d{12}))$"))){
//        errors.rejectValue("cmnd","KhachHang.cmnd");
//    }
//        if (!(khachHang.code.matches("^(KH-)[0-9]{4}$"))){
//        errors.rejectValue("code","KhachHang.code");
//    }

//
//}
