package CaseStudy.Controller.Exception;

public class EmailException extends Exception {
    public EmailException() {
        System.out.println("Email phải đúng định dạng abc@abc.abc");
    }
}
