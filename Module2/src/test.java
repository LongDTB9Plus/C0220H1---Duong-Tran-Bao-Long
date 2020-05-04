import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class test {
    int count = 0;

    public boolean testLoop() {
        System.out.println("FALSE");
        this.count++;
        return count == 5;
    }


    public static void main(String[] args) {
        test i = new test();
        while (!i.testLoop()){
            continue;
        }
    }
}