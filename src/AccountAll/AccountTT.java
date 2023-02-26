package AccountAll;

public class AccountTT {
    private String name;

    public void setName(String name) {

        this.name = name;
    }
    private double balance;

    public String getName(){

        return name;
    }

    public void deposit(double amount) {

        balance = balance + amount;
    }

    public double getBalance() {

        return balance;
    }


    public void withdraw(double amount) {

        balance = balance - amount;
    }
}
