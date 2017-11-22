import java.util.ArrayList;

public class CustomerManager {
    private ArrayList <Customer>arrayList = new ArrayList<Customer>();

    public int addCustomer(String name,double balance) {
        Customer customer = new Customer(name,balance);    
        arrayList.add(customer);
        return customer.getId();
    }
    public ArrayList<Customer> showAllCustomer(){
    
    	return arrayList;
    }
    public Customer getCustomer(int id) {
        for(Customer cust  : arrayList) {
            if(id == cust.getId()) {
                return cust;
            }
        }
        return null;
    }
    public String deposit(int id,double amount) {
        for(Customer cust  : arrayList) {
            if(id == cust.getId()) {
                cust.setBalance(amount + cust.getBalance());    
                return "Deposit Successful"; 
            }
        }
        return "Deposit UnSuccessful";
    }
    public String withdraw(int id,double amount) {
        for(Customer cust  : arrayList) {
            if(id == cust.getId()) {
                if((cust.getBalance() - amount)>=1000){
                cust.setBalance(cust.getBalance() - amount);    
                return "Withdraw Successful\n total balance is"+cust.getBalance(); 
            }
                else{
                    return "insufficiant funds";
                    }
                }
        }
        return "Withdraw UnSuccessful";
    }
    //public String transfer(int id,double amount,int acno){
        
        
        
    //}
}