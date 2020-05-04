package CaseStudy.Controller;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NameException extends Exception {
    public NameException() {
        super("Ten Khach Hang Phai In Hoa Ky Tu Dau Tien");
        final Pattern NAME_PATTERN = Pattern.compile("^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$");
        final Pattern ID_PATTERN = Pattern.compile("^[0-9]{3}(\\s[0-9]{3}){2}$");
        final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z]\\w{2,}[@]\\w{3}[.]\\w{3}");
    }

    public boolean isValidGender(String gender) {
        String genderAllLower = gender.toLowerCase();
        if ((genderAllLower.equals("male")) || (genderAllLower.equals("female")) || (genderAllLower.equals("unknow"))) {
            return true;
        } else return false;
    }


    public static void main(String[] args) {
    }
}

