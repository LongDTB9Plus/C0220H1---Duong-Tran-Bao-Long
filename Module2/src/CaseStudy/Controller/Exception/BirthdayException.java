package CaseStudy.Controller.Exception;

public class BirthdayException extends Exception {
    BirthdayException() {
        System.out.println("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
    }
}
