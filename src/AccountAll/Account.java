package AccountAll;

public class Account {
    private String name;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public double getBalance(){
        return balance;
    }


}
