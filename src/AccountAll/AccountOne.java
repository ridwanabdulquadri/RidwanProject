package AccountAll;

public class AccountOne {
    private String name;
    private double balance;


    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public double getBalance(){
        return balance;
    }
}
