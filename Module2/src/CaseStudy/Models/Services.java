package CaseStudy.Models;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;
import com.opencsv.bean.CsvBindByPosition;

public abstract class Services {
    @CsvBindByPosition(position = 0)
    String id;
    @CsvBindByPosition(position = 1)
    String serviceName;
    @CsvBindByPosition(position = 2)
    double serviceArea;
    @CsvBindByPosition(position = 3)
    double servicePrice;
    @CsvBindByPosition(position = 4)
    int serviceMaxPeople;
    @CsvBindByPosition(position = 5)
    String serviceRentType;
    Scanner scanner = new Scanner(System.in);
    public final Pattern VILLA_ID = Pattern.compile("^([S][V]{2}[L])-[0-9]{4}$");
    public final Pattern HOUSE_ID = Pattern.compile("^([S][V][H][O])-[0-9]{4}$");
    public final Pattern ROOM_ID = Pattern.compile("^([S][V][R][O])-[0-9]{4}$");
    public  final Pattern VALID_STRING = Pattern.compile("^[A-Z]+[A-Za-z0-9]+$");
    public final Pattern VALID_AREA = Pattern.compile("^[3-9][0-9]+[.]*[0-9]*$");
    public  final Pattern VALID_NUMBER = Pattern.compile("^[0-9]+[0-9]*[.]?[0-9]*$");
    public  final Pattern VALID_PEOPLE = Pattern.compile("^[01]?[0-9]$");
    public  final Pattern VALID_ROOM_SERVICES = Pattern.compile("^(([Mm][a][s]{2}[a][g][e])|([Kk][a][r][a][o][k][e])|([Ff][o]{2}[d])|([Dd][r][i][n][k])|([Cc][a][r]))$");
    boolean matcher;

    {
        Boolean.parseBoolean(null);
        matcher = false;
    }

    public Services(String id, String serviceName, double serviceArea, double servicePrice, int serviceMaxPeople, String serviceRentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.servicePrice = servicePrice;
        this.serviceMaxPeople = serviceMaxPeople;
        this.serviceRentType = serviceRentType;
    }

    public Services() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        matcher = VALID_STRING.matcher(serviceName).matches();
        while (!matcher) {
            System.out.println("Phai Viet Hoa Chu Cai Dau Tien:");
            serviceName = scanner.nextLine();
            matcher = VALID_STRING.matcher(serviceName).matches();
        }
        this.serviceName = serviceName;
    }

    public double getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(double serviceArea) {
        matcher = VALID_AREA.matcher(String.valueOf(serviceArea)).matches();
        while (!matcher) {
            System.out.println("Dien Tich Khong Hop Le:");
            serviceArea = scanner.nextDouble();
            matcher = VALID_AREA.matcher(String.valueOf(serviceArea)).matches();
        }
        this.serviceArea = serviceArea;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int serviceMaxPeople) {
        matcher = VALID_PEOPLE.matcher(String.valueOf(serviceMaxPeople)).matches();
        while (!matcher) {
            System.out.println("Dien Tich Khong Hop Le:");
            serviceMaxPeople = scanner.nextInt();
            matcher = VALID_PEOPLE.matcher(String.valueOf(serviceMaxPeople)).matches();
        }
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        matcher = VALID_NUMBER.matcher(String.valueOf(servicePrice)).matches();
        while (!matcher) {
            System.out.println("Dien Tich Khong Hop Le:");
            servicePrice = scanner.nextDouble();
            matcher = VALID_NUMBER.matcher(String.valueOf(servicePrice)).matches();
        }
        this.servicePrice = servicePrice;
    }

    public String getServiceRentType() {
        return serviceRentType;
    }

    public void setServiceRentType(String serviceRentType) {
        matcher = VALID_STRING.matcher(serviceName).matches();
        while (!matcher) {
            System.out.println("Phai Viet Hoa Chu Cai Dau Tien:");
            serviceRentType = scanner.nextLine();
            matcher = VALID_STRING.matcher(serviceRentType).matches();
        }
        this.serviceRentType = serviceRentType;
    }

    abstract String tostring();
    abstract String showInfo();

}
