package CaseStudy.Controller.Exception;

public class IdCardException extends Exception {
    IdCardException() {
        System.out.println("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
    }
}
