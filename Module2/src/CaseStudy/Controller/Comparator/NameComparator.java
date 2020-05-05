package CaseStudy.Controller.Comparator;

import CaseStudy.Models.Customer;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        int compare = o1.getName().compareTo(o2.getName());
        if (compare == 0){
            AgeComparator ageComparator = new AgeComparator();
            return ageComparator.compare(o1,o2);
        }
        return compare ;
    }
}
