import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {        
        int id, choice;
        String name,result;
        double balance,amount;
        CustomerManager customerManager = new CustomerManager();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. ADD CUSTOMER");
            System.out.println("2. SHOW CUSTOMER");
            System.out.println("3. SHOW ALL CUSTOMERS");
            System.out.println("4. DEPOSITS");
            System.out.println("5. WITHDRAW");
            System.out.println("6. TRANSFERS");
            System.out.println("7. E X I T");        
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice) {
            case 1 : System.out.println("Enter your name :");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter your balance :");
            balance = sc.nextDouble();
            id = customerManager.addCustomer(name,balance);
            System.out.println("Customer Added Successfully with Id.."+id);
            break;
            case 2 : System.out.println("Enter your id :");
            id = sc.nextInt();
            Customer cust = customerManager.getCustomer(id);
            if(cust!=null)
                System.out.println(cust);
            else
                System.out.println("Record not found");
            break;
            case 3:
            	System.out.println(customerManager.showAllCustomer());
            	break;
            case 4: System.out.println("Enter id to deposit :");
            id = sc.nextInt();
            System.out.println("Enter amount to deposit :");
            amount = sc.nextDouble();
            result = customerManager.deposit(id, amount);
            System.out.println(result);
            break;
            case 5: 
            System.out.println("Enter id to withdraw :");
            id = sc.nextInt();
            System.out.println("Enter amount to withdraw :");
            amount = sc.nextDouble();
            result = customerManager.deposit(id, amount);
            System.out.println(result);
            break;    
            case 6 : 
            }
        } while(choice!=7);
    }
}