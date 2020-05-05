package CaseStudy.data;

import CaseStudy.Controller.SystemService;
import CaseStudy.Models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Cabinet {
    public Cabinet(){}

    public static Stack<Employee> getListEmployee() throws IOException {
        String record;
        FileReader fileReader = new FileReader(SystemService.fileEmployee);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stack<Employee> employeeStack = new Stack<>();
        while ((record = bufferedReader.readLine()) != null){
          Employee temp =  SystemService.createEmpObjFromArray(SystemService.toStringArray(record));
          employeeStack.push(temp);
        }
        return employeeStack;
    }
}
