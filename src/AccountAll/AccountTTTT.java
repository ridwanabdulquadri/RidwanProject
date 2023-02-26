package AccountAll;

public class AccountTTTT {
    public String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public int age;

    public void setAge(int age) {
        this.age = age;
    }
}
