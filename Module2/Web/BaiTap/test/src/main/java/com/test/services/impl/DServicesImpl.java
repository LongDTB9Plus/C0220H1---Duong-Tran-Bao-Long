//package com.test.services.impl;
//
//import com.test.repository.DRepository;
//import com.test.services.DefaultServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class DServicesImpl implements DefaultServices {
//    @Autowired
//    DRepository dRepository;
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

//    Tinh tuoi tu ngay sinh
//LocalDate today = LocalDate.now();                          //Today's date
//    LocalDate birthday = LocalDate.of(1959,8, 04);  //Birth date
//
//    Period p = Period.between(birthday, today);
//        System.out.println(p.getYears());
//}
