package Collection.BaiTap;

import java.util.*;

public class QueueBank {
    static int priorityNumber = 0;
    static ArrayDeque<Integer> customerQueue = new ArrayDeque<>();
    static ArrayList<String> customerList = new ArrayList<>();
    static TreeMap<Integer,String> tempCustomer = new TreeMap<>();
    {
        customerList.add("001");
        customerList.add("002");
        customerList.add("003");
        customerList.add("004");
    }

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
                if (customerQueue.isEmpty()){
                    priorityNumber = 0;
                }
                System.out.println("Input Customer Code:");
                scanner = new Scanner(System.in);
                String code = scanner.nextLine();
                for (String number:customerList
                     ) {
                    if (customerList.contains(code)){
                        code = number;
                        break;
                    }
                    code = "New Customer";
                }
                customerQueue.add(priorityNumber);
                tempCustomer.put(priorityNumber,code);
                System.out.printf("Welcome Customer Code:  %s\nYour Queue Number;  %d\n",code,priorityNumber);
                priorityNumber++;
                break;
            case "2":
                int tempCode = customerQueue.poll();
                System.out.printf("Queue Number Next:%d\nCustomer Code: %s\n",tempCode,tempCustomer.get(tempCode));
                tempCustomer.remove(tempCode);
                break;
            case "3":
                int tempCodeLast = customerQueue.pollLast();
                System.out.printf("Queue Number Last:%d\nCustomer Code: %s\n",tempCodeLast,tempCustomer.get(tempCodeLast));
                tempCustomer.remove(tempCodeLast);
                break;
            case "0":
            default:
                loop = false;
        }
        }
    }
}
