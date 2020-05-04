package CaseStudy.Controller;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainController extends SystemService {
    Scanner scanner = new Scanner(System.in);

    public MainController() throws IOException {
    }

    void displayMainMenu() throws IOException, CsvValidationException {
        boolean loopMain = true;
        while (loopMain) {
            System.out.println("Main Menu:\n" +
                    "1: Add New Service\n" +
                    "2: Show Services\n" +
                    "3: Add New Customer\n" +
                    "4: Show Information Of Customer\n" +
                    "5: Add New Booking\n" +
                    "6: Show Information Of Employee\n" +
                    "7: Exit");
            this.choiceMain = scanner.nextInt();
            switch (this.choiceMain) {
                case 1:
                    this.addNewService();
                    break;
                case 2:
                    this.showService();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    loopMain = false;
                    break;
                default:
            }
        }
    }

    public static void main(String[] args) throws IOException, CsvValidationException {
        MainController console = new MainController();
        console.displayMainMenu();
    }
}
