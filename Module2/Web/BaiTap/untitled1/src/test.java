import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.time.Period;

public class test {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday = LocalDate.of(1959,8, 04);  //Birth date

        Period p = Period.between(birthday, today);
        System.out.println(p.getYears());
    }
}
