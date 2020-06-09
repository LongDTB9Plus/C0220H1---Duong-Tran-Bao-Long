package Collection.BaiTap;

import java.util.*;

public class QueueBank {
    static TreeMap<Integer, String> tempCustomer = new TreeMap<Integer, String>();

    public static void main(String[] args) {
        boolean loop = true;
        while (loop){
        System.out.printf("Menu\n0.End Service\n" +
                "1.Add Customer To Queue\n" +
                "2.Call Next Customer\n" +
                "3.Call Last Customer\n");
        Scanner scanner = new Scanner(System.in);
        String service = scanner.nextLine();
        switch (service) {
            case "1":
                System.out.println("Input Customer Code:");
                scanner = new Scanner(System.in);
                String code = scanner.nextLine();
                System.out.println("Input Customer Priority Number:");
                scanner = new Scanner(System.in);
                int priorityNumber = scanner.nextInt();
                tempCustomer.put(priorityNumber,code);
                System.out.printf("Welcome Customer Code:  %s\nYour Queue Number;  %d\n",code,priorityNumber);
                break;
            case "2":
                NavigableSet<Integer> customerQueue = tempCustomer.navigableKeySet();
                if (customerQueue.isEmpty()){
                    System.out.println("0");
                    break;
                }
                int orderAsc =  customerQueue.first();
                System.out.printf("Queue Number First:%d\nCustomer Code:%s",orderAsc,tempCustomer.get(orderAsc));
                tempCustomer.remove(orderAsc);
                break;
            case "3":
                NavigableSet<Integer> customerQueueDesc = tempCustomer.descendingKeySet();
                if (customerQueueDesc.isEmpty()){
                    System.out.println("0");
                    break;
                }
                int orderDesc =  customerQueueDesc.first();
                System.out.printf("Queue Number First:%d\nCustomer Code:%s",orderDesc,tempCustomer.get(orderDesc));
                tempCustomer.remove(orderDesc);
                break;
            case "0":
            default:
                loop = false;
        }
        }
    }
}