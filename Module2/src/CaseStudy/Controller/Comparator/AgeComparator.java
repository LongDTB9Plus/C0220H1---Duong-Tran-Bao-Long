package CaseStudy.Controller.Comparator;

import CaseStudy.Models.Customer;

import java.util.Comparator;

public class AgeComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        int year1 = Integer.parseInt(o1.getBirthday().substring(6));
        int year2 = Integer.parseInt(o2.getBirthday().substring(6));
        if (year1 == year2){
            return 0;
        }else if (year1 > year2){
            return -1;
        }else return 1;
    }
}
