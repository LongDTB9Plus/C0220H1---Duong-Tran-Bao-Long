package com.test.controllers;

import com.test.entity.Employee;
import com.test.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeServices employeeServices;

    @GetMapping("/list")
    public String getList(Model model){
        model.addAttribute("listEmployee",employeeServices.findAll());
        return "list";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam Integer id,Model model){
        employeeServices.remove(id);
        model.addAttribute("message","Deleted Successfully!");
        return "list";
    }

    @GetMapping("/search-by-key")
    public String searchByKey(@RequestParam("keyword") String keyword,Model model){
        if (!(keyword.isEmpty())) {
            if (keyword.matches("^[0-9]+$")) {
                List<Employee> foundList = employeeServices.searchByKey(keyword);
                if (foundList.isEmpty()) {
                    model.addAttribute("message", "Not Found!");
                }
                model.addAttribute("listEmployee",foundList);
                return "list";
            }
        }
        return "list";
    }
    @GetMapping("/add-employee")
    public String addEmployeeGet(Model model){
        model.addAttribute("Employee",new Employee());
        model.addAttribute("listType",employeeServices.getListType());
        return "create";
    }
    @PostMapping("/add-employee")
    public String addEmployeePost(@Valid @ModelAttribute("Employee") Employee employee,
                                  BindingResult result,Model model){
        new Employee().validate(employee,result);
        if (result.hasFieldErrors()){
            model.addAttribute("listType",employeeServices.getListType());
            return "create";
        }
        employeeServices.save(employee);
        model.addAttribute("message","Created Successfully!");
        return "list";
    }
}
