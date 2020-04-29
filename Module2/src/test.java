import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^([S][V]{2}[Ll])-[0-9]{4}$");
        Pattern pattern1 = Pattern.compile("^[A-Z]+[A-Za-z]+$");
        Pattern pattern2 = Pattern.compile("^[0-9]+[0-9]+$");
        Pattern pattern3 = Pattern.compile("^[01]?[0-9]$");
        Pattern pattern4 = Pattern.compile("^(([Mm][a][s]*[a][g][e])|([Kk][a][r][a][o][k][e])|([Ff][o]{2}[d])|([Dd][r][i][n][k])|([Cc][a][r]))$");
        Pattern pattern5 = Pattern.compile("");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        System.out.println(year);
        System.out.println(day);
        System.out.println(month);

    }
}
