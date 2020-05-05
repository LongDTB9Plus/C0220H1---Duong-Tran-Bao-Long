package CaseStudy.Controller;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class MainController extends SystemService {
    public MainController() throws IOException {
    }

    void displayMainMenu() throws IOException,Exception {
        Scanner scanner = new Scanner(System.in);
        boolean loopMain = true;
        while (loopMain) {
            System.out.println("Main Menu:\n" +
                    "1: Add New Service\n" +
                    "2: Show Services\n" +
                    "3: Add New Customer\n" +
                    "4: Show Information Of Customer\n" +
                    "5: Add New Booking\n" +
                    "6: Show Information Of Employee\n" +
                    "7: Exit\n" + LINE_SEPARATOR);
            this.choiceMain = scanner.nextInt();
            switch (this.choiceMain) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    break;
                case 7:
                    loopMain = false;
                    break;
                default:
                    System.out.println("Failed!");
            }
        }
    }

    public static void main(String[] args) throws IOException,Exception {
        MainController console = new MainController();
        console.displayMainMenu();
    }
}
