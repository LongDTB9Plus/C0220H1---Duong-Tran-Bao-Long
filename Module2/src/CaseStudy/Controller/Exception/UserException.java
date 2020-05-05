package CaseStudy.Controller.Exception;

import java.util.Calendar;
import java.util.regex.Pattern;

public class UserException {
    static final Pattern NAME_PATTERN = Pattern.compile("^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$");
    static Pattern ID_PATTERN = Pattern.compile("^[0-9]{3}(\\s[0-9]{3}){2}$");
    static Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z]\\w{2,}[@]\\w{3}[.]\\w{3}");
    static final Pattern VALID_DATE = Pattern.compile("^(([012][0-9]+)|([3][0-1]))[/](([0]?[0-9])|([1][0-2]))[/][12][0-9]{3}$");
    static boolean matcher;


    static public boolean isValidName(String name) throws NameException {
        matcher = NAME_PATTERN.matcher(name).matches();
        if (!matcher) {
            throw new NameException();
        } else return true;
    }

    static public boolean isValidGender(String gender) throws GenderException {
        String genderAllLower = gender.toLowerCase();
        if ((genderAllLower.equals("male")) || (genderAllLower.equals("female")) || (genderAllLower.equals("unknow"))) {
            return true;
        } else throw new GenderException();
    }

    static public boolean isValidEmail(String email) throws EmailException {
        matcher = EMAIL_PATTERN.matcher(email).matches();
        if (!matcher) {
            throw new EmailException();
        } else return true;
    }

    static public boolean isValidIdCard(String id) throws IdCardException {
        matcher = ID_PATTERN.matcher(id).matches();
        if (!matcher) {
            throw new IdCardException();
        } else return true;
    }

    static public boolean isValidBirthDay(String day) throws BirthdayException {
        matcher = VALID_DATE.matcher(day).matches();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Integer yearTest = Integer.valueOf(day.substring(6));
        if ((!matcher) ||(yearTest <= 1900) || ((year - Integer.parseInt(String.valueOf(yearTest))) < 18)){
            throw new BirthdayException();
        }else return true;
    }
}

